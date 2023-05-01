package com.abstractfactory.pattern.factory;

import com.abstractfactory.pattern.pojo.GoogleCloudComputeInstance;
import com.abstractfactory.pattern.pojo.Instance;
import com.abstractfactory.pattern.storage.GoogleCloudStorage;
import com.abstractfactory.pattern.storage.Storage;

public class GoogleCloudResourceFactory implements ResoureFactory {

	@Override
	public Instance createInstance(int capacity) {
		// TODO Auto-generated method stub
		return new GoogleCloudComputeInstance();
	}

	@Override
	public Storage createStorage(int mib) {
		// TODO Auto-generated method stub
		return new GoogleCloudStorage();
	}

}
