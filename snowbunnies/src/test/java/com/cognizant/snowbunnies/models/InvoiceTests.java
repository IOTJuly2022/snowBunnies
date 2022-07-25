package com.cognizant.snowbunnies.models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class InvoiceTests {
	
	private Invoice i;
	private final String PHONE_NUMBER = "123-456-7890";

	@BeforeAll
    public static void setup() {
    }
    
    @BeforeEach
    public void beforeEach() {
    	i = new Invoice(1L, 2L, PHONE_NUMBER, 3L, 4L, 5L);
    	i.setInvoiceID(123L);
    }
   
    
    @Test
    void whenValidConstructor_thenNoErrors() {
    	assertEquals(123L, i.getInvoiceID());
    	assertEquals(2L, i.getCartID());
    	assertEquals(1L, i.getUserID());
    	assertEquals(PHONE_NUMBER, i.getPhoneNumber());
    	assertEquals(3L, i.getBillingDetailID());
    	assertEquals(4L, i.getDeliveryDetailID());
    	assertEquals(5L, i.getPaymentDetailID());
    }
}
