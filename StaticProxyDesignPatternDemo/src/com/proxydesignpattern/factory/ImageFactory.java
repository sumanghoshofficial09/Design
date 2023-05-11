package com.proxydesignpattern.factory;

import com.proxydesignpattern.pojo.Image;
import com.proxydesignpattern.proxy.ImageProxy;

public class ImageFactory {
	
	public static Image getImage(String name)
	{
		return new ImageProxy(name);
	}

}
