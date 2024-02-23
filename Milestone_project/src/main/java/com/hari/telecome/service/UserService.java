package com.hari.telecome.service;

import java.util.Optional;

import com.hari.telecome.Entity.UserDetails;

public interface UserService {

	public String signUp(UserDetails user);
	
	public Iterable<UserDetails> getAllUsers();
	
	public boolean isValidUser(String email, String password);
	Optional<UserDetails> getUserByEmail(String email) ;
}
