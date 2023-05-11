package com.proxydesignpattern.factory;

import java.lang.reflect.Proxy;

import com.proxydesignpattern.dynamic.proxy.ImageInvocationHandler;
import com.proxydesignpattern.pojo.Image;

public class ImageFactory {
	
	public static Image getImage(String fileName)
	{
		return (Image)Proxy.newProxyInstance(ImageFactory.class.getClassLoader(), new Class[] {Image.class}, new ImageInvocationHandler(fileName));
	}

}
