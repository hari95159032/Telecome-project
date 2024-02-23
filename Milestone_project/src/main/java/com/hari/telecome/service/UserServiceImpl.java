package com.hari.telecome.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hari.telecome.Entity.UserDetails;
import com.hari.telecome.repository.UserRepository;


@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository repository;
	
	@Autowired
	public void setRepository(UserRepository repository) {
		this.repository = repository;
	}

	@Override
	public String signUp(UserDetails newUser) {
		
		Optional<UserDetails> user=repository.findByEmail(newUser.getEmail());
		if(user.isPresent()) {
			return "email already registered";
		}else {
			repository.save(newUser);
			return "user registration successfull";
		}
	}

	@Override
	public Iterable<UserDetails> getAllUsers() {
		
		return repository.findAll();
	}
	@Override
	public boolean isValidUser(String email, String password) {
        
        UserDetails user = repository.findByEmail(email).orElse(null);

        return user != null && user.getPassword().equals(password);
    }

	public Optional<UserDetails> getUserByEmail(String email) {
		return repository.findByEmail(email);
	}

	public UserDetails updateBalance(UserDetails userdetails) {
		
		return repository.save(userdetails);
	}
	
	

}

