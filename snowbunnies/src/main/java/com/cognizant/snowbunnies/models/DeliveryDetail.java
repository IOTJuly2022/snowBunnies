package com.cognizant.snowbunnies.models;

import javax.persistence.*;

@Entity
@Table(name = "delivery")

public class DeliveryDetail {
	
	@Id
	@Column(nullable = false, unique = true)
	@GeneratedValue
	private long deliveryDetailID;
	
	@Column(nullable = false)
	private String streetAddress;
	
	@Column(nullable = false)
	private String streetAddressTwo;
	
	@Column(nullable = false)
	private String state;
	
	@Column(nullable = false)
	private String country;
	
	@Column(nullable = false)
	private int zipcode;
	
	@Column(nullable = false)
	private String city;
	
	public DeliveryDetail(long deliveryDetailID, String streetAddress, String streetAddressTwo, String state, String country, int zipcode,
			String city) {
		this.deliveryDetailID = deliveryDetailID;
		this.streetAddress = streetAddress;
		this.streetAddressTwo = streetAddressTwo;
		this.state = state;
		this.country = country;
		this.zipcode = zipcode;
		this.city = city;
	}

	public long getDeliveryDetailID() {
		return deliveryDetailID;
	}

	public void setDeliveryDetailID(long deliveryDetailID) {
		this.deliveryDetailID = deliveryDetailID;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	
	public String getStreetAddressTwo() {
		return streetAddressTwo;
	}


	public void setStreetAddressTwo(String streetAddressTwo) {
		this.streetAddressTwo = streetAddressTwo;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
}
