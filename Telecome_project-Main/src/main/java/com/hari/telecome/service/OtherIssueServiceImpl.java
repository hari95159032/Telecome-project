package com.hari.telecome.service;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hari.telecome.Entity.OtherIssue;
import com.hari.telecome.Entity.User;
import com.hari.telecome.repository.OthetrIssueRepository;

@Service
public class OtherIssueServiceImpl implements OtherIssueService{
	
	OthetrIssueRepository repository;
	
	@Autowired
	public void setRepository(OthetrIssueRepository repository) {
		this.repository=repository;
	}

	@Override
	public void otherIssue(OtherIssue otherIssue, Integer id) {
//		long millis=System.currentTimeMillis();
//		Date currentDate = new Date(millis);
//		otherIssue.setDate(currentDate);
//		otherIssue.setUser(new User(id));
		repository.save(otherIssue);
		System.out.println(otherIssue.getOtherIssueId());
		
	}

}
