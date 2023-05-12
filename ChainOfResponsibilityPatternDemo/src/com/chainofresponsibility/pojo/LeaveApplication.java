package com.chainofresponsibility.pojo;

import java.time.LocalDate;

public class LeaveApplication {
	
	public enum Type {Sick,PTO,LOP};
	public enum Status {Pending,Approved,Rejected};
	
	private Type type;
	
	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public LocalDate getFrom() {
		return from;
	}

	public void setFrom(LocalDate from) {
		this.from = from;
	}

	public LocalDate getTo() {
		return to;
	}

	public void setTo(LocalDate to) {
		this.to = to;
	}

	public String getProcessedBy() {
		return processedBy;
	}

	public void setProcessedBy(String processedBy) {
		this.processedBy = processedBy;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	private LocalDate from;
	
	private LocalDate  to;
	
	private String processedBy;
	
	private Status status;

	public LeaveApplication(Type type, LocalDate from, LocalDate to) {
		super();
		this.type = type;
		this.from = from;
		this.to = to;
	}

	public int getNoOfDays() {
		// TODO Auto-generated method stub
		return this.to.compareTo(from);
	}

	public void approve(String role) {
		System.out.println(this.getType() + " Leave got approved");
		
	}
	
	

}
