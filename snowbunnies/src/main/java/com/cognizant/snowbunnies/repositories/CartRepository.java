package com.cognizant.snowbunnies.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cognizant.snowbunnies.models.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {
	
}
