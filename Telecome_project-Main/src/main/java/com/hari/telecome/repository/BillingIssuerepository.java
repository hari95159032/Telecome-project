package com.hari.telecome.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hari.telecome.Entity.BillingIssue;

@Repository
public interface BillingIssuerepository extends CrudRepository<BillingIssue, String>{

}
