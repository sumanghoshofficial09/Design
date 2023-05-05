package com.adapterpattern.demo.adapter;

import com.adapterpattern.demo.adaptee.Employee;
import com.adapterpattern.demo.client.Customer;

public class EmployeeClassAdapter extends Employee implements Customer {

	@Override
	public String getName() {
		return this.getFullname();
	}

	@Override
	public String getDesignation() {
		// TODO Auto-generated method stub
		return this.getJobTitle();
	}

	@Override
	public String getAddress() {
		// TODO Auto-generated method stub
		return this.getOfficelocation();
	}

}
