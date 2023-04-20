package com.solid.liskov;

import com.solid.liskov.pojo.Rectangle;
import com.solid.liskov.pojo.Square;

public class Main {
	
	public static void main(String args[])
	{
		Rectangle rectangle = new Rectangle(10,20);
		
		System.out.println(rectangle.computeArea());
		
		Square square = new Square(10);
		
		System.out.println(square.computeArea());
		
		useRectangle(rectangle);
		useRectangle(square);
	}
	
	private static void useRectangle(Rectangle rectangle)
	{
		rectangle.setHeigth(20);
		rectangle.setWidth(30);
		
		assert rectangle.getHeigth()== 20 : "Height is not equal to 20";
		
		assert rectangle.getWidth( )== 30 : "Width is not equal to 30";
		
	}

}
