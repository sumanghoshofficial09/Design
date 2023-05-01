package com.abstractfactory.pattern.pojo;

import com.abstractfactory.pattern.storage.Storage;

public interface Instance {
	
	public void start();
	
	public void stop();
	
	public void attachStorage(Storage storage);

}
