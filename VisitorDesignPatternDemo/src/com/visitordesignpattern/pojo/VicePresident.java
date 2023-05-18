package com.visitordesignpattern.pojo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.visitordesignpattern.visitor.Visitor;

public class VicePresident extends AbstractEmployee {
	
	private List<Employee> direcReports = new ArrayList<>();

	public VicePresident(String name, Employee ...employees ) {
		super(name);
		Arrays.stream(employees).forEach(direcReports::add);
	}
	
	
	
	@Override
	public Collection<Employee> getDirectReports() {
		// TODO Auto-generated method stub
		return direcReports;
	}



	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
		
	}
	
}
