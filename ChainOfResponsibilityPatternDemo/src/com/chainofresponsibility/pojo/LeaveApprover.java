package com.chainofresponsibility.pojo;

/*
 * abstarct handler
 * 
 * we need to pass the request to next handler if we cant handle in this handler 
 */
public interface LeaveApprover {
	
	void processLeaveApplication(LeaveApplication application);
	
	String getApprverRole();

}
