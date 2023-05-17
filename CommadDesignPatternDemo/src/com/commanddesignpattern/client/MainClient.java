package com.commanddesignpattern.client;

import com.commanddesignpattern.command.AddMemberCommand;
import com.commanddesignpattern.command.Command;
import com.commanddesignpattern.runner.MailTaskRunner;
import com.commanddesignpattern.service.EWSService;

public class MainClient {
	public static void main(String args[]) throws InterruptedException
	{
		
		EWSService  service  = new EWSService();
		Command cm1 = new AddMemberCommand("s.g@gmail.com", "myoffshore@gmail.com", service);
		
		MailTaskRunner.getInstance().addCommand(cm1);
		
        Command cm2 = new AddMemberCommand("a.b@gmail.com", "myoffshore@gmail.com", service);
		
		MailTaskRunner.getInstance().addCommand(cm2);
		
		Thread.sleep(1000);
		
		MailTaskRunner.getInstance().shutDown();
	}

}
