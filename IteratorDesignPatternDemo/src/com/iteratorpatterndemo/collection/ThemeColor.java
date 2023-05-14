package com.iteratorpatterndemo.collection;

import com.iteratorpatterndemo.iterator.Iterator;

public enum ThemeColor {
	
	RED,
	ORANGE,
	BLACK,
	WHITE;
	
	
	public static Iterator<ThemeColor> getIterator()
	{
		return new ThemeColorIterator();
	}
	
	private static class ThemeColorIterator implements  Iterator<ThemeColor>
	{
		/**
		 * state to hold the position  
		 */
		private int position;

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return position<ThemeColor.values().length;
		}

		@Override
		public ThemeColor next() {
			// TODO Auto-generated method stub
			return ThemeColor.values()[position++];
		}
		
	}

}
