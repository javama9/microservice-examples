package com.abccomanytech.jobservice.service;    // business logic implemetation 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.abccomanytech.jobservice.model.JobDetails;
import com.abccomanytech.jobservice.repository.JobRepository;

@Service
public class JobService {   
	
	@Autowired
	private JobRepository jobRepository;
	
	public JobDetails save(JobDetails input) { // JobDetails is the input of this method
		
		//businessUnit is mandatory
		if(StringUtils.isEmpty(input.getBusinessUnit())) {
			throw new RuntimeException("Business unit cannot be null");
		}
		
		return jobRepository.save(input);
		
	}
	
	

}
