package com.chainofresponsibility.client;

import java.time.LocalDate;
import java.util.concurrent.ForkJoinPool.ManagedBlocker;

import com.chainofresponsibility.pojo.Director;
import com.chainofresponsibility.pojo.LeaveApplication;
import com.chainofresponsibility.pojo.LeaveApplication.Type;
import com.chainofresponsibility.pojo.LeaveApprover;
import com.chainofresponsibility.pojo.Manager;
import com.chainofresponsibility.pojo.ProjectLead;

public class MainClient {
	
	public static void main(String args[])
	{
		LeaveApplication  application  = new LeaveApplication(Type.PTO, LocalDate.now(), LocalDate.now().plusDays(10));
		
		LeaveApprover approver  = createChain();
		
		approver.processLeaveApplication(application);
	}
	
	public static LeaveApprover  createChain()
	{
		Director director   = new Director(null);
		Manager manager  = new Manager(director);
		ProjectLead projectLead = new ProjectLead(manager);
		
		return projectLead;
		
	}

}
