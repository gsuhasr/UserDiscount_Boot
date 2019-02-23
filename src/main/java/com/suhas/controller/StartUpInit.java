package com.suhas.controller;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.suhas.dto.Customer;
import com.suhas.dto.CustomerType;
import com.suhas.dto.Product;
import com.suhas.util.DiscountCalculator;

@Component
public class StartUpInit {
	
	
  @Autowired
  DiscountCalculator dc;
  @PostConstruct
  public void init(){
     
	  for (CustomerType custType : CustomerType.values()) {

			List<Product> products =dc.getProducts();

			Customer c = new Customer("1", "suhas", custType, products);

			System.out.println("final bill for customer type  " + custType + ":" + dc.getFinalBill(c));
		}
	  
	  
  }
}