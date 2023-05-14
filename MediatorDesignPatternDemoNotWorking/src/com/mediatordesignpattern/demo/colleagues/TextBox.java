package com.mediatordesignpattern.demo.colleagues;

import com.mediatordesignpattern.demo.mediator.UIMediator;

import javafx.scene.control.TextField;

public class TextBox extends TextField  implements UIControl{
	
	private UIMediator mediator;
	
	private boolean mediatedChanged;

	public TextBox(UIMediator mediator) {
		this.setText("TextBox");
		this.mediator=mediator;
		
		this.mediator.register(this);
		
		this.textProperty().addListener((observable,oldval,newval) ->{
			if(!mediatedChanged)
			this.mediator.valueChanged(this);
		});
	}

	@Override
	public void controlChanged(UIControl control) {
		this.mediatedChanged=true;
		this.setText(control.getContolValue());
		this.mediatedChanged=false;
		
	}

	@Override
	public String getContolValue() {
		
		return getText();
	}

	@Override
	public String getControlName() {
		// TODO Auto-generated method stub
		return "TextBox";
	}

	
	
	

}
