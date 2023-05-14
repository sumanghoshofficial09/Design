package com.mediatordesignpattern.demo.mediator;

import java.util.ArrayList;
import java.util.List;

import com.mediatordesignpattern.demo.colleagues.UIControl;

public class UIMediator {
	
	List<UIControl> colleagues = new ArrayList<>();
	
	public void register(UIControl control)
	{
		colleagues.add(control);
	}
	
	
	public void valueChanged(UIControl control)
	{
		
		colleagues.stream().filter(c -> c!=control).forEach(c -> c.controlChanged(control));
		
	}

}
