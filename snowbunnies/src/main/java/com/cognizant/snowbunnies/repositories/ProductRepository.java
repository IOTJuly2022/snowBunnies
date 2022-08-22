package com.cognizant.snowbunnies.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.snowbunnies.models.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
