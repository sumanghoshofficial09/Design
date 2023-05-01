package com.abstractfactory.pattern.factory;

import com.abstractfactory.pattern.pojo.Ec2Instance;
import com.abstractfactory.pattern.pojo.Instance;
import com.abstractfactory.pattern.storage.S3Storage;
import com.abstractfactory.pattern.storage.Storage;

public class AwsResourceFactory implements ResoureFactory {

	@Override
	public Instance createInstance(int capacity) {
		// TODO Auto-generated method stub
		return new Ec2Instance(capacity);
	}

	@Override
	public Storage createStorage(int mib) {
		// TODO Auto-generated method stub
		return new S3Storage();
	}

}
