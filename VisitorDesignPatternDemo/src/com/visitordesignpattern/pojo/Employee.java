package com.visitordesignpattern.pojo;

import java.util.Collection;

import com.visitordesignpattern.visitor.Visitor;

public interface Employee {
	
	int getPerformaceRating();
	
	void setPerformanceRating(int rating);
	
	Collection<Employee> getDirectReports();
	
	int getEmployeeId();
	
	void accept(Visitor visitor);

}
