package com.observerdesignpatgtern.observer;

import com.observerdesignpatgtern.pojo.Order;

public class QuantityObserver implements OrderObserver {

	@Override
	public void updated(Order order) {
		int count = order.getCount();
		
		if(count>=10)
		{
			order.setShippingCost(50);
		}
		
		if(count>=20)
		{
			order.setShippingCost(0);
		}
		
	}

}
