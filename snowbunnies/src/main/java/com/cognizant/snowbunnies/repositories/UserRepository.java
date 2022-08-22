package com.cognizant.snowbunnies.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.snowbunnies.models.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
