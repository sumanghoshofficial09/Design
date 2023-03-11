package style.builder;

import style.nobuilder.colour.ColourStyle;
import style.nobuilder.font.FontStyle;
import style.nobuilder.width.WidthStyle;

public interface Builder {
	
	

	TextBuilder buildFont(FontStyle fontStyle);

	TextBuilder buildWidth(WidthStyle widthStyle);

	TextBuilder buildColour(ColourStyle colourStyle);
	
	Text build();
	

}
