package com.mementodesignpattern.command;

import com.mementodesignpattern.originator.WorkflowDesigner;

public class AddStepsCommand extends AbstractWorkFlowCommand{
	
	private String step;

	public AddStepsCommand(WorkflowDesigner reciever,String step) {
		super(reciever);
		this.step=step;
	}

	@Override
	public void execute() {
		this.memento =reciever.getMemento();
		
		reciever.addStep(step);
		
		
	}

}
