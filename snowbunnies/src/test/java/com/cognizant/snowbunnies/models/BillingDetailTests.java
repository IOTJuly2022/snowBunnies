package com.cognizant.snowbunnies.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BillingDetailTests {
	
	private BillingDetail bd;

    @BeforeAll
    public static void setup() {
    }
    
    @BeforeEach
    public void beforeEach() {
    	//long deliveryDetailID, String streetAddress, String streetAddressTwo, String state,
		//String country, int zipcode, String city
    	bd = new BillingDetail(1L,"445 Testing St", "NAN", "GA", "USA", 30096, "Atlanta");
    }
   
    
    @Test
    void whenValidConstructor_thenNoErrors() {   
    	assertEquals(1L, bd.getDeliveryDetailID());
    	assertEquals("445 Testing St", bd.getStreetAddress());
    	assertEquals("NAN", bd.getStreetAddressTwo());
    	assertEquals("GA", bd.getState());
    	assertEquals("USA", bd.getCountry());
    	assertEquals("Atlanta", bd.getCity());
    	assertEquals(30096, bd.getZipcode());

    }
    
    @Test
    void whenValidCity_thenNoErrors() {
    	bd.setCity("Duluth");
    	assertEquals(1L, bd.getDeliveryDetailID());
    	assertEquals("445 Testing St", bd.getStreetAddress());
    	assertEquals("NAN", bd.getStreetAddressTwo());
    	assertEquals("GA", bd.getState());
    	assertEquals("USA", bd.getCountry());
    	assertEquals("Duluth", bd.getCity());
    	assertEquals(30096, bd.getZipcode());

    }
    
    @Test
    void whenValidCountry_thenNoErrors() {
    	bd.setCountry("Mexico");
    	assertEquals(1L, bd.getDeliveryDetailID());
    	assertEquals("445 Testing St", bd.getStreetAddress());
    	assertEquals("NAN", bd.getStreetAddressTwo());
    	assertEquals("GA", bd.getState());
    	assertEquals("Mexico", bd.getCountry());
    	assertEquals("Atlanta", bd.getCity());
    	assertEquals(30096, bd.getZipcode());

    }
    
    @Test
    void whenValidState_thenNoErrors() {   
    	bd.setState("IA");
    	assertEquals(1L, bd.getDeliveryDetailID());
    	assertEquals("445 Testing St", bd.getStreetAddress());
    	assertEquals("NAN", bd.getStreetAddressTwo());
    	assertEquals("IA", bd.getState());
    	assertEquals("USA", bd.getCountry());
    	assertEquals("Atlanta", bd.getCity());
    	assertEquals(30096, bd.getZipcode());

    }
    
    @Test
    void whenValidStreet_thenNoErrors() { 
    	bd.setStreetAddress("1515 Testing Dr");
    	assertEquals(1L, bd.getDeliveryDetailID());
    	assertEquals("1515 Testing Dr", bd.getStreetAddress());
    	assertEquals("NAN", bd.getStreetAddressTwo());
    	assertEquals("GA", bd.getState());
    	assertEquals("USA", bd.getCountry());
    	assertEquals("Atlanta", bd.getCity());
    	assertEquals(30096, bd.getZipcode());

    }
    
    @Test
    void whenValidStreetTwo_thenNoErrors() {  
    	bd.setStreetAddressTwo("NAN2");
    	assertEquals(1L, bd.getDeliveryDetailID());
    	assertEquals("445 Testing St", bd.getStreetAddress());
    	assertEquals("NAN2", bd.getStreetAddressTwo());
    	assertEquals("GA", bd.getState());
    	assertEquals("USA", bd.getCountry());
    	assertEquals("Atlanta", bd.getCity());
    	assertEquals(30096, bd.getZipcode());

    }
    
    @Test
    void whenValidZipcode_thenNoErrors() {   
    	bd.setZipcode(11111);
    	assertEquals(1L, bd.getDeliveryDetailID());
    	assertEquals("445 Testing St", bd.getStreetAddress());
    	assertEquals("NAN", bd.getStreetAddressTwo());
    	assertEquals("GA", bd.getState());
    	assertEquals("USA", bd.getCountry());
    	assertEquals("Atlanta", bd.getCity());
    	assertEquals(11111, bd.getZipcode());

    }
    
    @Test
    void whenValidDeliveryID_thenNoErrors() {   
    	bd.setDeliveryDetailID(45L);
    	assertEquals(45L, bd.getDeliveryDetailID());
    	assertEquals("445 Testing St", bd.getStreetAddress());
    	assertEquals("NAN", bd.getStreetAddressTwo());
    	assertEquals("GA", bd.getState());
    	assertEquals("USA", bd.getCountry());
    	assertEquals("Atlanta", bd.getCity());
    	assertEquals(30096, bd.getZipcode());

    }








}
