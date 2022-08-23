package com.cognizant.snowbunnies.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CartProductTests {
	
	private CartProduct cp;


    @BeforeAll
    public static void setup() {
    }
    
    @BeforeEach
    public void beforeEach() {
    	cp = new CartProduct(1L, 2L, 3L);
    }
   
    
    @Test
    void whenValidConstructor_thenNoErrors() {   
    	assertEquals(1L, cp.getCartProductId());
    	assertEquals(2L, cp.getCartId());
    	assertEquals(3L, cp.getProductId());
    }
    
    @Test
    void whenValidCartProductID_thenNoErrors() {   
    	cp.setCartProductId(55L);
    	assertEquals(55L, cp.getCartProductId());
    	assertEquals(2L, cp.getCartId());
    	assertEquals(3L, cp.getProductId());
    }
    
    @Test
    void whenValidCartID_thenNoErrors() {   
    	cp.setCartId(9L);
    	assertEquals(1L, cp.getCartProductId());
    	assertEquals(9L, cp.getCartId());
    	assertEquals(3L, cp.getProductId());
    }
    
    @Test
    void whenValidProductID_thenNoErrors() {   
    	cp.setProductId(90L);
    	assertEquals(1L, cp.getCartProductId());
    	assertEquals(2L, cp.getCartId());
    	assertEquals(90L, cp.getProductId());
    }
    
    @Test
    void whenValidOverloadedConstructor_thenNoErrors() {   
    	CartProduct cp2 = new CartProduct(21L, 31L);
    	cp2.setCartProductId(11L);
    	assertEquals(11L, cp2.getCartProductId());
    	assertEquals(21L, cp2.getCartId());
    	assertEquals(31L, cp2.getProductId());
    }
    
    @Test
    void whenValidDefaultConstructor_thenNoErrors() {
    	CartProduct cartProduct = new CartProduct();
    }

}
