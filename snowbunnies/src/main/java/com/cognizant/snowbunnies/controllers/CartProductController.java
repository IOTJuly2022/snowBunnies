package com.cognizant.snowbunnies.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.cognizant.snowbunnies.models.CartProduct;
import com.cognizant.snowbunnies.repositories.CartProductRepository;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CartProductController {

	
	@Autowired
    private CartProductRepository cpRepo;
	

    @GetMapping("/cart-product/all")
    public List<CartProduct> getAllCartProducts() {
        return cpRepo.findAll();
    }
    
    @GetMapping("/cart-product/get/{id}")
    public CartProduct getCartProductById(@PathVariable("id") Long id) {
        return cpRepo.findById(id).get();
    }
    

    @PostMapping("/cart-product/delete/{id}")
    public void deleteCartProductById(@PathVariable("id") Long id) {
       cpRepo.deleteById(id);
    }
    
    @PostMapping("/cart-product/create")
    public void createCartProductById(@RequestBody CartProduct cp) {
       cpRepo.save(cp);
    }
    
    @PostMapping("/cart-product/update/{id}")
    public void updateCartProductById(@RequestBody CartProduct cp, @PathVariable("id") Long id) {
      cpRepo.save(cp);
    }
}
