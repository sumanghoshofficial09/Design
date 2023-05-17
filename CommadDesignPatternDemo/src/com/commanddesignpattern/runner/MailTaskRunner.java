package com.commanddesignpattern.runner;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.commanddesignpattern.command.Command;

public class MailTaskRunner implements Runnable {
	
	private Thread runner;
	
	private List<Command> pendingComamnds;
	
	private volatile boolean stop;
	
	private static final MailTaskRunner RUNNER = new  MailTaskRunner();
	
	public static MailTaskRunner  getInstance()
	{
		return RUNNER;
	}
	
	private MailTaskRunner()
	{
		pendingComamnds= new LinkedList<>();
		runner = new Thread(this);
		
		runner.start();
	}

	@Override
	public void run() {
		
		while(true)
		{
			Command command =null;
			
			synchronized (pendingComamnds) {
				
				if(pendingComamnds.isEmpty())
				{
					try {
						pendingComamnds.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						System.out.println("Runner "+this.runner.getName() +" Interrupted");
						
						if(stop)
						{
							System.out.println("Runner shutting down");
							return;
						}
					}
				}
				else
				{
					command = pendingComamnds.remove(0);
					
				}
				
			}
			
			if(command==null)
				return;
			
			command.execute();
		}
		
		
	}
	
	public void addCommand(Command command )
	{
		synchronized (pendingComamnds) {
			pendingComamnds.add(command);
			pendingComamnds.notifyAll();
			
		}
	}
	
	public void shutDown()
	{
		this.stop=true;
		this.runner.interrupt();
	}

}
