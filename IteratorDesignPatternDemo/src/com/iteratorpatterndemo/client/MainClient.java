package com.iteratorpatterndemo.client;

import com.iteratorpatterndemo.collection.ThemeColor;
import com.iteratorpatterndemo.iterator.Iterator;

public class MainClient {
	
	public static void main(String args[])
	{
		Iterator<ThemeColor> iterator  = ThemeColor.getIterator();
		
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}

}
