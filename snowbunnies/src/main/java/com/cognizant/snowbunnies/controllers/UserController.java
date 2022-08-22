package com.cognizant.snowbunnies.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.cognizant.snowbunnies.models.User;
import com.cognizant.snowbunnies.repositories.UserRepository;

public class UserController {
	
	@Autowired
    private UserRepository userRepo;
	

    @GetMapping("/user/all")
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }
    
    @GetMapping("/user/get/{id}")
    public User getUserById(@PathVariable("id") Long id) {
        return userRepo.findById(id).get();
    }
    

    @PostMapping("/user/delete/{id}")
    public void deleteUserById(@PathVariable("id") Long id) {
       userRepo.deleteById(id);
    }
    @PostMapping("/user/create")
    public void createUserById(@RequestBody User user) {
       userRepo.save(user);
    }
    
    @PostMapping("/user/update/{id}")
    public void updateUserById(@RequestBody User user, @PathVariable("id") Long id) {
      user.setUserID(id);
      userRepo.save(user);
    }


}
