package com.observerdesignpatgtern.observer;

import com.observerdesignpatgtern.pojo.Order;

public class PriceObserver implements OrderObserver{

	@Override
	public void updated(Order order) {
		double itemCost = order.getTotal();
		
		if(itemCost>=500)
		{
			order.setDiscount(20);
		}
		else
		{
		if(itemCost>=200)
		{
			order.setDiscount(10);
		}
		}
		
	}

}
