package com.srp.tax;

import com.srp.nonviolation.EmployeeNonViolatingSRP;


/*
* 
* 
* this hold the srp principle 
* 
* as this class has one and only one reason to change 
*/
public class EmployeeTAxCalculator {

	
	public void calculateTax(EmployeeNonViolatingSRP  emp)
	{
		if(emp.getEmployeeType().equals("fulltime "))
		{
			System.out.println("full time employee tax");
		}
		if(emp.getEmployeeType().equals("part time "))
		{
			System.out.println("part time employee tax");
		}
		
	}
}
