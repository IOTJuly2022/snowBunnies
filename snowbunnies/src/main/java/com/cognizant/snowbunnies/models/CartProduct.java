package com.cognizant.snowbunnies.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity()
@Table(name = "cartProduct")
public class CartProduct {

	@Id
	@Column(nullable = false, unique = true)
	private long cardProductID;
	
	@Column(nullable = false)
	private long cartId;
	
	@Column(nullable = false)
	private long productId;
	
	
	
	public CartProduct() {
		super();
	}

	public CartProduct(long cartId, long productId) {
		super();
		this.cartId = cartId;
		this.productId = productId;
	}

	public CartProduct(long cardProductID, long cartId, long productId) {
		super();
		this.cardProductID = cardProductID;
		this.cartId = cartId;
		this.productId = productId;
	}

	public long getCartId() {
		return cartId;
	}
	
	public void setCartId(long cartId) {
		this.cartId = cartId;
	}
	
	public long getProductId() {
		return productId;
	}
	
	public void setProductId(long productId) {
		this.productId = productId;
	}
	
	public void setCartProductId(long cartProductId) {
		this.cardProductID = cartProductId;
	}
	
	public long getCartProductId() {
		return this.cardProductID;
	}
}
