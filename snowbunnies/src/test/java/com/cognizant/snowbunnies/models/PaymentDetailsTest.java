package com.cognizant.snowbunnies.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PaymentDetailsTest {
	
	private PaymentDetail pd;
	private String str;

	@BeforeAll
    public static void setup() {
    }
    
    @BeforeEach
    public void beforeEach() {
    	//long paymentDetailID, long cardNumber, int cvv, CardType cardType, String cardExpiration,
		//String cardServiceProvider
    	pd = new PaymentDetail(332L, 123456789L, 343, CardType.DEBIT_CARD, "08/09/2222", "Mastercard");
    	str = "PaymentDetail [paymentDetailID=" + pd.getPaymentDetailID() + ", cardNumber=" + pd.getCardNumber() + ", cvv=" + pd.getCvv()
    	+ ", cardType=" + pd.getCardType() + ", cardExpiration=" + pd.getCardExpiration() + ", cardServiceProvider="
    	+ pd.getCardServiceProvider() + "]";
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
    
    @Test
    void whenDefaultConstructor_thenNoErrors() {   
    	PaymentDetail payment = new PaymentDetail();

    }
    
    @Test
    void whenValidExpiration_thenNoErrors() {
    	pd.setCardExpiration("08/30/2300");
    	assertEquals(332L, pd.getPaymentDetailID());
    	assertEquals(CardType.DEBIT_CARD, pd.getCardType());
    	assertEquals("Mastercard", pd.getCardServiceProvider());
    	assertEquals(123456789L, pd.getCardNumber());
    	assertEquals(343, pd.getCvv());
    	assertEquals("08/30/2300", pd.getCardExpiration());
    }
    
    
    @Test
    void whenValidNumber_thenNoErrors() {
    	pd.setCardNumber(999);
    	assertEquals(332L, pd.getPaymentDetailID());
    	assertEquals(CardType.DEBIT_CARD, pd.getCardType());
    	assertEquals("Mastercard", pd.getCardServiceProvider());
    	assertEquals(999L, pd.getCardNumber());
    	assertEquals(343, pd.getCvv());
    	assertEquals("08/09/2222", pd.getCardExpiration());
    }
    
    
    @Test
    void whenValidProvider_thenNoErrors() {
    	pd.setCardServiceProvider("Visa");
    	assertEquals(332L, pd.getPaymentDetailID());
    	assertEquals(CardType.DEBIT_CARD, pd.getCardType());
    	assertEquals("Visa", pd.getCardServiceProvider());
    	assertEquals(123456789L, pd.getCardNumber());
    	assertEquals(343, pd.getCvv());
    	assertEquals("08/09/2222", pd.getCardExpiration());
    }
    
    
    @Test
    void whenValidCardType_thenNoErrors() {
    	pd.setCardType(CardType.CREDIT_CARD);
    	assertEquals(332L, pd.getPaymentDetailID());
    	assertEquals(CardType.CREDIT_CARD, pd.getCardType());
    	assertEquals("Mastercard", pd.getCardServiceProvider());
    	assertEquals(123456789L, pd.getCardNumber());
    	assertEquals(343, pd.getCvv());
    	assertEquals("08/09/2222", pd.getCardExpiration());
    }
    
    
    @Test
    void whenValidCvv_thenNoErrors() {
    	pd.setCvv(111);
    	assertEquals(332L, pd.getPaymentDetailID());
    	assertEquals(CardType.DEBIT_CARD, pd.getCardType());
    	assertEquals("Mastercard", pd.getCardServiceProvider());
    	assertEquals(123456789L, pd.getCardNumber());
    	assertEquals(111, pd.getCvv());
    	assertEquals("08/09/2222", pd.getCardExpiration());
    }
    
    
    @Test
    void whenValidID_thenNoErrors() {
    	pd.setPaymentDetailID(8989L);
    	assertEquals(8989L, pd.getPaymentDetailID());
    	assertEquals(CardType.DEBIT_CARD, pd.getCardType());
    	assertEquals("Mastercard", pd.getCardServiceProvider());
    	assertEquals(123456789L, pd.getCardNumber());
    	assertEquals(343, pd.getCvv());
    	assertEquals("08/09/2222", pd.getCardExpiration());
    }
    
    @Test
    void whenValidToString_thenNoErrors() {
    	assertEquals(332L, pd.getPaymentDetailID());
    	assertEquals(CardType.DEBIT_CARD, pd.getCardType());
    	assertEquals("Mastercard", pd.getCardServiceProvider());
    	assertEquals(123456789L, pd.getCardNumber());
    	assertEquals(343, pd.getCvv());
    	assertEquals("08/09/2222", pd.getCardExpiration());
    	assertEquals(str, pd.toString());
    }
	
}