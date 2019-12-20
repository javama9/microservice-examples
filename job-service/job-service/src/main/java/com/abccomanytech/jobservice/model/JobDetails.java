package com.abccomanytech.jobservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="JOB_DETAILS")
public class JobDetails {

	@Id // It represents the primary key
	@GeneratedValue(strategy= GenerationType.AUTO) // it generates primary key in incremental order
	private long id;
	private String jobTitle;
	private String businessUnit;
	private String jobLocation;
	private String employmentType;
	private String levelOfExpereince;
	private int numberOfOpening;
	private boolean isBillable;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public String getBusinessUnit() {
		return businessUnit;
	}
	public void setBusinessUnit(String businessUnit) {
		this.businessUnit = businessUnit;
	}
	public String getJobLocation() {
		return jobLocation;
	}
	public void setJobLocation(String jobLocation) {
		this.jobLocation = jobLocation;
	}
	public String getEmploymentType() {
		return employmentType;
	}
	public void setEmploymentType(String employmentType) {
		this.employmentType = employmentType;
	}
	public String getLevelOfExpereince() {
		return levelOfExpereince;
	}
	public void setLevelOfExpereince(String levelOfExpereince) {
		this.levelOfExpereince = levelOfExpereince;
	}
	public int getNumberOfOpening() {
		return numberOfOpening;
	}
	public void setNumberOfOpening(int numberOfOpening) {
		this.numberOfOpening = numberOfOpening;
	}
	public boolean isBillable() {
		return isBillable;
	}
	public void setBillable(boolean isBillable) {
		this.isBillable = isBillable;
	}
	
	
	
	
}