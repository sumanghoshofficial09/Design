package com.mementodesignpattern.command;

import com.mementodesignpattern.originator.WorkflowDesigner;

public class RemoveStepsCommand extends AbstractWorkFlowCommand{
	
	private String step;

	public RemoveStepsCommand(WorkflowDesigner reciever,String step) {
		super(reciever);
		this.step=step;
		
	}

	@Override
	public void execute() {
		this.memento= reciever.getMemento();
		reciever.removeStep(step);
		
	}

}
