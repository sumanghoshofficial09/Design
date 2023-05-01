package com.pattern.signleton.lazy.initialization.holder.client;

import com.pattern.signleton.lazy.initialization.holder.LazySingletonWithInitializationHolder;

public class Client {
	
	public static void main(String args[])
	{
		LazySingletonWithInitializationHolder  instance1 = LazySingletonWithInitializationHolder.getInstance();
		
		LazySingletonWithInitializationHolder  instance2 = LazySingletonWithInitializationHolder.getInstance();
		
		if(instance1==instance2)
		{
			System.out.println("Objects are equal");
		}
		else
		{
			System.out.println("Objects are not equal");
		}
	}

}
