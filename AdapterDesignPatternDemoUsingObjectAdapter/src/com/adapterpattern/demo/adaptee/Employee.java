package com.adapterpattern.demo.adaptee;


/**
 * 
 * @author ciphe
 * 
 * this is our adaptee class
 *
 */
public class Employee {
	
	private String fullname;
	
	private String jobTitle;
	
	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getOfficelocation() {
		return officelocation;
	}

	public void setOfficelocation(String officelocation) {
		this.officelocation = officelocation;
	}

	private String officelocation;
	
	

}
