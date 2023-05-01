package com.pattern.signleton.lazy.client;

import com.pattern.signleton.lazy.LazySingleton;

public class Client {
	
	public static void main(String args[])
	{
		LazySingleton  instance1 = LazySingleton.getInstance();
		LazySingleton  instance2 = LazySingleton.getInstance();
		
		if(instance1==instance2)
		{
			System.out.println("Both objects are equal");
		}
		else
		{
			System.out.println("Both objects are not equal");
		}
	}

}
