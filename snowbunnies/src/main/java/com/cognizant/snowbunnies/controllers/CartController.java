package com.cognizant.snowbunnies.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.snowbunnies.models.Cart;
import com.cognizant.snowbunnies.repositories.CartRepository;

@RestController
public class CartController {

	
	@Autowired
    private CartRepository cartRepo;
	

    @GetMapping("/cart/all")
    public List<Cart> getAllCarts() {
        return cartRepo.findAll();
    }
    
    @GetMapping("/cart/get/{id}")
    public Cart getCartById(@PathVariable("id") Long id) {
        return cartRepo.findById(id).get();
    }
    

    @PostMapping("/cart/delete/{id}")
    public void deleteCartById(@PathVariable("id") Long id) {
       cartRepo.deleteById(id);
    }
    @PostMapping("/cart/create")
    public void createCartById(@RequestBody Cart cart) {
       cartRepo.save(cart);
    }
    
    @PostMapping("/cart/update/{id}")
    public void updateCartById(@RequestBody Cart cart, @PathVariable("id") Long id) {
      cart.setCartID(id);
      cartRepo.save(cart);
    }

}
