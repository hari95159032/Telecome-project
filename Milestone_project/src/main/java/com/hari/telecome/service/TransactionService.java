package com.hari.telecome.service;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bankingapplication.entity.UserDetails;
import com.hari.telecome.Entity.TransctionDetails;
import com.hari.telecome.repository.TransactionRepository;

@Service
public class TransactionService {

	@Autowired
	TransactionRepository repository;
	
	@Autowired
	UserServiceImpl userService;
	
	
	//self deposit
	
	
	public String transferById(TransctionDetails transaction,Integer id,Integer transactionParty) {
		transaction.setUserDetails(new UserDetails(id));
		transaction.setTransactionDate(LocalDateTime.now());
		transaction.setTransactionParty(transactionParty);
		transaction.setTransactionType("Debited");
	
			repository.save(transaction);
			return "Transferred "+transaction.getTransactionAmount() +"Sucessfully to :"+transactionParty;
		
	}
	
	
	public String withdrawById(TransctionDetails transaction, Integer userId) {
		transaction.setUserDetails(new UserDetails(userId));
		transaction.setTransactionDate(LocalDateTime.now());
		transaction.setTransactionParty(null);
		transaction.setTransactionType("Withdrawl");
		
			repository.save(transaction);
			return "Withdraw successfuly your remaining balance:"+user.getBalance();
	
	}
	
	
	public Iterable<TransctionDetails> getAllTransactions() {
		Iterable<TransctionDetails> listOfTransactions = repository.findAll();
  		if(listOfTransactions.iterator().hasNext()) {
			return listOfTransactions;
		}
	
		
	}
	
	public Optional<TransctionDetails> recentTransaction() {
		 Integer countOfTransactions = (int) repository.count();
		 Optional<TransctionDetails> lastTransaction = repository.findById(countOfTransactions);
		 if(lastTransaction.isPresent())
			 return lastTransaction;
		
	}
}
