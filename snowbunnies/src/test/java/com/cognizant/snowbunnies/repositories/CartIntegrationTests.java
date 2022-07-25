package com.cognizant.snowbunnies.repositories;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import com.cognizant.snowbunnies.models.Cart;

@RunWith(SpringRunner.class)
@DataJpaTest
class CartIntegrationTests {
	
	@Autowired
    private CartRepository cartRepo;
	
    @Autowired
    private TestEntityManager entityManager;
    
    private static Date date;
    private long hibernateID;

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
		Cart cart = new Cart(1, 2.00, date);

		entityManager.persist(cart);
				
		hibernateID = (long) entityManager.getId(cart);
	}
	
	@AfterEach
	public void afterEach() {
		entityManager.clear();
	}
	

	@Test
	void ValidFindById_AndNoError() {
		Optional<Cart> findCart = cartRepo.findById(hibernateID);
		
		if(findCart.isPresent()) {
			Cart c = findCart.get();
			
			assertEquals(hibernateID, c.getCartID());
	    	assertEquals(2.00, c.getTotalCost());
	    	assertEquals(date, c.getPurchaseDate());
	    	assertEquals(1L, c.getUserID());
		}
		else {
			fail("Failed to find cart by id");
		}
	}
	
	@Test
	void InvalidFindById_AndFailsToFindCartId() {
		Optional<Cart> findCart = cartRepo.findById(999L);
		
		if(findCart.isPresent()) {
			fail("Should have failed to find cart id");
		}
		
		assertEquals(true, findCart.isEmpty());
	}
	
	@Test
	void ValidDelete_AndNoError() {
		Optional<Cart> findCart = cartRepo.findById(hibernateID);
		
		if(findCart.isPresent()) {
			Cart c = findCart.get();
			
			cartRepo.delete(c);
			
			assertEquals(0L, cartRepo.count());
		}
		else {
			fail("Failed to delete cart by id");
		}
	}
	
	@Test
	void ValidFindByIdAndUpdateTotalThenSave_AndNoError() {
		Optional<Cart> findCart = cartRepo.findById(hibernateID);
		
		if(findCart.isPresent()) {
			Cart c = findCart.get();
			
			c.setTotalCost(10.00);
			
			cartRepo.save(c);
			
			findCart = cartRepo.findById(hibernateID);
			c = findCart.get();
			
			assertEquals(hibernateID, c.getCartID());
	    	assertEquals(10.00, c.getTotalCost());
	    	assertEquals(date, c.getPurchaseDate());
	    	assertEquals(1L, c.getUserID());
		}
		else {
			fail("Failed to find cart by id");
		}
	}
	
	
	@Test
	void ValidSaveCart_AndNoErrors() {
		Cart c = new Cart(2, 226.00, date);
		cartRepo.save(c);
		
		Optional<Cart> findCart = cartRepo.findById(hibernateID + 1);
		
		if(findCart.isPresent()) {
			c = findCart.get();
			
			assertEquals(hibernateID + 1, c.getCartID());
	    	assertEquals(226.00, c.getTotalCost());
	    	assertEquals(date, c.getPurchaseDate());
	    	assertEquals(2L, c.getUserID());
		}
		else {
			fail("Failed to save cart");
		}
		
	}
	

}
