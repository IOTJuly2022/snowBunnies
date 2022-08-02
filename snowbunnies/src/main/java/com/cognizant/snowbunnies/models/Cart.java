package com.cognizant.snowbunnies.models;

import java.util.Date;

import javax.persistence.*;

/**
 * @author Brenden Taul
 * Model for Cart table
 * 
 * Single constructor for model with attributes being finalized at initialization.
 * Auto generated PK
 * 
 * Total cost can be updated if a refund needs to be made.
 */

@Entity
@Table(name = "cart")
public class Cart {
	
	@Id
	@Column(nullable = false, unique = true)
	@GeneratedValue
	private long cartID;
	
	@Column(nullable = false)
	private long userID;
	
	@Column(nullable = false)
	private double totalCost;
	
	@Temporal(TemporalType.DATE)
	@Column(nullable = false)
	private Date purchaseDate;
	
	public Cart() {
		super();
	}
	
	
	/*
	 * long userID - ID of user making the purchase
	 * double totalCost - total purchase amount in the cart at the time of purchase
	 * String purchaseDate - Date when the merchandise was bought
	 */
	public Cart(long userID, double totalCost, Date purchaseDate) {
		this.userID = userID;
		this.totalCost = totalCost;
		this.purchaseDate = purchaseDate;
	}

	/**
	 * @return the cartID
	 */
	public long getCartID() {
		return cartID;
	}

	/**
	 * @param cartID the cartID to set
	 */
	public void setCartID(long cartID) {
		this.cartID = cartID;
	}

	/**
	 * @return the totalCost
	 */
	public double getTotalCost() {
		return totalCost;
	}

	/**
	 * @param totalCost the totalCost to set
	 */
	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}

	/**
	 * @return the userID
	 */
	public long getUserID() {
		return userID;
	}

	/**
	 * @return the purchaseDate
	 */
	public Date getPurchaseDate() {
		return purchaseDate;
	}
	
	
	
	
	
}
