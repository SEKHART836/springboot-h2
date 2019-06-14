package com.example.springbooth2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springbooth2.model.User;

public interface SpringbootH2Repository extends JpaRepository<User, Integer> {

	User findByEmailAndPassword(String email, String password);
	
}
