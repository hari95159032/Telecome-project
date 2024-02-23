package com.hari.telecome.Entity;

import java.sql.Date;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;

@Entity
public class OtherIssue {
	
	@Id
	private String otherIssueId;
	
	@PrePersist
	void generatedIssueId() {
		this.otherIssueId="Issue-"+UUID.randomUUID().toString().substring(2,10);
	}
	private Date date;
	
	private String description;
	
	//private String filePath;
	
	@ManyToOne
	User user;
	
	public OtherIssue() {
		// TODO Auto-generated constructor stub
	}

	public OtherIssue(Date date, String description,Integer id) {
		super();
		this.date = date;
		this.description = description;
		//this.filePath = filePath;
		this.user = new User(id);
	}

	public String getOtherIssueId() {
		return otherIssueId;
	}

	public void setOtherIssueId(String otherIssueId) {
		this.otherIssueId = otherIssueId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

//	public String getFilePath() {
//		return filePath;
//	}
//
//	public void setFilePath(String filePath) {
//		this.filePath = filePath;
//	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "OtherIssue [otherIssueId=" + otherIssueId + ", date=" + date + ", description=" + description
				+ ", user=" + user + "]";
	}
	
	
	

}
