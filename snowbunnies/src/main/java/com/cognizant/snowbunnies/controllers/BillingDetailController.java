package com.cognizant.snowbunnies.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.snowbunnies.models.BillingDetail;
import com.cognizant.snowbunnies.repositories.BillingDetailRepository;

@RestController
public class BillingDetailController {
	
	@Autowired
    private BillingDetailRepository bdRepo;
	

    @GetMapping("/billing-detail/all")
    public List<BillingDetail> getAllBillingDetails() {
        return bdRepo.findAll();
    }
    
    @GetMapping("/billing-detail/get/{id}")
    public BillingDetail getUserById(@PathVariable("id") Long id) {
        return bdRepo.findById(id).get();
    }
    

    @PostMapping("/billing-detail/delete/{id}")
    public void deleteUserById(@PathVariable("id") Long id) {
       bdRepo.deleteById(id);
    }
    
    @PostMapping("/billing-detail/create")
    public void createUserById(@RequestBody BillingDetail bd) {
       bdRepo.save(bd);
    }
    
    @PostMapping("/billing-detail/update/{id}")
    public void updateUserById(@RequestBody BillingDetail bd, @PathVariable("id") Long id) {
      bdRepo.save(bd);
    }


}
