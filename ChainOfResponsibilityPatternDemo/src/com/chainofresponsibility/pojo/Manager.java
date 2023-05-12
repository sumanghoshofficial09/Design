package com.chainofresponsibility.pojo;

public class Manager extends Employee{

	public Manager(LeaveApprover successor) {
		super("Manager", successor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean processLeaveRequest(LeaveApplication application) {
		
		System.out.println("Reviewing By Manager");
		 switch (application.getType())
		 {
		 
		 case Sick : 
			 application.approve(getApprverRole());
			 return true;
			 
		 case PTO:
			 if(application.getNoOfDays()<=5)
			 {
				 application.approve(getApprverRole());
				 return true;
			 }
		 
		 }
		 return false;
	}
	

}
