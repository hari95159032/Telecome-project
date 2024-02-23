package com.hari.telecome.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hari.telecome.Entity.UserDetails;



public interface UserRepository extends JpaRepository<UserDetails, Integer> {

	public Optional<UserDetails> findByEmail(String email);
}