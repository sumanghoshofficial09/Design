package com.flyweightdesignpattern.demo.pojo;

import java.time.Duration;

/**
 * 
 * @author ciphe
 * 
 * we have completely different state
 * 
 *
 */
public class UserBannedErrorMessage implements ErrorMessage {
	
	private String caseId;
	private String remarks;
	
	private Duration  banDuration;
	
	private String msg;

	/**
	 * 
	 * @param caseId
	 * 
	 * Unshared Concrete Flyweight
	 */
	
	public UserBannedErrorMessage(String caseId) {
		this.caseId=caseId;
		remarks="You have violated term of use";
		banDuration=Duration.ofDays(2);
		
		msg="You are banned \n";
		msg+= caseId + "\n";
		msg+=remarks+"\n";
		msg+="Banned For "+banDuration.toHours()+" Hours";
		
		
				
				
			
	}

	@Override
	public String getText(String code) {
		// TODO Auto-generated method stub
		return msg;
	}

}
