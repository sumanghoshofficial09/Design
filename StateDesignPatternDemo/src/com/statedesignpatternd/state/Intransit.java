package com.statedesignpatternd.state;

public class Intransit implements OrderState{

	@Override
	public double handleCancellation() {
		System.out.println("Contacting Coureier service  for cancellation");
		System.out.println("Contacting payment gateway to roll back transaction");
		
		return 20;
	}

}
