package com.prototype.pattern.pojo;

public class ConcretePrototypeA extends  AbstractPrototype {
	
	private int concretePrototypeAVariable=0;

	
	// resetting the state post clone is important
	@Override
	protected void reset() {
		this.concretePrototypeAVariable=0;
		
	}
	
	
	protected void method2()
	{
		this.concretePrototypeAVariable=10;
	}

}
