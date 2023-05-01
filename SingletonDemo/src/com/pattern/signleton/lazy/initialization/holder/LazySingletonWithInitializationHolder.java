
package com.pattern.signleton.lazy.initialization.holder;

public class LazySingletonWithInitializationHolder {
	
	
	private LazySingletonWithInitializationHolder()
	{
		
	}
	
	
	private static class RegistryHolder
	{
		static LazySingletonWithInitializationHolder INSTANCE = new LazySingletonWithInitializationHolder();
	}
	
	
	public static LazySingletonWithInitializationHolder  getInstance()
	{
		return RegistryHolder.INSTANCE;
	}
	
	

}
