package com.prototype.pattern.pojo;

public class ConcretePrototypeB extends AbstractPrototype {
	
	private int  concretePrototypeBVariable=0;
	
	
	public ConcretePrototypeB clone() throws CloneNotSupportedException
	{
		throw new CloneNotSupportedException("CLone not supported here ");
		
		
	}
	
	public int getConcretePrototypeBVariable() {
		return concretePrototypeBVariable;
	}

	public void setConcretePrototypeBVariable(int concretePrototypeBVariable) {
		this.concretePrototypeBVariable = concretePrototypeBVariable;
	}

	public void method3()
	{
		concretePrototypeBVariable=44;
		
	}

	@Override
	protected void reset() {
		concretePrototypeBVariable=0;
		
	}

}
