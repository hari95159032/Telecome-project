package com.hari.telecome.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hari.telecome.Entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	
	Optional<User> findByUserName(String userName);

}
