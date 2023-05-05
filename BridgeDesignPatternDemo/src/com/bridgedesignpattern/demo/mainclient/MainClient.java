package com.bridgedesignpattern.demo.mainclient;

import com.bridgedesignpattern.demo.abstractions.FifoCollection;
import com.bridgedesignpattern.demo.abstractions.Queue;
import com.bridgedesignpattern.demo.implementor.SinglyLinkedList;

public class MainClient {
	
	public static void main(String args[])
	{
		
		FifoCollection<Integer> collection  = new Queue<>(new SinglyLinkedList<>());
		
		collection.offer(12);
		
		collection.offer(156);
		collection.offer(132);
		collection.offer(122);
		
		
		System.out.println(collection.poll());
		
	}

}
