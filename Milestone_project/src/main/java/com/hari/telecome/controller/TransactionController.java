package com.hari.telecome.controller;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bankingapplication.entity.UserDetails;

import com.hari.telecome.Entity.TransctionDetails;
import com.hari.telecome.service.TransactionService;

@RestController
@RequestMapping("api/v1")
public class TransactionController {
@Autowired
	 TransactionService service;


@PostMapping("/transactions/users/transfer/{id}")
public String transferById(@RequestBody TransctionDetails transaction,@PathVariable Integer id,@RequestParam Integer transactionParty) {
return service.transferById(transaction, id, transactionParty);
}

@PostMapping("/transactions/users/withdraw/{userId}")
public String withdrawById(@RequestBody TransctionDetails transaction, @PathVariable Integer userId) {
	return service.withdrawById(transaction, userId);
}

@GetMapping("/transactions/users")
public Iterable<TransctionDetails> getAllTransactions() {
	return service.getAllTransactions();
}

@GetMapping("/transactions/users/recent")
public Optional<TransctionDetails> recentTransaction() {
	return service.recentTransaction();
}
}
