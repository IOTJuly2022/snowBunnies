package com.cognizant.snowbunnies.models;

import java.util.ArrayList;
import java.util.List;

public class User {
	
	private String username;
	private String password;
	private int status;
	private Cart userCart;
	private PaymentDetail paymentDetails;
	private List<Invoice> invoiceList;
	
	


	public User() {
		super();
	}

	public User(String username, String password, int status) {
		super();
		this.username = username;
		this.password = password;
		this.status = status;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
//		if(user status > a number or the number theyre trying to set) {
			this.status = status;
//		}
	}

	public Cart getUserCart() {
		return userCart;
	}

	public void setUserCart(Cart userCart) {
		this.userCart = userCart;
	}

	public PaymentDetail getPaymentDetails() {
		return paymentDetails;
	}

	public void setPaymentDetails(PaymentDetail paymentDetails) {
		this.paymentDetails = paymentDetails;
	}

	public List<Invoice> getInvoiceList() {
		return invoiceList;
	}

	public void setInvoiceList(List<Invoice> invoiceList) {
		this.invoiceList = invoiceList;
	}

	public void addInvoice(Invoice inv) {
		if(invoiceList != null) {
			invoiceList.add(inv);
		} else {
			invoiceList = new ArrayList<>();
			invoiceList.add(inv);
		}
	}
	
	
	
	

} //user class
