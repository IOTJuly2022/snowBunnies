package com.cognizant.snowbunnies.models;

import javax.persistence.*;

enum CardType {
	CREDIT_CARD,
	DEBIT_CARD;
}

@Entity
@Table(name = "paymentDetail")
public class PaymentDetail {
	
	@Id
	@Column(nullable = false, unique = true)
	private long paymentDetailID; 
	
	@Column(nullable = false)
	private long cardNumber;  
	
	@Column(nullable = false)
	private int cvv;         
	
	@Column(nullable = false)
	private CardType cardType;
	
	@Column(nullable = false)
	private String cardExpiration;
	
	@Column(nullable = false)
	private String cardServiceProvider;
	
	public PaymentDetail(long paymentDetailID, long cardNumber, int cvv, CardType cardType, String cardExpiration,
			String cardServiceProvider) {
		this.paymentDetailID = paymentDetailID;
		this.cardNumber = cardNumber;
		this.cvv = cvv;
		this.cardType = cardType;
		this.cardExpiration = cardExpiration;
		this.cardServiceProvider = cardServiceProvider;
	}

	public long getPaymentDetailID() {
		return paymentDetailID;
	}
	
	public void setPaymentDetailID(long paymentDetailID) {
		this.paymentDetailID = paymentDetailID;
	}
	
	public long getCardNumber() {
		return cardNumber;
	}
	
	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}
	
	public int getCvv() {
		return cvv;
	}
	
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	
	public CardType getCardType() {
		return cardType;
	}
	
	public void setCardType(CardType cardType) {
		this.cardType = cardType;
	}
	
	public String getCardExpiration() {
		return cardExpiration;
	}
	
	public void setCardExpiration(String cardExpiration) {
		this.cardExpiration = cardExpiration;
	}
	
	public String getCardServiceProvider() {
		return cardServiceProvider;
	}
	
	public void setCardServiceProvider(String cardServiceProvider) {
		this.cardServiceProvider = cardServiceProvider;
	}
}
