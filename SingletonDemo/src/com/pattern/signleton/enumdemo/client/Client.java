package com.pattern.signleton.enumdemo.client;

import com.pattern.signleton.enumregistry.EnumRegistry;

public class Client {
	public static void main(String args[])
	{
		EnumRegistry instance1 = EnumRegistry.INSTANCE;
		
		EnumRegistry instance2 = EnumRegistry.INSTANCE;
		
		System.out.println(instance1.hashCode());
		
		System.out.println(instance2.hashCode());
		
		if(instance1== instance2)
		{
			System.out.println("Objects are equal");
		}
		else
		{
			System.out.println("objects are not equal");
		}
		
		/* System.out.println(instance1.INSTANCE.; */
		
	}

}
