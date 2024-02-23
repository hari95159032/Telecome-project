package com.hari.telecome.Entity;

import java.sql.Date;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;

@Entity
public class BillingIssue {
	
	@Id
	private String billingIssueId;
	
	@PrePersist
	void generatedIssueId() {
		this.billingIssueId="Issue-"+UUID.randomUUID().toString().substring(2,10);
	}
	private Date date;
	
	private long accountNumber;
	
	private String natureOfEnquiry;
	
	private String description;
	
//	private String filePath;
	
	//private String contactPreference;
	
	@ManyToOne
	private User user;

	public BillingIssue(Date date, long accountNumber,String natureOfEnquiry, String description,Integer id) {
		this.date = date;
		this.accountNumber=accountNumber;
		this.natureOfEnquiry = natureOfEnquiry;
		this.description = description;
//		this.filePath = filePath;
//		this.contactPreference=contactPreference;
		this.user = new User(id);
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

//	public String getContactPreference() {
//		return contactPreference;
//	}
//
//	public void setContactPreference(String contactPreference) {
//		this.contactPreference = contactPreference;
//	}

	public String getBillingIssueId() {
		return billingIssueId;
	}

	public void setBillingIssueId(String billingIssueId) {
		this.billingIssueId = billingIssueId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getNatureOfEnquiry() {
		return natureOfEnquiry;
	}

	public void setNatureOfEnquiry(String natureOfEnquiry) {
		this.natureOfEnquiry = natureOfEnquiry;
	}

	public String getDescription() {
		return description;
	}

	public void setDetailedDescription(String detailedDescription) {
		this.description = detailedDescription;
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
		return "BillingIssue [billingIssueId=" + billingIssueId + ", date=" + date + ", accountNumber=" + accountNumber
				+ ", natureOfEnquiry=" + natureOfEnquiry + ", description=" + description + ", user=" + user + "]";
	}

		

}
