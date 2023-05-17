package com.statedesignpatternd.pojo;

import com.statedesignpatternd.state.Cancelled;
import com.statedesignpatternd.state.Delivered;
import com.statedesignpatternd.state.Intransit;
import com.statedesignpatternd.state.New;
import com.statedesignpatternd.state.OrderState;
import com.statedesignpatternd.state.Paid;

public class Order {
	
	private OrderState currentState;
	
	public Order()
	{
		currentState = new New();
	}
	
	public double cancel()
	{
		double charges=currentState.handleCancellation();
		currentState= new Cancelled();
		return charges;
	}
	
	public void paymentSuccessful()
	{
		if(!this.currentState.getClass().getName().equals("com.statedesignpatternd.state.Cancelled"))
		currentState = new Paid();
		else
			throw new IllegalStateException("Order already cancelled");
			
		
	}
	
	public void dispatched()
	{
		if(!this.currentState.getClass().getName().equals("com.statedesignpatternd.state.Cancelled"))
		currentState= new Intransit();
		else
			throw new IllegalStateException("Order already cancelled");
	}
	
	public void delivered()
	{
		if(!this.currentState.getClass().getName().equals("com.statedesignpatternd.state.Cancelled"))
		currentState  = new Delivered();
		else
			throw new IllegalStateException("Order already cancelled");
	}

}
