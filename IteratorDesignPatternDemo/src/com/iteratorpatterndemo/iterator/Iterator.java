package com.iteratorpatterndemo.iterator;


/**
 * 
 * @author ciphe
 *
 * @param <T>
 * 
 * Iterator generic Interface 
 */
public interface Iterator<T> {
	boolean hasNext();
	T next();

}
