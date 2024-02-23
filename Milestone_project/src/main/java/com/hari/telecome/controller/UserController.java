package com.hari.telecome.controller;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hari.telecome.Entity.UserDetails;
import com.hari.telecome.service.UserServiceImpl;


@RestController
@RequestMapping("api/v1")
@CrossOrigin("http://localhost:3000")
public class UserController {

	@Autowired
	UserServiceImpl userService;
	
	@GetMapping("users/all")
	public Iterable<UserDetails> getAllUsers(){
		return userService.getAllUsers();
	}
	@GetMapping
	Optional<UserDetails> getUserByEmail(@PathVariable String email) {
		return userService.getUserByEmail(email);
	}
	
	@PostMapping("user/signup")
	public void signUp(@RequestBody UserDetails user) {
		userService.signUp(user);
//		System.out.println(user);
	}
	
	 @PostMapping("/signin")
	    public ResponseEntity<String> signIn(@RequestBody UserDetails user) {
	        String email = user.getEmail();
	        String password = user.getPassword();

	        if (userService.isValidUser(email, password)) {
	            return ResponseEntity.ok("Login successful");
	        } else {
	            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
	        }
	    }
}
