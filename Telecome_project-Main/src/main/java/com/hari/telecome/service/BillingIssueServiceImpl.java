package com.hari.telecome.service;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hari.telecome.Entity.BillingIssue;
import com.hari.telecome.Entity.User;
import com.hari.telecome.repository.BillingIssuerepository;
@Service
public class BillingIssueServiceImpl implements BillingIssueService{

	BillingIssuerepository repository;
	
	@Autowired
	public void setRepository(BillingIssuerepository repository) {
		this.repository = repository;
	}
	
	@Override
	public void billingIssue(BillingIssue billIssue, Integer id) {
		
//		long millis=System.currentTimeMillis();
//		Date currentDate = new Date(millis);
//		billIssue.setDate(currentDate);
		billIssue.setUser(new User(id));
		repository.save(billIssue);
		System.out.println(billIssue.getBillingIssueId());
		
	}

}
