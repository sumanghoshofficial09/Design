package com.statedesignpatternd.state;

public class Delivered implements OrderState{

	@Override
	public double handleCancellation() {
		System.out.println("Contacting Coureier service  for return or pickup of the item");
		System.out.println("Contacting payment gateway to roll back transaction");
		
		return 30;
	}

}
