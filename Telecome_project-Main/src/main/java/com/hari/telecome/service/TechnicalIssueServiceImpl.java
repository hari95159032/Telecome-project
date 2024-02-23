package com.hari.telecome.service;

import java.sql.Date;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.hari.telecome.Entity.TechnicalIssue;
import com.hari.telecome.Entity.User;
import com.hari.telecome.repository.TechnicalIssueRepository;


@Service
public class TechnicalIssueServiceImpl implements TechnicalIssueService{
	
	
	TechnicalIssueRepository repository;
	
	TechnicalIssue issue;
	
	@Autowired
	public void setRepository(TechnicalIssueRepository repository) {
		this.repository = repository;
	}

	
		@Override
		public void technicalIssue(TechnicalIssue technicalissue, Integer id) {
			
			long millis=System.currentTimeMillis();
			Date currentDate = new Date(millis);
			technicalissue.setDate(currentDate);
			technicalissue.setUser(new User(id));
			repository.save(technicalissue);
			System.out.println(technicalissue.getTechnicalIssueId());
			
		}
	}
	
//	@PrePersist
//	void generatedIssueId() {
//		technicalIssueId="Issue-"+UUID.randomUUID().toString().substring(2,10);
//	}
	
//	@Override
	//public String technicalIssue(TechnicalIssueDTO technicalIssue) {
//	public String technicalIssue(TechnicalIssue technicalIssue, Integer id) {
//		long millis=System.currentTimeMillis();
//		Date currentDate = new Date(millis);
//		issue.setDate(currentDate);
//		issue.setUser(new User(technicalIssue.getUserId()));
//		issue.setDescription(technicalIssue.getDescription());
//		issue.setServiceInformation(technicalIssue.getServiceInformation());
//		
//		String technicalIssueId= "Issue-"+UUID.randomUUID().toString().substring(2,10);
//		issue.setTechnicalIssueId(technicalIssueId);
//		repository.save(issue);
//		return technicalIssueId;
		//System.out.println(technicalIssue.getTechnicalIssueId());
	//}

	

