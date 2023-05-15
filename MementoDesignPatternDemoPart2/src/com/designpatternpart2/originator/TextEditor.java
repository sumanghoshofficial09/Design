package com.designpatternpart2.originator;

import com.designpatternpart2.memento.TextMemento;

/**
 * 
 * @author ciphe
 *  originator class that creates and restores Memento
 */
public class TextEditor {
	
	private String text="";
	
	public void enterText(String newText)
	{
		text+=newText;
	}
	
	public String getText()
	{
		return text;
	}
	
	public TextMemento save()
	{
		return new TextMemento(text);
	}
	
	
	public void restore(TextMemento memento)
	{
		text=memento.getText();
	}
	

}
