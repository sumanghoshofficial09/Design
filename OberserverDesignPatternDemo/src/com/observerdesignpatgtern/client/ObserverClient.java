package com.observerdesignpatgtern.client;

import com.observerdesignpatgtern.observer.PriceObserver;
import com.observerdesignpatgtern.pojo.Order;

public class ObserverClient {
	
	public static void main(String args[])
	{
		Order order1  = new Order("Order1");
		
		PriceObserver priceObserver  = new PriceObserver();
		
		
		order1.attach(priceObserver);
		
		order1.addItem(100);
		order1.addItem(200);
		order1.addItem(400);
		
		System.out.println(order1);
	}

}
