package com.mediatordesignpattern.demo.colleagues;

import com.mediatordesignpattern.demo.mediator.UIMediator;

public class Slider  extends  javafx.scene.control.Slider implements UIControl {

	private UIMediator mediator;
	private boolean mediatedupdate;
	
	
	public Slider(UIMediator mediator) {
		this.mediator=mediator;
		this.setMin(0);
		this.setMax(50);
		this.setBlockIncrement(5);
		mediator.register(this);
		
		this.valueProperty().addListener((observable,oldvalue,newvalue) -> {
			
			if(!mediatedupdate)
			{
				this.mediator.valueChanged(this);
			}
			
		});
	}

	

	@Override
	public void controlChanged(UIControl control) {
		this.mediatedupdate=true;
		this.setValue(Double.valueOf(control.getContolValue()));
		this.mediatedupdate=false;
		
	}

	@Override
	public String getContolValue() {
		// TODO Auto-generated method stub
		return this.getContolValue();
	}

	@Override
	public String getControlName() {
		// TODO Auto-generated method stub
		return "Slider";
	}

}
