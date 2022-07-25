package com.cognizant.snowbunnies.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
	
	
	@Id
	@Column(nullable = false, unique = true)
	private String username;
	
	@Column(nullable = false)
	private String password;
	
	@Column(nullable = false)
	private int status;
	
	@Column(nullable = false)
	private Cart userCart;
	
	@Column(nullable = false)
	private PaymentDetail paymentDetails;
	
	@Column(nullable = false)
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
