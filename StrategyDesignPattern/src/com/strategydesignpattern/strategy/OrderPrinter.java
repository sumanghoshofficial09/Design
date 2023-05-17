package com.strategydesignpattern.strategy;

import java.util.Collection;

import com.strategydesignpattern.pojos.Order;

/**
 * 
 * @author ciphe
 * 
 * Strategy 
 *
 */
public interface OrderPrinter {
	
	
	
	void print(Collection<Order> orders);

}
