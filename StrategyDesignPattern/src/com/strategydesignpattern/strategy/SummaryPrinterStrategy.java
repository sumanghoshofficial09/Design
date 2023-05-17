package com.strategydesignpattern.strategy;

import java.util.Collection;
import java.util.Iterator;

import com.strategydesignpattern.pojos.Order;

/*
 * Strategy 1
 */
public class SummaryPrinterStrategy implements OrderPrinter {

	@Override
	public void print(Collection<Order> orders) {
	System.out.println("************ Printing summmary report *********** ");
	
	Iterator<Order> orderIterator = orders.iterator();
	double total=0;
	for(int i=1; orderIterator.hasNext();i++)
	{
		
		Order order = orderIterator.next();
		System.out.println(i+""+order.getId()+"\t"+order.getItems()+" \t"+ order.getTotal());
		
		total+=order.getTotal();
		
		System.out.println("*******************************************************************");
		
		System.out.println("\t \t \t TOTAL "+total);
	}
		
	}

}
