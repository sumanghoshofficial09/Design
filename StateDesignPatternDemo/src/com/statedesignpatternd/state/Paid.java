package com.statedesignpatternd.state;

public class Paid implements OrderState{

	@Override
	public double handleCancellation() {
		System.out.println("Contacting payment gateway to roll back transaction");
		
		return 10;
	}

}
