package com.prototype.pattern.client;

import com.prototype.pattern.pojo.AbstractPrototype;
import com.prototype.pattern.pojo.ConcretePrototypeA;
import com.prototype.pattern.pojo.ConcretePrototypeB;
import com.prototype.pattern.registry.PrototypeRegistry;

public class PrototypeClient {
	private static PrototypeRegistry myregistry=new PrototypeRegistry();
	public static void main(String args[])
	{
		AbstractPrototype obj1 =  new ConcretePrototypeA();
		
		AbstractPrototype obj2 =  new ConcretePrototypeB();
		
		
		
		
		obj1.method1();
		
		obj2.method1();
		
		myregistry.addItem("A", obj1);
		myregistry.addItem("B", obj2);
		
		
		System.out.println(obj1.getAbstractPrototypeVariable());
		
		
		try {
			AbstractPrototype  cloned1 = obj1.clone();
			
			AbstractPrototype  cloned2 = obj2.clone();
			
			
			
			System.out.println(cloned1.getAbstractPrototypeVariable());
			System.out.println(cloned2.getAbstractPrototypeVariable());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
