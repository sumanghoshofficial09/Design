package com.statedesignpatternd.state;

public class New implements OrderState{

	@Override
	public double handleCancellation() {
		System.out.println("Its a New Order.No processing done");
		return 0;
	}

}
