package com.adapterpattern.demo.adapter;

import com.adapterpattern.demo.adaptee.Employee;
import com.adapterpattern.demo.client.Customer;

public class EmployeeClassAdapter  implements Customer {
     private Employee employee;
     
     
	public EmployeeClassAdapter(Employee employee) {
		super();
		this.employee = employee;
	}

	@Override
	public String getName() {
		return employee.getFullname();
	}

	@Override
	public String getDesignation() {
		// TODO Auto-generated method stub
		return employee.getJobTitle();
	}

	@Override
	public String getAddress() {
		// TODO Auto-generated method stub
		return employee.getOfficelocation();
	}

}
