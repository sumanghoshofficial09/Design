package com.bridgedesignpattern.demo.implementor;

public class SinglyLinkedList<T> implements LinkedList<T> {
	
	private class Node {
		private T data;
		private Node next;
		
		public Node(T data, Node next) {
			this.data = data;
			this.next = next;
		}
	}
	
	private int size;
	private Node top;
	private Node last;
	
	@Override
	public void addFirst(T element) {
		Node newNode = new Node(element, top);
		if (size == 0) {
			last = newNode;
		}
		top = newNode;
		size++;
	}

	@Override
	public T removeFirst() {
		if (size == 0) {
			throw new IllegalStateException("Cannot remove from an empty list.");
		}
		T data = top.data;
		top = top.next;
		size--;
		if (size == 0) {
			last = null;
		}
		return data;
	}

	@Override
	public void addLast(T element) {
		Node newNode = new Node(element, null);
		if (size == 0) {
			top = newNode;
		} else {
			last.next = newNode;
		}
		last = newNode;
		size++;
	}

	@Override
	public T removeLast() {
		if (size == 0) {
			throw new IllegalStateException("Cannot remove from an empty list.");
		}
		T data = last.data;
		if (size == 1) {
			top = null;
			last = null;
		} else {
			Node curr = top;
			while (curr.next != last) {
				curr = curr.next;
			}
			curr.next = null;
			last = curr;
		}
		size--;
		return data;
	}

	@Override
	public int getSize() {
		return size;
	}

}
