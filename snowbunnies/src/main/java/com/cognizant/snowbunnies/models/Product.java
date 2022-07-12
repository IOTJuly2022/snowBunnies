package com.cognizant.snowbunnies.models;

public enum ProductType {
	FRUITS,
	MEAT,
	FROZEN_FOODS,
	VEGETABLES,
	DAIRY,
	SNACKS,
	BAKERY;
}

public class Product {
	private String name;
	private int productID;
	private ProductType productType;
	
	public Product(String name, int productID, ProductType productType) {
		this.name = name;
		this.productID = productID;
		this.productType = productType;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getProductID() {
		return productID;
	}
	
	public void setProductID(int productID) {
		this.productID = productID;
	}
	
	public ProductType getProductType() {
		return productType;
	}
	
	public void setProductType(ProductType productType) {
		this.productType = productType;
	}
	
	public void addProduct() {
		
	}
	
	public void deleteProduct(int productID) {
		
	}
}
