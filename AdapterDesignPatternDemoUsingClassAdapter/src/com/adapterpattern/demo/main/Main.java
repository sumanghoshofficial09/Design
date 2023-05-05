package com.adapterpattern.demo.main;

import com.adapterpattern.demo.adaptee.Employee;
import com.adapterpattern.demo.adapter.EmployeeClassAdapter;
import com.adapterpattern.demo.client.BusinessCardDesigner;

public class Main {
	
	public static void main(String args[])
	{
		
	
		
		EmployeeClassAdapter adapter = new EmployeeClassAdapter();
		
		populateEmployeeData(adapter);
		
		BusinessCardDesigner  designer =  new BusinessCardDesigner();
		
		String card=designer.designCard(adapter);
		
		System.out.println(card);
		
		
		
	}
	
	
	public static void populateEmployeeData(Employee employee)
	{
		
		employee.setFullname("Suman Ghosh");
		employee.setJobTitle("Specialist Technology");
		
		employee.setOfficelocation("Bangalore ");
		
	}

}
