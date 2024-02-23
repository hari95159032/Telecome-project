package com.hari.telecome.repository;


import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.hari.telecome.Entity.TransctionDetails;

@Repository
public interface TransactionRepository extends CrudRepository<TransctionDetails,  Integer> {

	
	
}
