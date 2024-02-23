package com.hari.telecome.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hari.telecome.Entity.TechnicalIssue;
import com.hari.telecome.service.TechnicalIssueServiceImpl;

@RestController
@RequestMapping("api/tech")
@CrossOrigin("http://localhost:3000")
public class TechnicalIssueController {

	
	@Autowired
	TechnicalIssueServiceImpl service;
	
	@PostMapping("/{id}")
	public void technicalIssue(@RequestBody TechnicalIssue technicalIssue, @PathVariable Integer id) {
		 service.technicalIssue(technicalIssue, id);
		
	}
	
//	@PostMapping("/issue")
//	public String technicalIssue(@RequestBody TechnicalIssueDTO technicalIssue) {
//		return service.technicalIssue(technicalIssue);
//		
//	}
}
