package com.templatedesignpattern.orderclient;

import java.io.IOException;

import com.templatedesignpattern.pojo.Order;
import com.templatedesignpattern.template.HtmlPrinter;
import com.templatedesignpattern.template.OrderPrinter;
import com.templatedesignpattern.template.TextPrinter;

public class OrderMainClient {
	
	public static void main(String args[])
	{
		Order order = new Order("1034");
		
		order.addItem("Soda", 10);
		order.addItem("Coke", 20);
		order.addItem("Fanta", 30);
		//OrderPrinter  op = new TextPrinter();
		OrderPrinter  op = new HtmlPrinter();
		
		try {
			op.PrintOrder(order, "myorder.html");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
