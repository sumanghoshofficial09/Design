package com.abstractfactory.pattern.client;

import com.abstractfactory.pattern.factory.AwsResourceFactory;
import com.abstractfactory.pattern.factory.GoogleCloudResourceFactory;
import com.abstractfactory.pattern.factory.ResoureFactory;
import com.abstractfactory.pattern.pojo.Instance;
import com.abstractfactory.pattern.storage.Storage;

public class MainClient {
	
	public MainClient(ResoureFactory factory) {
		super();
		this.factory = factory;
	}



	private ResoureFactory factory;
	
	
	public Instance createServer(int insCapacity, int storageMib)
	{
		Instance instance = factory.createInstance(insCapacity);
		Storage storage = factory.createStorage(storageMib);
		instance.attachStorage(storage);
		return instance;
	}
	
	public static void main(String args[])
	{
		
		MainClient  client1 = new MainClient(new GoogleCloudResourceFactory());
		
		MainClient client2 = new MainClient(new AwsResourceFactory());
		
		
		System.out.println(client1.createServer(0, 0));
		
		System.out.println(client2.createServer(0, 0));
		
		
		
	}

}
