package com.abccomanytech.jobservice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.abccomanytech.jobservice.model.JobDetails;

@Repository
public interface JobRepository extends CrudRepository<JobDetails,Long> {

}
