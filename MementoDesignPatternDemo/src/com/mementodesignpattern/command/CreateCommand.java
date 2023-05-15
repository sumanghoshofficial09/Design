package com.mementodesignpattern.command;

import com.mementodesignpattern.originator.WorkflowDesigner;

public class CreateCommand extends AbstractWorkFlowCommand {
	
	String name;

	public CreateCommand(WorkflowDesigner reciever,String name) {
		super(reciever);
		this.name=name;
	}

	@Override
	public void execute() {
		this.memento=reciever.getMemento();
		reciever.createWorkFlow(name);
		
	}

}
