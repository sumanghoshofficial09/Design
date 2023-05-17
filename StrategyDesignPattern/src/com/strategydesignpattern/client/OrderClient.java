package com.strategydesignpattern.client;

import java.util.LinkedList;

import com.strategydesignpattern.context.PrintService;
import com.strategydesignpattern.pojos.Order;
import com.strategydesignpattern.strategy.DetailedPrinterStrategy;
import com.strategydesignpattern.strategy.SummaryPrinterStrategy;

public class OrderClient {
	
	private static LinkedList<Order> orders = new LinkedList<>();
	
	public static void main(String args[])
	{
		createOrders();
		
		PrintService service = new PrintService(new DetailedPrinterStrategy());
		
		service.printOrders(orders);
	}
	
	
	

	
	private static void createOrders()
	{
		Order o = new Order("100");
		
		o.addItem("Soda",2.0);
		o.addItem("Chips",10);
		orders.add(o);
		
		o = new Order("200");
		
		o.addItem("Cake",20);
		o.addItem("cookies",5);
		orders.add(o);
		
		
		o = new Order("300");
		
		o.addItem("Burger",8);
		o.addItem("Fries",5);
		orders.add(o);
	}
}
