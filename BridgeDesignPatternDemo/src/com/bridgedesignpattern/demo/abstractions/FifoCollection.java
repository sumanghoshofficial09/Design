package com.bridgedesignpattern.demo.abstractions;

public interface FifoCollection<T> {
	
	void offer(T element);
	
	T poll();

}
