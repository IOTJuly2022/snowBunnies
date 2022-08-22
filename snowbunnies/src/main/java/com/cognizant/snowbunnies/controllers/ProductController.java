package com.cognizant.snowbunnies.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.snowbunnies.models.Product;
import com.cognizant.snowbunnies.repositories.ProductRepository;

@RestController
public class ProductController {
	
	@Autowired
    private ProductRepository productRepo;
	

    @GetMapping("/product/all")
    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }
    
    @GetMapping("/product/get/{id}")
    public Product getProductById(@PathVariable("id") Long id) {
        return productRepo.findById(id).get();
    }
    

    @PostMapping("/product/delete/{id}")
    public void deleteProductById(@PathVariable("id") Long id) {
      productRepo.deleteById(id);
    }
    
    @PostMapping("/product/create")
    public void createProductById(@RequestBody Product product) {
       productRepo.save(product);
    }
    
    @PostMapping("/product/update/{id}")
    public void updateProductById(@RequestBody Product product, @PathVariable("id") Long id) {
      productRepo.save(product);
    }

}
