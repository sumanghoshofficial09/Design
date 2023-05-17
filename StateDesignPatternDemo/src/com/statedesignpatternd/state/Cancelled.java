package com.statedesignpatternd.state;

import java.nio.channels.IllegalSelectorException;

public class Cancelled implements OrderState{

	@Override
	public double handleCancellation() {
		throw new IllegalStateException("Already cancelled");
	}

}
