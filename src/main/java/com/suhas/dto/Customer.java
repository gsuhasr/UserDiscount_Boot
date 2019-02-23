package com.suhas.dto;

import java.util.List;

public class Customer {
	
	private String id;
	private String name;
	private CustomerType customerType;
	private List<Product> product;
	
	public Customer(String id, String name, CustomerType customerType, List<Product> product) {
		super();
		this.id = id;
		this.name = name;
		this.customerType = customerType;
		this.product = product;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CustomerType getCustomerType() {
		return customerType;
	}

	public void setCustomerType(CustomerType customerType) {
		this.customerType = customerType;
	}

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}
	


}
