package com.cognizant.snowbunnies.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cognizant.snowbunnies.repositories.*;
import com.cognizant.snowbunnies.models.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
public class TestController {
	
    private final String PHONE_NUM = "123-456-7890";	

	@Autowired
    private CartRepository cartRepo;
	
	@Autowired
    private InvoiceRepository invoiceRepo;


    @GetMapping("/testCart")
    public List<Cart> getCarts() {
    	Date date = null;
		try {
			date = new SimpleDateFormat("dd/MM/yyyy").parse("2018/08/08");
		} catch (ParseException e) {
			e.printStackTrace();
		}  
    	Cart cart = new Cart(1L, 1.00f, date);
    	cartRepo.save(cart);
        return cartRepo.findAll();
    }
    
    @GetMapping("/testInvoice")
    public List<Invoice> getInvoices() {
    	Invoice invoice = new Invoice(1, 2, PHONE_NUM, 3, 4, 5);
		Invoice i = new Invoice(11, 12, PHONE_NUM, 13,  14, 15);
    	invoiceRepo.save(invoice);
    	invoiceRepo.save(i);

        return invoiceRepo.findAll();
    }
}