package com.proxydesignpattern.client;

import java.awt.Point;

import com.proxydesignpattern.factory.ImageFactory;
import com.proxydesignpattern.pojo.Image;

public class MainClient {
	
	public static void main(String args[])
	{
		Image image = ImageFactory.getImage("A1.bmp");
		image.setLocation(new Point(10, 10));
		image.getLocation();
		
		image.render();
		
		
	}

}
