package com.cognizant.snowbunnies.repositories;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Optional;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import com.cognizant.snowbunnies.models.Invoice;

@RunWith(SpringRunner.class)
@DataJpaTest
class InvoiceIntegrationTests {
	
	@Autowired
    private InvoiceRepository invoiceRepo;
	
    @Autowired
    private TestEntityManager entityManager;
    
    private long hibernateID;
    private final String PHONE_NUM = "123-456-7890";
    
	
	@BeforeEach
	public void beforeEach() {
		Invoice invoice = new Invoice(1, 2, PHONE_NUM, 3, 4, 5);

		entityManager.persist(invoice);
				
		hibernateID = (long) entityManager.getId(invoice);
	}
	
	@AfterEach
	public void afterEach() {
		entityManager.clear();
	}
	

	@Test
	void ValidFindById_AndNoError() {
		Optional<Invoice> findInvoice = invoiceRepo.findById(hibernateID);
		
		if(findInvoice.isPresent()) {
			Invoice i = findInvoice.get();
			
			assertEquals(hibernateID, i.getInvoiceID());
	    	assertEquals(2L, i.getCartID());
	    	assertEquals(PHONE_NUM, i.getPhoneNumber());
	    	assertEquals(1L, i.getUserID());
	    	assertEquals(3L, i.getBillingDetailID());
	    	assertEquals(5L, i.getPaymentDetailID());
	    	assertEquals(4L, i.getDeliveryDetailID());

		}
		else {
			fail("Failed to invoice by id");
		}
	}
	
	@Test
	void InvalidFindById_AndFailsToFindCartId() {
		Optional<Invoice> findInvoice = invoiceRepo.findById(999L);
		
		if(findInvoice.isPresent()) {
			fail("Should have failed to find invoice id");
		}
		
		assertEquals(true, findInvoice.isEmpty());
	}
	
	@Test
	void ValidDelete_AndNoError() {
		Optional<Invoice> findInvoice = invoiceRepo.findById(hibernateID);
		
		if(findInvoice.isPresent()) {
			Invoice i = findInvoice.get();
			
			invoiceRepo.delete(i);
			
			assertEquals(0L, invoiceRepo.count());
		}
		else {
			fail("Failed to delete invoice by id");
		}
	}
	
	@Test
	void ValidFindByIdAndUpdateTotalThenSave_AndNoError() {
		Optional<Invoice> findInvoice = invoiceRepo.findById(hibernateID);
		
		if(findInvoice.isPresent()) {
			Invoice i = findInvoice.get();
			
			i.setInvoiceID(999L);
			
			invoiceRepo.save(i);
			
			findInvoice = invoiceRepo.findById(hibernateID);
			i = findInvoice.get();
			
			assertEquals(999L, i.getInvoiceID());
	    	assertEquals(2L, i.getCartID());
	    	assertEquals(PHONE_NUM, i.getPhoneNumber());
	    	assertEquals(1L, i.getUserID());
	    	assertEquals(3L, i.getBillingDetailID());
	    	assertEquals(5L, i.getPaymentDetailID());
	    	assertEquals(4L, i.getDeliveryDetailID());
		}
		else {
			fail("Failed to find invoice by id");
		}
	}
	
	
	@Test
	void ValidSaveCart_AndNoErrors() {
		Invoice i = new Invoice(11, 12, PHONE_NUM, 13,  14, 15);
		invoiceRepo.save(i);
		
		Optional<Invoice> findCart = invoiceRepo.findById(hibernateID + 1);
		
		if(findCart.isPresent()) {
			i = findCart.get();
			
			assertEquals(hibernateID + 1, i.getInvoiceID());
	    	assertEquals(12L, i.getCartID());
	    	assertEquals(PHONE_NUM, i.getPhoneNumber());
	    	assertEquals(11L, i.getUserID());
	    	assertEquals(13L, i.getBillingDetailID());
	    	assertEquals(15L, i.getPaymentDetailID());
	    	assertEquals(14L, i.getDeliveryDetailID());
		}
		else {
			fail("Failed to save invoice");
		}
		
	}
	

}

