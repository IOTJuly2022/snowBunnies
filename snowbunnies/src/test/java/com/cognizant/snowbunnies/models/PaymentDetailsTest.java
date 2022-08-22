package com.cognizant.snowbunnies.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PaymentDetailsTest {
	
	private PaymentDetail pd;

	@BeforeAll
    public static void setup() {
    }
    
    @BeforeEach
    public void beforeEach() {
    	//long paymentDetailID, long cardNumber, int cvv, CardType cardType, String cardExpiration,
		//String cardServiceProvider
    	pd = new PaymentDetail(332L, 123456789L, 343, CardType.DEBIT_CARD, "08/09/2222", "Mastercard");
    }
   
    
    @Test
    void whenValidConstructor_thenNoErrors() {
    	assertEquals(332L, pd.getPaymentDetailID());
    	assertEquals(CardType.DEBIT_CARD, pd.getCardType());
    	assertEquals("Mastercard", pd.getCardServiceProvider());
    	assertEquals(123456789L, pd.getCardNumber());
    	assertEquals(343, pd.getCvv());
    	assertEquals("08/09/2222", pd.getCardExpiration());
    }
	
}