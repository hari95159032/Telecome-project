package com.hari.telecome.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hari.telecome.Entity.OtherIssue;

@Repository
public interface OthetrIssueRepository extends CrudRepository<OtherIssue, String> {

}
