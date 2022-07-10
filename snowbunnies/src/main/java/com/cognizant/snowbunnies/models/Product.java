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
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;	
	}
	
	public int getProductID() {
		return.this.productID
	}
	
	public void setProductID(int productID) {
		this.productID = productID;
	}
	
	public String getProductType() {
		return this.productType
	}
	
	public void setProductType(ProductType productType) {
		this.productType = productType;
	}
	
	public void addProduct() {
		
	}
	
	public void deleteProduct(int productID) {
		
	}
}
