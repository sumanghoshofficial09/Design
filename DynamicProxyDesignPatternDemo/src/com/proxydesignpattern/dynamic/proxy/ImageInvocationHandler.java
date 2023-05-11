package com.proxydesignpattern.dynamic.proxy;

import java.awt.geom.Point2D;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import com.proxydesignpattern.pojo.BitmapImage;
import com.proxydesignpattern.pojo.Image;

public class ImageInvocationHandler implements InvocationHandler {
	
	private String fileName;
	private BitmapImage image;
	private Point2D location;
	
	
	private static Method setLocationMethod;
	private static  Method getLocationMethod ;
	private static  Method renderMethod ;
	
	static {
		
		try {
			setLocationMethod=Image.class.getMethod("setLocation", new Class[] {Point2D.class});
			getLocationMethod=Image.class.getMethod("getLocation", null);
			renderMethod=Image.class.getMethod("render", null);
		} catch (NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	
	public ImageInvocationHandler(String fileName) {
		super();
		this.fileName = fileName;
	}








	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		System.out.println("Invoking method "+method.getName());
		
		if(method.equals(setLocationMethod))
		{
			return handleSetLocation(args);
		}
		else if (method.equals(getLocationMethod))
		{
			return handleGetLocation();
		}
		else if(method.equals(renderMethod))
		{
			return handleRender();
		}
		
		return null;
}








	private Object handleRender() {
		
		if(image==null)
		{
			image = new BitmapImage(fileName);
			if(location!=null)
			{
				image.setLocation(location);
			}
		}
		image.render();
		
		return null;
	}








	private Point2D handleGetLocation() {
		if(image!=null)
		{
			return image.getLocation();
		}
		else
		{
			return this.location;
		}
	}








	private Object handleSetLocation(Object[] args) {
		// TODO Auto-generated method stub
		if(image!=null)
		{
			image.setLocation((Point2D) args[0]);
		}
		else
		{
			this.location=(Point2D) args[0];
		}
		return null;
	
	}
	
}
