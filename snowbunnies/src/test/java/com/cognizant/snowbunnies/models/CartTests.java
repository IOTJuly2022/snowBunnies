package com.cognizant.snowbunnies.models;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class CartTests {
	
	private Cart c;
	private static Date date;

    @BeforeAll
    public static void setup() {
		try {
			date = new SimpleDateFormat("dd/MM/yyyy").parse("2018/08/08");
		} catch (ParseException e) {
			e.printStackTrace();
		} 
    }
    
    @BeforeEach
    public void beforeEach() {
    	c = new Cart(1, 2.00, date);
    	c.setCartID(1);
    }
   
    
    @Test
    void whenValidConstructor_thenNoErrors() {   
    	assertEquals(1L, c.getCartID());
    	assertEquals(2.00, c.getTotalCost());
    	assertEquals(date, c.getPurchaseDate());
    	assertEquals(1L, c.getUserID());
    }
    
    @Test
    void whenValidSetTotalCost_thenNoErrors() {
    	c.setTotalCost(5.00);
    	assertEquals(1, c.getCartID());
    	assertEquals(5.00, c.getTotalCost());
    	assertEquals(date, c.getPurchaseDate());
    	assertEquals(1L, c.getUserID());
    }
    
    @Test
    void whenValidDefaultConstructor_thenNoErrors() {
    	Cart cart = new Cart();
    }
    
    
}
