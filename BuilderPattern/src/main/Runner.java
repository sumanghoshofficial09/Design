package main;

import style.nobuilder.Text;
import style.nobuilder.colour.RedColourStyle;
import style.nobuilder.font.ArialStyle;
import style.nobuilder.width.DefaultStyle;

public class Runner {
	
	public static void main(String args[])
	{
		
		
		Text text  = new Text(new ArialStyle() , new RedColourStyle(), new DefaultStyle());
		
		text.doText();
	}

}
