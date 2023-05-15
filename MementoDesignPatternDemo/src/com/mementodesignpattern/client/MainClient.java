package com.mementodesignpattern.client;

import java.util.LinkedList;

import com.mementodesignpattern.command.AddStepsCommand;
import com.mementodesignpattern.command.CreateCommand;
import com.mementodesignpattern.command.WorkFlowCommand;
import com.mementodesignpattern.originator.WorkflowDesigner;

public class MainClient {
	
	public static void main(String args[])
	{
		WorkflowDesigner designer = new WorkflowDesigner();
		LinkedList<WorkFlowCommand> commands = runCommands(designer);
		
		designer.print();
		
		undoLastCommand(commands);
		designer.print();
		undoLastCommand(commands);
		designer.print();
		undoLastCommand(commands);
		designer.print();
		undoLastCommand(commands);
		designer.print();
		undoLastCommand(commands);
		designer.print();
		
	}
	
	
	public static LinkedList<WorkFlowCommand> runCommands(WorkflowDesigner designer)
	{
		LinkedList<WorkFlowCommand> commands = new LinkedList<>();
		
		WorkFlowCommand cmd = new CreateCommand(designer,"Leave Workflow");
		
		commands.addLast(cmd);
		
		cmd.execute();
		
		cmd = new AddStepsCommand(designer, "Create leave application");
		commands.addLast(cmd);
		cmd.execute();
		
		
		cmd = new AddStepsCommand(designer, "Submit Application");
		commands.addLast(cmd);
		cmd.execute();
		
		
		cmd = new AddStepsCommand(designer, "Application Approved");
		commands.addLast(cmd);
		cmd.execute();
		
		return commands;
		
		
	}
	
	private static void undoLastCommand(LinkedList<WorkFlowCommand> commands)
	{
		if(!commands.isEmpty())
		{
			commands.removeLast().undo();
		}
	}

}
