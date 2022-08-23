package com.cognizant.snowbunnies.repositories;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

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

import com.cognizant.snowbunnies.models.User;


@RunWith(SpringRunner.class)
@DataJpaTest
public class UserIntegrationTests {
	
	@Autowired
    private UserRepository userRepo;
	
    @Autowired
    private TestEntityManager entityManager;
    
    private long hibernateID;

    @BeforeAll
    public static void setup() {
		
    }
    
	
	@BeforeEach
	public void beforeEach() {
		User user = new User(151L, "gmailrr@gmail.com", "password", true, "Testrr", "ing");

		entityManager.persist(user);
				
		hibernateID = (long) entityManager.getId(user);
	}
	
	@AfterEach
	public void afterEach() {
		entityManager.clear();
	}
	

	@Test
	void ValidFindById_AndNoError() {
		Optional<User> findUser = userRepo.findById(hibernateID);
		
		if(findUser.isPresent()) {
			User u = findUser.get();
	    	
	    	assertEquals(151L, u.getUserID());
	    	assertEquals("gmailrr@gmail.com", u.getEmail());
	    	assertEquals("password", u.getPassword());
	    	assertEquals("Testrr", u.getFirstName());
	    	assertEquals("ing", u.getLastName());
	    	assertEquals(true, u.isEmployee());
		}
		else {
			fail("Failed to find user by id");
		}
	}
	
	@Test
	void InvalidFindById_AndFailsToFindUserId() {
		Optional<User> findUser = userRepo.findById(999L);
		
		if(findUser.isPresent()) {
			fail("Should have failed to find cart id");
		}
		
		assertEquals(true, findUser.isEmpty());
	}
	
	@Test
	void ValidDelete_AndNoError() {
		Optional<User> findUser = userRepo.findById(hibernateID);
		
		if(findUser.isPresent()) {
			User u = findUser.get();
			
			userRepo.delete(u);
			
			assertEquals(0L, userRepo.count());
		}
		else {
			fail("Failed to delete user by id");
		}
	}
	
	@Test
	void ValidFindByIdAndUpdateTotalThenSave_AndNoError() {
		Optional<User> findUser = userRepo.findById(hibernateID);
		
		if(findUser.isPresent()) {
			User u = findUser.get();
			
			u.setEmployee(false);
			
			userRepo.save(u);
			
			findUser = userRepo.findById(hibernateID);
			u = findUser.get();
			
			assertEquals(151L, u.getUserID());
	    	assertEquals("gmailrr@gmail.com", u.getEmail());
	    	assertEquals("password", u.getPassword());
	    	assertEquals("Testrr", u.getFirstName());
	    	assertEquals("ing", u.getLastName());
	    	assertEquals(false, u.isEmployee());
		}
		else {
			fail("Failed to find user by id");
		}
	}
	
	
	@Test
	void ValidSaveUser_AndNoErrors() {
		User u = new User(11L, "gmailrr@gmail.com", "password", true, "Testrr", "ing");

		userRepo.save(u);
		
		Optional<User> findUser = userRepo.findById(hibernateID + 1);
		
		if(findUser.isPresent()) {
			u = findUser.get();
	    	
	    	assertEquals(hibernateID + 1, u.getUserID());
	    	assertEquals("gmailrr@gmail.com", u.getEmail());
	    	assertEquals("password", u.getPassword());
	    	assertEquals("Testrr", u.getFirstName());
	    	assertEquals("ing", u.getLastName());
	    	assertEquals(false, u.isEmployee());
		}
		else {
			fail("Failed to save user");
		}
		
	}

}
