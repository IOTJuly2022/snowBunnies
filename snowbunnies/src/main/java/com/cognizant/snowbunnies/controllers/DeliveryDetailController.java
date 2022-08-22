package com.cognizant.snowbunnies.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.snowbunnies.models.DeliveryDetail;
import com.cognizant.snowbunnies.repositories.DeliveryDetailRepository;

@RestController
public class DeliveryDetailController {
	
	@Autowired
    private DeliveryDetailRepository ddRepo;
	

    @GetMapping("/delivery-detail/all")
    public List<DeliveryDetail> getAllDeliveryDetails() {
        return ddRepo.findAll();
    }
    
    @GetMapping("/delivery-detail/get/{id}")
    public DeliveryDetail getDeliveryById(@PathVariable("id") Long id) {
        return ddRepo.findById(id).get();
    }
    

    @PostMapping("/delivery-detail/delete/{id}")
    public void deleteDeliveryById(@PathVariable("id") Long id) {
       ddRepo.deleteById(id);
    }
    
    @PostMapping("/delivery-detail/create")
    public void createDeliveryById(@RequestBody DeliveryDetail bd) {
       ddRepo.save(bd);
    }
    
    @PostMapping("/delivery-detail/update/{id}")
    public void updateDeliveryById(@RequestBody DeliveryDetail bd, @PathVariable("id") Long id) {
      ddRepo.save(bd);
    }
}
