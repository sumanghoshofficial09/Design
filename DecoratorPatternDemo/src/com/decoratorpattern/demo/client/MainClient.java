package com.decoratorpattern.demo.client;

import com.decoratorpattern.demo.component.Message;
import com.decoratorpattern.demo.component.TextMessage;
import com.decoratorpattern.demo.decorator.Base64EncodedMessage;
import com.decoratorpattern.demo.decorator.HtmlEncodedMessage;

public class MainClient {
	
	public static void main(String args[])
	{
		Message  message = new TextMessage("<h1>Sample message</h1> ");
		
		System.out.println(message.getContent());
		
		System.out.println(new HtmlEncodedMessage(message).getContent());
		
		System.out.println(new Base64EncodedMessage(message).getContent());
	}

}
