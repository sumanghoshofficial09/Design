package com.proxydesignpattern.proxy;

import java.awt.geom.Point2D;

import com.proxydesignpattern.pojo.BitmapImage;
import com.proxydesignpattern.pojo.Image;

public class ImageProxy implements Image {
	
	private BitmapImage image;
	
	String name;
	private Point2D  location;
	

	public ImageProxy(String name) {
		
		this.name = name;
	}

	@Override
	public void setLocation(Point2D point2d) {
		if(image!=null)
		{
			image.setLocation(point2d);
		}
		else
		{
			this.location=point2d;
		}
		
		
	}

	@Override
	public Point2D getLocation() {
		
		if(image!=null)
		{
			return image.getLocation();
		}
		return location;
	}

	@Override
	public void render() {
		
		if(image==null)
		{
			image = new BitmapImage(name);
			if(location!=null)
			{
				image.setLocation(location);
			}
			
			
		}
		
		image.render(); 
		
		
	}

}
