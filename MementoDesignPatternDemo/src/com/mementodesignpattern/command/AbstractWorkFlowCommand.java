package com.mementodesignpattern.command;

import com.mementodesignpattern.originator.WorkflowDesigner;
import com.mementodesignpattern.pojos.Workflow;

public abstract class AbstractWorkFlowCommand implements WorkFlowCommand {
	
	protected WorkflowDesigner.Memento memento;
	protected WorkflowDesigner reciever;
	public AbstractWorkFlowCommand(WorkflowDesigner reciever) {
		super();
		this.reciever = reciever;
	}
	
	@Override
	public 	void undo()
	{
		reciever.setMemento(memento);
	}
			
	

}
