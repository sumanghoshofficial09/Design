package com.mementodesignpattern.originator;

import com.mementodesignpattern.pojos.Workflow;

/**
 * 
 * @author ciphe
 *
 *this class 
 */
public class WorkflowDesigner {
	
	private Workflow workflow;
	
	private Memento memento;
	
	public void createWorkFlow(String name)
	{
		this.workflow = new Workflow(name);
	}
	
	public Workflow  getWorkFlow()
	{
		return this.getWorkFlow();
	}
	
	public void addStep(String step)
	{
		this.workflow.addStep(step);
	}
	
	public void removeStep(String step)
	{
		this.workflow.removeStep(step);
		
	}

	public Workflow getWorkflow() {
		return workflow;
	}

	public void setWorkflow(Workflow workflow) {
		this.workflow = workflow;
	}

	public Memento getMemento() {
		if(workflow==null)
		{
			return new Memento();
		}
		return new Memento( workflow.getSteps(), workflow.getName());
			
	}
	
	public void print()
	{
		System.out.println(workflow);
	}

	public void setMemento(Memento memento) {
		
		if(memento.isEmpty())
		{
			this.workflow=null;
			
		}
		else
		{
			this.workflow = new Workflow(memento.getName(), memento.getSteps());
		}
		
	}
	
	public class Memento
	{
		private String[] steps;
		private String[] getSteps() {
			return steps;
		}

		private String getName() {
			return name;
		}

		private String name;
		
		private Memento()
		{
			
		}
		private Memento(String[] steps, String name)
		{
			this.steps=steps;
			this.name=name;
			
		}
		
		private boolean isEmpty()
		{
			if(this.getSteps()==null && this.getName()==null)
				return true;
			
			return false;
		}
				
		
	}
	
}
