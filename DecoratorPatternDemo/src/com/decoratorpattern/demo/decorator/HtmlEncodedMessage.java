package com.decoratorpattern.demo.decorator;

import org.apache.commons.lang3.StringEscapeUtils;

import com.decoratorpattern.demo.component.Message;

public class HtmlEncodedMessage implements Message {
	
	private Message msg;
	
	

	public HtmlEncodedMessage(Message msg) {
		super();
		this.msg = msg;
	}



	@Override
	public String getContent() {
		// TODO Auto-generated method stub
		return StringEscapeUtils.escapeHtml4(msg.getContent());
	}

}
