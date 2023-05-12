package com.chainofresponsibility.pojo;

public class Director extends Employee{

	public Director(LeaveApprover successor) {
		super("Director", successor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean processLeaveRequest(LeaveApplication application) {
		
		System.out.println("Reviewing By Director");
		
		 switch (application.getType())
		 {
		 
		 case PTO : 
			 application.approve(getApprverRole());
			 return true;
			 
		 
		 
		 }
		 return false;
	}
	

}
