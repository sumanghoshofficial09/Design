package com.chainofresponsibility.pojo;

public abstract class Employee implements LeaveApprover {
	
	private String role;
	
	private LeaveApprover successor;
	
	public Employee(String role,LeaveApprover successor)
	{
		this.role=role;
		this.successor=successor;
	}

	@Override
	public void processLeaveApplication(LeaveApplication application) {
		if(!processLeaveRequest(application) && successor!=null)
		{
			successor.processLeaveApplication(application);
		}
		else
		{
		
		System.out.println("approved by "+this.getApprverRole());
		}
		
	}
	
	public abstract boolean processLeaveRequest(LeaveApplication application);


	@Override
	public String getApprverRole() {
		// TODO Auto-generated method stub
		return role;
	}

}
