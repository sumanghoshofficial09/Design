package com.designpatternpart2.main;

import com.designpatternpart2.caretaker.TextEditHistory;
import com.designpatternpart2.originator.TextEditor;

public class Client {
	public static void main(String args[])
	{
		TextEditor textEditor = new TextEditor();
		
		TextEditHistory textEditHistory = new TextEditHistory();
		
		textEditor.enterText("Hello");
		textEditHistory.saveState(textEditor);
		
		System.out.println(textEditor.getText());
		
		textEditor.enterText("World");
		textEditHistory.saveState(textEditor);
		
		System.out.println(textEditor.getText());
		
		textEditor.enterText("Suman");
		textEditHistory.saveState(textEditor);
		
		System.out.println(textEditor.getText());
		
		textEditHistory.undo(textEditor);
		textEditHistory.undo(textEditor);
		
		
		textEditor.enterText("Puja");
		textEditHistory.saveState(textEditor);
		
		System.out.println(textEditor.getText());
		
		
		
		
		
	}

}
