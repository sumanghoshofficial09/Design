package com.abstractfactory.pattern.factory;

import com.abstractfactory.pattern.pojo.Instance;
import com.abstractfactory.pattern.storage.Storage;

public interface ResoureFactory {
	
	public Instance createInstance(int capacity);
	
	public Storage  createStorage(int mib);

}
