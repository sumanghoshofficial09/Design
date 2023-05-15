package com.mementodesignpattern.pojos;

import java.util.Arrays;
import java.util.LinkedList;

public class Workflow {
	
	
	private LinkedList<String> steps;
	
	private String name;

	public Workflow(String name) {
		
		this.name = name;
		this.steps = new LinkedList<>();
	}
	
	public Workflow(String name, String ... steps)
	{
		this.name=name;
		
		this.steps = new LinkedList<>();
		
		if(steps!=null && steps.length>0)
		{
			Arrays.stream(steps).forEach(s -> this.steps.add(s));
		}
		{
			
		}
		
	}
	public String[] getSteps() {
		return steps.toArray(new String[steps.size()]);
	}


	public String getName() {
		return name;
	}


	@Override
	public String toString() {
		return "Workflow [steps=" + steps + ", name=" + name + "]";
	}
	
	public void addStep(String step)
	{
		steps.add(step);
	}
	
	public void removeStep(String step)
	{
		this.steps.remove(step);
	}
	
	
	
	

}
