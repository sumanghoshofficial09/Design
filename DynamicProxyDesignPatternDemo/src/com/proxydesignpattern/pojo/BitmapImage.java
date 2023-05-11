package com.proxydesignpattern.pojo;

import java.awt.geom.Point2D;

public class BitmapImage implements Image {
	
	private Point2D location;
	private String name;
	
	

	public BitmapImage(String fileName) {
		System.out.println("Loaded from disk"+fileName);
		this.name = fileName;
	}

	@Override
	public void setLocation(Point2D point2d) {
		
		location = point2d;

	}

	@Override
	public Point2D getLocation() {
		// TODO Auto-generated method stub
		return location;
	}

	@Override
	public void render() {
		System.out.println("Rendered image "+name);

	}

}
