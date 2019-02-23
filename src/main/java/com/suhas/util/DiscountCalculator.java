package com.suhas.util;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.suhas.dto.Customer;
import com.suhas.dto.Product;
import com.suhas.dto.ProductType;
import com.suhas.rules.AffiliateRuleImpl;
import com.suhas.rules.DiscountRule;
import com.suhas.rules.EmployeeRuleImpl;
import com.suhas.rules.ExisitngRuleImpl;

@Component
public class DiscountCalculator {
	List<DiscountRule> rules = new ArrayList<DiscountRule>();

	public DiscountCalculator() {
		rules.add(new EmployeeRuleImpl());
		rules.add(new ExisitngRuleImpl());
		rules.add(new AffiliateRuleImpl());

	}

	public double CalculateDiscountPercentage(Customer customer) {
		double discount = 0;
		for (DiscountRule rule : rules) {
			discount = Math.max(rule.CalculateCustomerDiscount(customer), discount);
		}
		return discount;
	}

	public double getFinalBill(Customer c) {

		double disc = CalculateDiscountPercentage(c);
		//double actualBill = getActualBill(c.getProduct());
		double groceryBill = getGroceryBill(c.getProduct());
		double othersBill = getOthersBill(c.getProduct());		

		double finalBill = (1 - disc) * othersBill+groceryBill;
		return finalBill;
	}

	public double getActualBill(List<Product> products) {

		double total = products.stream().collect(Collectors.summingDouble(product -> product.getPrice()));

		return total;
	}

	public double getOthersBill(List<Product> products) {

		double total = products.stream().filter(product -> ProductType.OTHERS.equals(product.getProductType()))
				.collect(Collectors.summingDouble(product -> product.getPrice()));

		return total;
	}

	public double getGroceryBill(List<Product> products) {

		double total = products.stream().filter(product -> ProductType.GROCERIES.equals(product.getProductType()))
				.collect(Collectors.summingDouble(product -> product.getPrice()));

		return total;
	}

	public List<Product> getProducts() {
		List<Product> products = new ArrayList<Product>();
		products.add(new Product("1", "lappy", "laptop", ProductType.OTHERS, 10000));
		products.add(new Product("2", "Book", "Investing Methodologies", ProductType.OTHERS, 100));
		products.add(new Product("3", "samsung", "mobile", ProductType.OTHERS, 8000));
		products.add(new Product("4", "Fruits", "Apple", ProductType.GROCERIES, 330));

		return products;
	}
}
