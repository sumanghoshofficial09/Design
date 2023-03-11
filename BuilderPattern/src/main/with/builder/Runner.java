package main.with.builder;

import style.builder.Text;
import style.builder.TextBuilder;
import style.nobuilder.colour.RedColourStyle;
import style.nobuilder.font.ArialStyle;
import style.nobuilder.width.DefaultStyle;

public class Runner {
	
	
	public static void main(String args[])
	{
		
		Text text = new TextBuilder().buildColour(new RedColourStyle()).buildFont(new ArialStyle()).buildWidth(new DefaultStyle()).build();
		
		text.doText();
	
	}

}
