package com.designpatternpart2.caretaker;

import java.util.Stack;

import com.designpatternpart2.memento.TextMemento;
import com.designpatternpart2.originator.TextEditor;

public class TextEditHistory {
	
	private Stack<TextMemento> history = new Stack();
	
	public void saveState(TextEditor editor)
	{
		history.push(editor.save());
	}
	
	public void undo(TextEditor editor)
	{
		if(!history.isEmpty())
		{
			
			TextMemento memento = history.pop();
			
			editor.restore(memento);
		}
	}

}
