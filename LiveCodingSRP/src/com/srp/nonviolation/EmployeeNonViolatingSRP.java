package com.srp.nonviolation;

import com.srp.dao.EmployeeRepository;
import com.srp.tax.EmployeeTAxCalculator;

public class EmployeeNonViolatingSRP {
	
	private String employeId;
	private String employeeName;
	private String employeeAddress;
	private String contactNumber;
	private String employeeType;
	public String getEmployeId() {
		return employeId;
	}
	public void setEmployeId(String employeId) {
		this.employeId = employeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeAddress() {
		return employeeAddress;
	}
	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getEmployeeType() {
		return employeeType;
	}
	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}
	
	
	
	// this method is good as it has no reason to change
	public void calculateTax()
	{
		new EmployeeTAxCalculator().calculateTax(this);
	}
	
	public void save()
	{
		new EmployeeRepository().save(this);
	}
	
	

}
