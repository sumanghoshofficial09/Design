package com.strategydesignpattern.context;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

import javax.swing.plaf.synth.SynthTreeUI;

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
	
	public PrintService()
	{
		printer =new DefaultPrintingStrategy();
	}
	
	
	public PrintService(OrderPrinter printer)
	{
		this.printer=printer;
	}
	
	public void printOrders(LinkedList<Order> orders)
	{
		printer.print(orders);
	}
	
	
	public class DefaultPrintingStrategy implements OrderPrinter
	{

		@Override
		public void print(Collection<Order> orders) {
			System.out.println("Printing report with Default Startegy");
			
			Iterator<Order> orderit = orders.iterator();
			
			StringBuffer buff = new StringBuffer();
			double totalcost=0;
			while(orderit.hasNext())
			{
				Order order = orderit.next();
				Map<String,Double> ordermap = order.getItems();
				buff.append(ordermap.keySet().stream().reduce("", (str1,str2)-> str1+"---"+str2));
				buff.append("\n----------------------------");
				
				totalcost=+order.getTotal();
			}
			
			buff.append("\n ---------------------------");
			
			buff.append("Total cost  of all orders \t \t "+totalcost);
			
			
			System.out.println("\t "+buff.toString());
			
		}
		
		
		
	}

}
