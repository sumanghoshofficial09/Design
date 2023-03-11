package style.nobuilder;

import style.nobuilder.colour.ColourStyle;
import style.nobuilder.font.FontStyle;
import style.nobuilder.width.WidthStyle;

public class Text implements IText {
	
	private FontStyle fontStyle;
	private ColourStyle  colourStyle;
	private WidthStyle widthStyle;
	
	public Text(FontStyle fontStyle, ColourStyle colourStyle, WidthStyle widthStyle) {
		super();
		this.fontStyle = fontStyle;
		this.colourStyle = colourStyle;
		this.widthStyle = widthStyle;
	}

	@Override
	public void doText() {
		fontStyle.print();
		colourStyle.color();
		widthStyle.textWidth();
		
	}
	
	
	
	
	
	
	
	
	

}
