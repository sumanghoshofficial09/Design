package com.observerdesignpatgtern.observer;

import com.observerdesignpatgtern.pojo.Order;

public interface OrderObserver {
	
	void updated(Order order);
	

}
