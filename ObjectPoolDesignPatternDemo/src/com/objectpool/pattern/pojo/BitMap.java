package com.objectpool.pattern.pojo;

import java.awt.geom.Point2D;

public class BitMap implements Image {
	
	
	private Point2D location;
	
	
	private String name;
	
	

	public BitMap(String name) {
		super();
		this.name = name;
	}

	@Override
	public void draw() {

		System.out.println("Drawing "+name+"   @  location "+location);

	}

	@Override
	public Point2D getLocation() {
		// TODO Auto-generated method stub
		return location;
	}

	@Override
	public void setLocation(Point2D location) {
		this.location=location;

	}

	@Override
	public void reset() {
		location=null;
		
		System.out.println("Bit Map is reset");
		
	}

}
