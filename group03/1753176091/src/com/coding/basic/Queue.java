package com.coding.basic;

public class Queue {

	private int size;
	LinkedList elementData = new LinkedList();

	public void enQueue(Object o) {
		elementData.addLast(o);
		size++;
	}

	public Object deQueue() {
		size--;
		return elementData.removeFirst();
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public int size() {
		return size;
	}
}
