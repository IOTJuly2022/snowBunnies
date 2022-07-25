package com.cognizant.snowbunnies.models;

enum ProductType {
	FRUITS,
	MEAT,
	FROZEN_FOODS,
	VEGETABLES,
	DAIRY,
	SNACKS,
	BAKERY;
}

@Entity
@Table(name = "product")
public class Product {
	
	@Id
	@Column(nullable = false, unique = true)
	private long productID;
	
	@Column(nullable = false)
	private String name;
	
	@column(nullable = false)
	private ProductType productType;
	
	public Product(String name, long productID, ProductType productType) {
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
	
	public long getProductID() {
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
