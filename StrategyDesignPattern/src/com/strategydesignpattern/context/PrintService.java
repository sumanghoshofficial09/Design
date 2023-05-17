package com.strategydesignpattern.context;

import java.util.LinkedList;

import com.strategydesignpattern.pojos.Order;
import com.strategydesignpattern.strategy.OrderPrinter;

/**
 * 
 * 
 * @author ciphe
 * 
 * Context class of strategy design pattern 
 *
 */
public class PrintService {
	
	private OrderPrinter printer;
	
	public PrintService(OrderPrinter printer)
	{
		this.printer=printer;
	}
	
	public void printOrders(LinkedList<Order> orders)
	{
		printer.print(orders);
	}

}
