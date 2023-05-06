package com.decoratorpattern.demo.decorator;

import java.util.Base64;

import org.apache.commons.lang3.StringEscapeUtils;

import com.decoratorpattern.demo.component.Message;

public class Base64EncodedMessage implements Message {
	
	private Message msg;
	
	

	public Base64EncodedMessage(Message msg) {
		super();
		this.msg = msg;
	}



	@Override
	public String getContent() {
		// TODO Auto-generated method stub
		return Base64.getEncoder().encodeToString(msg.getContent().getBytes());
	}

}
