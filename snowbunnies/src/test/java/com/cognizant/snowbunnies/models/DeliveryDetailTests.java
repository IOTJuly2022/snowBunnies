package com.cognizant.snowbunnies.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DeliveryDetailTests {
	
	private DeliveryDetail dd;

    @BeforeAll
    public static void setup() {
    }
    
    @BeforeEach
    public void beforeEach() {
    	//long deliveryDetailID, String streetAddress, String streetAddressTwo, String state,
		//String country, int zipcode, String city
    	dd = new DeliveryDetail(1L,"445 Testing St", "NAN", "GA", "USA", 30096, "Atlanta");
    }
   
    
    @Test
    void whenValidConstructor_thenNoErrors() {   
    	assertEquals(1L, dd.getDeliveryDetailID());
    	assertEquals("445 Testing St", dd.getStreetAddress());
    	assertEquals("NAN", dd.getStreetAddressTwo());
    	assertEquals("GA", dd.getState());
    	assertEquals("USA", dd.getCountry());
    	assertEquals("Atlanta", dd.getCity());
    	assertEquals(30096, dd.getZipcode());

    }
    
    @Test
    void whenValidCity_thenNoErrors() {
    	dd.setCity("Duluth");
    	assertEquals(1L, dd.getDeliveryDetailID());
    	assertEquals("445 Testing St", dd.getStreetAddress());
    	assertEquals("NAN", dd.getStreetAddressTwo());
    	assertEquals("GA", dd.getState());
    	assertEquals("USA", dd.getCountry());
    	assertEquals("Duluth", dd.getCity());
    	assertEquals(30096, dd.getZipcode());

    }
    
    @Test
    void whenValidCountry_thenNoErrors() {
    	dd.setCountry("Mexico");
    	assertEquals(1L, dd.getDeliveryDetailID());
    	assertEquals("445 Testing St", dd.getStreetAddress());
    	assertEquals("NAN", dd.getStreetAddressTwo());
    	assertEquals("GA", dd.getState());
    	assertEquals("Mexico", dd.getCountry());
    	assertEquals("Atlanta", dd.getCity());
    	assertEquals(30096, dd.getZipcode());

    }
    
    @Test
    void whenValidState_thenNoErrors() {   
    	dd.setState("IA");
    	assertEquals(1L, dd.getDeliveryDetailID());
    	assertEquals("445 Testing St", dd.getStreetAddress());
    	assertEquals("NAN", dd.getStreetAddressTwo());
    	assertEquals("IA", dd.getState());
    	assertEquals("USA", dd.getCountry());
    	assertEquals("Atlanta", dd.getCity());
    	assertEquals(30096, dd.getZipcode());

    }
    
    @Test
    void whenValidStreet_thenNoErrors() { 
    	dd.setStreetAddress("1515 Testing Dr");
    	assertEquals(1L, dd.getDeliveryDetailID());
    	assertEquals("1515 Testing Dr", dd.getStreetAddress());
    	assertEquals("NAN", dd.getStreetAddressTwo());
    	assertEquals("GA", dd.getState());
    	assertEquals("USA", dd.getCountry());
    	assertEquals("Atlanta", dd.getCity());
    	assertEquals(30096, dd.getZipcode());

    }
    
    @Test
    void whenValidStreetTwo_thenNoErrors() {  
    	dd.setStreetAddressTwo("NAN2");
    	assertEquals(1L, dd.getDeliveryDetailID());
    	assertEquals("445 Testing St", dd.getStreetAddress());
    	assertEquals("NAN2", dd.getStreetAddressTwo());
    	assertEquals("GA", dd.getState());
    	assertEquals("USA", dd.getCountry());
    	assertEquals("Atlanta", dd.getCity());
    	assertEquals(30096, dd.getZipcode());

    }
    
    @Test
    void whenValidZipcode_thenNoErrors() {   
    	dd.setZipcode(11111);
    	assertEquals(1L, dd.getDeliveryDetailID());
    	assertEquals("445 Testing St", dd.getStreetAddress());
    	assertEquals("NAN", dd.getStreetAddressTwo());
    	assertEquals("GA", dd.getState());
    	assertEquals("USA", dd.getCountry());
    	assertEquals("Atlanta", dd.getCity());
    	assertEquals(11111, dd.getZipcode());

    }
    
    @Test
    void whenValidDeliveryID_thenNoErrors() {   
    	dd.setDeliveryDetailID(45L);
    	assertEquals(45L, dd.getDeliveryDetailID());
    	assertEquals("445 Testing St", dd.getStreetAddress());
    	assertEquals("NAN", dd.getStreetAddressTwo());
    	assertEquals("GA", dd.getState());
    	assertEquals("USA", dd.getCountry());
    	assertEquals("Atlanta", dd.getCity());
    	assertEquals(30096, dd.getZipcode());

    }








}

