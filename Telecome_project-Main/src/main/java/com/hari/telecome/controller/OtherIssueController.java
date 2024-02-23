package com.hari.telecome.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hari.telecome.Entity.OtherIssue;
import com.hari.telecome.service.OtherIssueServiceImpl;

@RestController
@RequestMapping("api/other")
@CrossOrigin("*")
public class OtherIssueController {
	
	@Autowired
	OtherIssueServiceImpl service;
	
	@PostMapping("/{id}")
	public void otherIssue(@RequestBody OtherIssue otherIssue, @PathVariable Integer id) {
		service.otherIssue(otherIssue, id);
	}
	

}
