package com.commanddesignpattern.service;

public class EWSService {
	
	public void addMember(String contact,String contactGroup)
	{
		System.out.println("Added "+contact+" to the group "+contactGroup);
	}
	
	public void removeMember(String contact,String contactGroup)
	{
		System.out.println("Removed "+contact+" to the group "+contactGroup);
	}

}
