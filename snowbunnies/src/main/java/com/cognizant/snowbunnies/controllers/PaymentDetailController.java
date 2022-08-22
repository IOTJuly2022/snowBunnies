package com.cognizant.snowbunnies.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.snowbunnies.models.PaymentDetail;
import com.cognizant.snowbunnies.repositories.PaymentDetailRepository;

@RestController
public class PaymentDetailController {
	
	@Autowired
    private PaymentDetailRepository pdRepo;
	

    @GetMapping("/payment-detail/all")
    public List<PaymentDetail> getAllPaymentDetails() {
        return pdRepo.findAll();
    }
    
    @GetMapping("/payment-detail/get/{id}")
    public PaymentDetail getPaymentById(@PathVariable("id") Long id) {
        return pdRepo.findById(id).get();
    }
    

    @PostMapping("/payment-detail/delete/{id}")
    public void deletePaymentById(@PathVariable("id") Long id) {
       pdRepo.deleteById(id);
    }
    
    @PostMapping("/payment-detail/create")
    public void createPaymentById(@RequestBody PaymentDetail bd) {
       pdRepo.save(bd);
    }
    
    @PostMapping("/payment-detail/update/{id}")
    public void updatePaymentById(@RequestBody PaymentDetail bd, @PathVariable("id") Long id) {
      pdRepo.save(bd);
    }

}
