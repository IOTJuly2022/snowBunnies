package com.cognizant.snowbunnies.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UserTests {
	
	private User u;

    @BeforeAll
    public static void setup() {
    }
    
    @BeforeEach
    public void beforeEach() {
    	//long userID, String email, String password, boolean isEmployee, String firstName, String lastName
    	u = new User(15L, "gmail@gmail.com", "password", false, "Test", "ing");
    }
   
    
    @Test
    void whenValidConstructor_thenNoErrors() {   
    	assertEquals(15L, u.getUserID());
    	assertEquals("gmail@gmail.com", u.getEmail());
    	assertEquals("password", u.getPassword());
    	assertEquals("Test", u.getFirstName());
    	assertEquals("ing", u.getLastName());
    	assertEquals(false, u.isEmployee());
    }
    
    @Test
    void whenValidConstructorOverloaded_thenNoErrors() {
    	User u2 = new User("gmail@gmail.com", "password", false, "Test", "ing");
    	u2.setUserID(151L);
    	assertEquals(151L, u2.getUserID());
    	assertEquals("gmail@gmail.com", u.getEmail());
    	assertEquals("password", u.getPassword());
    	assertEquals("Test", u.getFirstName());
    	assertEquals("ing", u.getLastName());
    	assertEquals(false, u.isEmployee());
    }
    
    @Test
    void whenValidIsEmployee_thenNoErrors() {   
    	u.setEmployee(true);
    	assertEquals(15L, u.getUserID());
    	assertEquals("gmail@gmail.com", u.getEmail());
    	assertEquals("password", u.getPassword());
    	assertEquals("Test", u.getFirstName());
    	assertEquals("ing", u.getLastName());
    	assertEquals(true, u.isEmployee());
    }
    
    @Test
    void whenValidFirstName_thenNoErrors() {   
    	u.setFirstName("yeet");
    	assertEquals(15L, u.getUserID());
    	assertEquals("gmail@gmail.com", u.getEmail());
    	assertEquals("password", u.getPassword());
    	assertEquals("yeet", u.getFirstName());
    	assertEquals("ing", u.getLastName());
    	assertEquals(false, u.isEmployee());
    }
    
    @Test
    void whenValidLastName_thenNoErrors() {  
    	u.setLastName("drive");
    	assertEquals(15L, u.getUserID());
    	assertEquals("gmail@gmail.com", u.getEmail());
    	assertEquals("password", u.getPassword());
    	assertEquals("Test", u.getFirstName());
    	assertEquals("drive", u.getLastName());
    	assertEquals(false, u.isEmployee());
    }
    
    @Test
    void whenValidUserID_thenNoErrors() {   
    	u.setUserID(777L);
    	assertEquals(777L, u.getUserID());
    	assertEquals("gmail@gmail.com", u.getEmail());
    	assertEquals("password", u.getPassword());
    	assertEquals("Test", u.getFirstName());
    	assertEquals("ing", u.getLastName());
    	assertEquals(false, u.isEmployee());
    }
    
    @Test
    void whenValidPassword_thenNoErrors() {   
    	u.setPassword("pswrd");
    	assertEquals(15L, u.getUserID());
    	assertEquals("gmail@gmail.com", u.getEmail());
    	assertEquals("pswrd", u.getPassword());
    	assertEquals("Test", u.getFirstName());
    	assertEquals("ing", u.getLastName());
    	assertEquals(false, u.isEmployee());
    }
    
    @Test
    void whenValidEmail_thenNoErrors() {  
    	u.setEmail("gmail2@gmail.com");
    	assertEquals(15L, u.getUserID());
    	assertEquals("gmail2@gmail.com", u.getEmail());
    	assertEquals("password", u.getPassword());
    	assertEquals("Test", u.getFirstName());
    	assertEquals("ing", u.getLastName());
    	assertEquals(false, u.isEmployee());
    }
    
    @Test
    void whenValidDefaultConstructor_thenNoErrors() {
    	User user = new User();
    }

}
