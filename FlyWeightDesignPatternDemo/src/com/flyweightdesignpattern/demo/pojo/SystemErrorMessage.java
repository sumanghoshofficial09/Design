package com.flyweightdesignpattern.demo.pojo;

public class SystemErrorMessage implements ErrorMessage {
	
	/**
	 * intrinsic properties 
	 */
	String messageTemplate;
	String baseUrl;

	
	public SystemErrorMessage(String messageTemplate, String baseUrl) {
		super();
		this.messageTemplate = messageTemplate;
		this.baseUrl = baseUrl;
	}


	@Override
	public String getText(String code) {
		// TODO Auto-generated method stub
		return messageTemplate.replace("$errorCode", code)+ baseUrl+code;
	}

}
