package com.cognizant.snowbunnies.controllers;

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


    private CartRepository cartRepo;

    public TestController(CartRepository cartRepo) {
        this.cartRepo = cartRepo;
    }

    @GetMapping("/test")
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
}