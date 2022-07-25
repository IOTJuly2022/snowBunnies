package com.cognizant.snowbunnies.models;

import javax.persistence.*;

/**
 * @author Brenden Taul
 * Model for Invoice table
 * 
 * Single constructor for model with attributes being finalized at initialization.
 * Auto generated PK
 */

@Entity
@Table(name = "invoice")
public class Invoice {
	
	@Id
	@Column(nullable = false, unique = true)
	@GeneratedValue
	private long invoiceID;
	
	@Column(nullable = false)
	private final long userID;
	
	@Column(nullable = false)
	private final long cartID;
	
	@Column(nullable = false)
	private final String phoneNumber;
	
	@Column(nullable = false)
	private final long billingDetailID;
	
	@Column(nullable = false)
	private final long deliveryDetailID;
	
	@Column(nullable = false)
	private final long paymentDetailID;
	
	/*
	 * long userID, cartID, billingID, deliveryID, paymentID - FKs coming from other tables
	 * String phoneNumber - contact phone number for the delivery
	 * 
	 * long invoiceID is auto generated when object is saved to the database
	 * 
	 * Note: might have to save this later
	 * 
	 */
	public Invoice(long userID, long cartID, String phoneNumber, long billingID, long deliveryID, long paymentID) {
		super();
		this.userID = userID;
		this.cartID = cartID;
		this.phoneNumber = phoneNumber;
		this.billingDetailID = billingID;
		this.deliveryDetailID = deliveryID;
		this.paymentDetailID = paymentID;
	}

	/**
	 * @return the invoiceID
	 */
	public long getInvoiceID() {
		return invoiceID;
	}

	/**
	 * @param invoiceID the invoiceID to set
	 */
	public void setInvoiceID(long invoiceID) {
		this.invoiceID = invoiceID;
	}

	/**
	 * @return the userID
	 */
	public long getUserID() {
		return userID;
	}

	/**
	 * @return the cartID
	 */
	public long getCartID() {
		return cartID;
	}

	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @return the billingDetailID
	 */
	public long getBillingDetailID() {
		return billingDetailID;
	}

	/**
	 * @return the deliveryDetailID
	 */
	public long getDeliveryDetailID() {
		return deliveryDetailID;
	}

	/**
	 * @return the paymentDetailID
	 */
	public long getPaymentDetailID() {
		return paymentDetailID;
	}
	
	

}
