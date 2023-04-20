package com.solid.liskov.pojo;

public class Rectangle {
	
	private int width;
	private int heigth;
	
	
	
	
	
	public Rectangle(int width, int heigth) {
		super();
		this.width = width;
		this.heigth = heigth;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeigth() {
		return heigth;
	}
	public void setHeigth(int heigth) {
		this.heigth = heigth;
	}
	
	
	public int computeArea()
	{
		
		return width*heigth;
		
	}
	
	

}
