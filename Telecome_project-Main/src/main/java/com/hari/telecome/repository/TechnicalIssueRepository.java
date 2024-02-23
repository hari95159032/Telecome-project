package com.hari.telecome.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hari.telecome.Entity.TechnicalIssue;

@Repository
public interface TechnicalIssueRepository extends CrudRepository<TechnicalIssue, String> {

}
