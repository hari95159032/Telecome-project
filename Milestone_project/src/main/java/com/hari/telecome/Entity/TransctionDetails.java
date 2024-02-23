package com.hari.telecome.Entity;

import java.sql.Date;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;




@Entity
public class TransctionDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer transactionId;
private LocalDateTime transactionDate;
private Integer recieverPhoneNumber;
private Integer transactionParty;
private double transactionAmount;
private String transactionType;

@ManyToOne
private UserDetails userDetails;

TransctionDetails(){
	
}

public TransctionDetails(Integer recieverPhoneNumber,Integer transactionParty, double transactionAmount,
		String transactionType, Integer id) {
	super();
	
	this.recieverPhoneNumber = recieverPhoneNumber;
	this.transactionParty=transactionParty;
	this.transactionAmount = transactionAmount;
	this.transactionType = transactionType;
	this.userDetails = new UserDetails(id);
}

public Integer getTransactionId() {
	return transactionId;
}

public void setTransactionId(Integer transactionId) {
	this.transactionId = transactionId;
}


public LocalDateTime getTransactionDate() {
	return transactionDate;
}

public void setTransactionDate(LocalDateTime transactionDate) {
	this.transactionDate = transactionDate;
}

public void setRecieverPhoneNumber(Integer recieverPhoneNumber) {
	this.recieverPhoneNumber = recieverPhoneNumber;
}


public void setTransactionParty(Integer transactionParty) {
	this.transactionParty = transactionParty;
}

public Integer getTransactionParty() {
	return transactionParty;
}

public void setTransactionAmount(Integer transactionAmount) {
	this.transactionAmount = transactionAmount;
}
public double getTransactionAmount() {
	return transactionAmount;
}


public String getTransactionType() {
	return transactionType;
}

public void setTransactionType(String transactionType) {
	this.transactionType = transactionType;
}

public UserDetails getUserDetails() {
	return userDetails;
}

public void setUserDetails(com.bankingapplication.entity.UserDetails userDetails2) {
	this.userDetails = userDetails;
}

@Override
public String toString() {
	return "TransctionDetails [transactionId=" + transactionId + ", transactionDate=" + transactionDate
			+ ", recieverPhoneNumber=" + recieverPhoneNumber + ", transactionParty=" + transactionParty
			+ ", transactionAmount=" + transactionAmount + ", transactionType=" + transactionType + ", userDetails="
			+ userDetails + "]";
}




}
