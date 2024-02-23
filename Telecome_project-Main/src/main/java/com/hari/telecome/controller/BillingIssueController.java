package com.hari.telecome.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hari.telecome.Entity.BillingIssue;
import com.hari.telecome.service.BillingIssueServiceImpl;

@RestController
@RequestMapping("api/bill")
@CrossOrigin("*")
public class BillingIssueController {
	
	@Autowired
	BillingIssueServiceImpl service;
	
	@PostMapping("/{id}")
	public void billingIssue(@RequestBody BillingIssue billIssue, @PathVariable Integer id) {
		service.billingIssue(billIssue, id);
	}
}
