package com.pattern.signleton.eager.client;

import com.pattern.signleton.eager.EagerRegistry;

public class Client {
	
	public static void main(String args[])
	{
		EagerRegistry eagerRegistry = EagerRegistry.getInstance();
		
		EagerRegistry eagerRegistry2 = EagerRegistry.getInstance();
		
		
		if(eagerRegistry == eagerRegistry2)
		{
			System.out.println("Object are equals");
		}
		else
		{
			System.out.println("Objects are not equal");
		}
		
		
	}

}
