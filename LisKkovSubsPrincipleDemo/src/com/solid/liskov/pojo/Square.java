package com.solid.liskov.pojo;

public class Square extends Rectangle {

	public Square(int side) {
		super(side,side);
		
	}
	
	
	@Override
	public void setWidth(int width) {
		setSide(width);
	}
	
	
	private void setSide(int side) {
		super.setHeigth(side);
		super.setWidth(side);
		
	}


	@Override
	public void setHeigth(int heigth) {
		setSide(heigth);
	}

}
