package com.mediatordesignpattern.demo.colleagues;

public interface UIControl {
	
	void controlChanged(UIControl control);
	
	String getContolValue();
	
	String getControlName();

}
