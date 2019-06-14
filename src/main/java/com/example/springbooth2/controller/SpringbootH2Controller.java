package com.example.springbooth2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbooth2.model.User;
import com.example.springbooth2.service.SpringbootH2Service;

@RestController
@CrossOrigin(exposedHeaders="Access-Control-Allow-Origin")
public class SpringbootH2Controller {

	@Autowired
	SpringbootH2Service springbootH2Service;
	
	@PostMapping("/getUser")
	public ResponseEntity<User> getUser(@RequestBody User user) throws Exception {
		User user1 = springbootH2Service.getUser(user);
		if(user1 == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<>(user1, HttpStatus.OK);
		}
	}
	
	@PostMapping("/saveUser")
	public User saveUser(@RequestBody User user) {
		return springbootH2Service.saveUser(user);
	}
	
	@PutMapping("/editUser")
	public User editUser(@RequestBody User user) {
		return springbootH2Service.saveUser(user);
	}
	
	@GetMapping("/getUserById")
	public User getUserById(@RequestParam Integer id) {
		return springbootH2Service.getUserById(id);
	}
	
}
