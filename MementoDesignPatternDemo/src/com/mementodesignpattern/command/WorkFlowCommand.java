package com.mementodesignpattern.command;

public interface WorkFlowCommand {
	
	void execute();
	
	void undo();

}
