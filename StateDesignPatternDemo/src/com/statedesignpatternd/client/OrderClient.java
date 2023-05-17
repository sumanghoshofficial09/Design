package com.statedesignpatternd.client;

import com.statedesignpatternd.pojo.Order;

public class OrderClient {
	
	public static void main(String args[])
	{
		Order order = new Order();
		order.paymentSuccessful();
		
		order.cancel();
		order.delivered();
		
		
	}

}
