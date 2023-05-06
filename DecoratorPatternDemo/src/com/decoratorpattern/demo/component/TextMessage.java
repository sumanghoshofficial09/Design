package com.decoratorpattern.demo.component;

public class TextMessage implements Message {
	
	private String message;
	
	

	public TextMessage(String message) {
		super();
		this.message = message;
	}



	@Override
	public String getContent() {
		// TODO Auto-generated method stub
		return message;
	}

}
