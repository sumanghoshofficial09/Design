package com.pattern.signleton.enumregistry;

public enum EnumRegistry {
	
	INSTANCE ;
	
	
	public EnumRegistry getInstance()
	{
		return EnumRegistry.INSTANCE;
	}

}
