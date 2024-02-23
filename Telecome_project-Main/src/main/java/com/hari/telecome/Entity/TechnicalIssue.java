package com.hari.telecome.Entity;

import java.sql.Date;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;

@Entity
public class TechnicalIssue {
	
	@Id
	private String technicalIssueId;
	
	@PrePersist
	void generatedIssueId() {
		this.technicalIssueId="Issue-"+UUID.randomUUID().toString().substring(2,10);
	}
	private Date date;
	
	private String serviceInformation;
	
	private String description;
	
	
	@ManyToOne
	User user;
	
	public TechnicalIssue() {
		
	}
	

//	public TechnicalIssue(String technicalIssueId, Date date, String serviceInformation, String description,
//			User user) {
//		super();
//		this.technicalIssueId = technicalIssueId;
//		this.date = date;
//		this.serviceInformation = serviceInformation;
//		this.description = description;
//		this.user = user;
//	}


	public TechnicalIssue(Date date, String serviceInformation, String description, Integer id) {
		this.date = date;
		this.serviceInformation = serviceInformation;
		this.description = description;
		this.user = new User(id);
	}

	public String getTechnicalIssueId() {
		return technicalIssueId;
	}

	public void setTechnicalIssueId(String technicalIssueId) {
		this.technicalIssueId = technicalIssueId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getServiceInformation() {
		return serviceInformation;
	}

	public void setServiceInformation(String serviceInformation) {
		this.serviceInformation = serviceInformation;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	

	@Override
	public String toString() {
		return "TechnicalIssue [technicalIssueId=" + technicalIssueId + ", date=" + date + ", serviceInformation="
				+ serviceInformation + ", description=" + description + ", user=" + user + "]";
	}
	
	 
	
	
	
	

}
