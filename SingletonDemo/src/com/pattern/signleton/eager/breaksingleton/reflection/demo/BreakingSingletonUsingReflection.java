package com.pattern.signleton.eager.breaksingleton.reflection.demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import com.pattern.signleton.eager.EagerRegistry;

public class BreakingSingletonUsingReflection {
	
	public static void main(String args[]) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException
	{
		EagerRegistry instance1 = EagerRegistry.getInstance();
		EagerRegistry instance2= null;
		
		Constructor<?> constructors[]=EagerRegistry.class.getDeclaredConstructors();
		
		for(Constructor<?> constructor : constructors)
		{
			constructor.setAccessible(true);
			
			Object obj= constructor.newInstance();
			instance2=(EagerRegistry) obj;
			break;
		}
		
		System.out.println(instance1);
		System.out.println(instance2);
		
		System.out.println(instance1.hashCode());
		System.out.println(instance2.hashCode());
	}

}
