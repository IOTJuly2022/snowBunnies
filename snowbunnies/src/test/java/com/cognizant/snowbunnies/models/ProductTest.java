package com.cognizant.snowbunnies.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProductTest {
	
	private Product p;
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
    	p = new Product("testProduct", 134L, ProductType.MEAT, date);
    }
   
    
    @Test
    void whenValidConstructor_thenNoErrors() {
    	assertEquals(134L, p.getProductID());
    	assertEquals(ProductType.MEAT, p.getProductType());
    	assertEquals("testProduct", p.getName());
    	assertEquals(date, p.getCreateDate());
    }
    
    @Test
    void whenValidProductType_thenNoErrors() {
    	p.setProductType(ProductType.BAKERY);
    	assertEquals(134L, p.getProductID());
    	assertEquals(ProductType.BAKERY, p.getProductType());
    	assertEquals("testProduct", p.getName());
    	assertEquals(date, p.getCreateDate());
    }
    
    @Test
    void whenValidProductID_thenNoErrors() {
    	p.setProductID(1);
    	assertEquals(1L, p.getProductID());
    	assertEquals(ProductType.MEAT, p.getProductType());
    	assertEquals("testProduct", p.getName());
    	assertEquals(date, p.getCreateDate());
    }
    
    @Test
    void whenValidProductName_thenNoErrors() {
    	p.setName("hehe");
    	assertEquals(134L, p.getProductID());
    	assertEquals(ProductType.MEAT, p.getProductType());
    	assertEquals("hehe", p.getName());
    	assertEquals(date, p.getCreateDate());
    }
    
    @Test
    void whenValidDefaultConstructor_thenNoErrors() {
    	Product product = new Product();
    	
    }

}
