package com.prototype.pattern.pojo;

public abstract class AbstractPrototype implements Cloneable {
	
	int abstractPrototypeVariable=0;
	
	
	
	
	
	
	public int getAbstractPrototypeVariable() {
		return abstractPrototypeVariable;
	}



	public void setAbstractPrototypeVariable(int abstractPrototypeVariable) {
		this.abstractPrototypeVariable = abstractPrototypeVariable;
	}



	@Override
	public AbstractPrototype clone() throws CloneNotSupportedException
	{
		AbstractPrototype prototype = (AbstractPrototype) super.clone();
		prototype.initialize();
		return prototype;
		
	}
	
	
	
	public void method1()
	{
		abstractPrototypeVariable=10;
	}
	
	protected void initialize()
	{
		abstractPrototypeVariable=0;
		
		reset();
	}
	
	protected abstract void reset();
	


}
