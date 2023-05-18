package com.visitordesignpattern.pojo;

import java.util.Collection;
import java.util.Collections;

public abstract class  AbstractEmployee implements Employee {

	
	private int performanceRating;
	
	private String name;
	
	private static int employeeIdCounter = 101;
	
	private int employeeId;
	
	public AbstractEmployee(String name)
	{
		this.name=name;
		employeeId=employeeIdCounter++;
	}
	@Override
	public int getPerformaceRating() {
		// TODO Auto-generated method stub
		return performanceRating;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public void setPerformanceRating(int rating) {
		this.performanceRating=rating;
		
	}

	@Override
	public Collection<Employee> getDirectReports() {
		// TODO Auto-generated method stub
		return Collections.emptyList();
	}

	@Override
	public int getEmployeeId() {
		// TODO Auto-generated method stub
		return employeeId;
	}

}
