package com.cognizant.snowbunnies.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.snowbunnies.models.Invoice;
import com.cognizant.snowbunnies.repositories.InvoiceRepository;

@RestController
public class InvoiceController {
	
	@Autowired
    private InvoiceRepository invoiceRepo;
	

    @GetMapping("/invoice/all")
    public List<Invoice> getAllInvoices() {
        return invoiceRepo.findAll();
    }
    
    @GetMapping("/invoice/get/{id}")
    public Invoice getInvoiceById(@PathVariable("id") Long id) {
        return invoiceRepo.findById(id).get();
    }
    

    @PostMapping("/invoice/delete/{id}")
    public void deleteInvoiceById(@PathVariable("id") Long id) {
      invoiceRepo.deleteById(id);
    }
    
    @PostMapping("/invoice/create")
    public void createInvoiceById(@RequestBody Invoice invoice) {
       invoiceRepo.save(invoice);
    }
    
    @PostMapping("/invoice/update/{id}")
    public void updateInvoiceById(@RequestBody Invoice invoice, @PathVariable("id") Long id) {
      invoiceRepo.save(invoice);
    }

}
