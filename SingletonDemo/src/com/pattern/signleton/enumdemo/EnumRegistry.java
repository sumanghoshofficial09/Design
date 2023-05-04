package com.pattern.signleton.enumdemo;

public enum EnumRegistry {
	
	INSTANCE;
	
	
	public static void testSingleton()
	{
		System.out.println("Enum is behaving like singleton ");
	}
	

}
