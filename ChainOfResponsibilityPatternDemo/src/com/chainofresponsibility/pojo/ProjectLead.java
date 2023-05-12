package com.chainofresponsibility.pojo;

public class ProjectLead extends Employee{

	public ProjectLead(LeaveApprover successor) {
		super("Project-Lead", successor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean processLeaveRequest(LeaveApplication application) {
		// TODO Auto-generated method stub
		//sick leave less than equal to two days 
		System.out.println("Reviewing By ProjectLead");
		if(application.getType()== LeaveApplication.Type.Sick)
		{
			
			if(application.getNoOfDays()<=2)
			{
				application.approve(this.getApprverRole());
				return true;
				
			}
		}
		return false;
	}

}
