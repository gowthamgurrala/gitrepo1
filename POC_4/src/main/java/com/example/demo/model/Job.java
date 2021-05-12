package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity(name = "job")
public class Job {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String jobTitle;
	private String jobDescription;
	private String country;
	private String state;
	private String availability;
	private int replyRate;
	private int payRate;
	private int experience;
	private String skills;
	private String language;
	private String jobType;
	

	public Job() {
		super();
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getJobDescription() {
		return jobDescription;
	}

	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
	}

	public int getReplyRate() {
		return replyRate;
	}

	public void setReplyRate(int replyRate) {
		this.replyRate = replyRate;
	}

	public int getPayRate() {
		return payRate;
	}

	public void setPayRate(int payRate) {
		this.payRate = payRate;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getJobType() {
		return jobType;
	}

	public void setJobType(String jobType) {
		this.jobType = jobType;
	}



	@Override
	public String toString() {
		return "Job [id=" + id + ", jobTitle=" + jobTitle + ", jobDescription=" + jobDescription + ", country="
				+ country + ", state=" + state + ", availability=" + availability + ", replyRate=" + replyRate
				+ ", payRate=" + payRate + ", experience=" + experience + ", skills=" + skills + ", language="
				+ language + ", jobType=" + jobType + ", ]";
	}
	
	
}
