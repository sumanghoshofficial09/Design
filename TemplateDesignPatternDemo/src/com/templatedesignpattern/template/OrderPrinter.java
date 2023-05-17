package com.templatedesignpattern.template;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

import com.templatedesignpattern.pojo.Order;

public abstract class OrderPrinter {
	
	public final void PrintOrder(Order order,String fileName) throws IOException
	{
		try(PrintWriter writer =new PrintWriter(fileName))
		{
			writer.println(start());
			
			writer.println(formatOrderNumber(order));
			
			writer.println(formatItems(order));
			
			writer.println(end());
			
		}
	}
	


	protected abstract String start();
	protected abstract String formatOrderNumber(Order order);
	
	protected abstract String formatItems(Order order);
	
	protected abstract String end();



	protected abstract String formatTotal(Order order);
	
	

}
