package com.abccomanytech.jobservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abccomanytech.jobservice.model.JobDetails;
import com.abccomanytech.jobservice.service.JobService;

@RestController
@RequestMapping("/job")
public class JobController {

	@Autowired
	private JobService jobService;
	
	@PostMapping
	public ResponseEntity<?> save(@RequestBody JobDetails jobDetails) {
		return new ResponseEntity(jobService.save(jobDetails), HttpStatus.CREATED);
	}
}
