package style.builder;

import style.nobuilder.colour.ColourStyle;
import style.nobuilder.font.FontStyle;
import style.nobuilder.width.WidthStyle;

public class TextBuilder implements Builder
{
	private FontStyle fontStyle;
	private ColourStyle  colourStyle;
	private WidthStyle widthStyle;
	
	@Override
	public TextBuilder buildFont(FontStyle fontStyle) {
		this.fontStyle=fontStyle;
		return this;
		
	}
	@Override
	public TextBuilder buildWidth(WidthStyle widthStyle) {
		// TODO Auto-generated method stub
		this.widthStyle=widthStyle;
		
		return this;
		
		
	}
	@Override
	public TextBuilder buildColour(ColourStyle colourStyle) {
		// TODO Auto-generated method stub
		
		this.colourStyle=colourStyle;
		
		return this;
		
	}
	@Override
	public Text build() {
		
		Text  text = new Text(fontStyle, colourStyle, widthStyle);
		
		return text;
		
		
	}
	
	
	
	
	
}