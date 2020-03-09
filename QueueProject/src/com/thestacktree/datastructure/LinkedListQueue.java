package com.thestacktree.datastructure;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListQueue {
	int queueLenght = 0;
	LinkedList<Object> itemList = new LinkedList<Object>();
	
	public void enqueue(Object item){
		itemList.add(item);
	}
	
	public Object dequeue(){
		return itemList.poll();
		
	}
	public Object peek(){
		return itemList.peek();
		
	}
	public int size(){
		return itemList.size();
		
	}
	public boolean isEmpty(){
		return itemList.isEmpty();
		
	}
	
	@Override
	public String toString() {
		return Arrays.toString(itemList.toArray());
	}
}
