package com.suhas.dto;

public class Product {
	
	private String id;
	private String name;
	private String description;
	private ProductType productType;
	private double price;
	
	
	
	
	public Product(String id, String name, String description, ProductType productType, double price) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.productType = productType;
		this.price = price;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public ProductType getProductType() {
		return productType;
	}
	public void setProductType(ProductType productType) {
		this.productType = productType;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	


}
