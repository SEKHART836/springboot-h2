package com.example.springbooth2.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springbooth2.model.User;
import com.example.springbooth2.repository.SpringbootH2Repository;

@Service
public class SpringbootH2Service {

	@Autowired
	SpringbootH2Repository springbootH2Repository;
	
	public User getUser(User user) {
		return springbootH2Repository.findByEmailAndPassword(user.getEmail(), user.getPassword());
	}
	
	public User saveUser(User user) {
		return springbootH2Repository.save(user);
	}
	
	public User getUserById(Integer id) {
		Optional<User> response = springbootH2Repository.findById(id);
		return response.get();
	}
	
}
