package com.bridgedesignpattern.demo.abstractions;

import com.bridgedesignpattern.demo.implementor.LinkedList;

public class Queue<T>  implements FifoCollection<T> {
	
	private LinkedList<T>  linkedList;
	
	

	public Queue(LinkedList<T> linkedList) {
		super();
		this.linkedList = linkedList;
	}

	@Override
	public void offer(T element) {
		linkedList.addLast(element);
		
	}

	@Override
	public T poll() {
		// TODO Auto-generated method stub
		return linkedList.removeFirst();
	}

}
