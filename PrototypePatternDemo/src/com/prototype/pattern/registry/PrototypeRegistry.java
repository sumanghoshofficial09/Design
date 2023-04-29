package com.prototype.pattern.registry;

import java.util.HashMap;
import java.util.Map;

import com.prototype.pattern.pojo.AbstractPrototype;

public class PrototypeRegistry {
	
	Map<String,AbstractPrototype> items = new  HashMap<String,AbstractPrototype>();
	
	public void addItem(String id, AbstractPrototype item)
	{
		items.put(id, item);
	}
	
	public AbstractPrototype getById(String id)
	{
		return items.get(id);
	}

}
