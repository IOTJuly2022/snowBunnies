package com.cognizant.snowbunnies.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.snowbunnies.models.CartProduct;

public interface CartProductRepository extends JpaRepository<CartProduct, Long>{

}
