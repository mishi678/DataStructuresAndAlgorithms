package com.thestacktree.datastructure;

import java.util.Arrays;

public class PriorityQueue {
	Object[] queue ;
	int queueTail = 0;
	int insertPosition = 0;
	public PriorityQueue(int size) {
		 queue = new Object[size];
	}
	public void enqueue(Object item){
		
		while(queueTail > 0 && hasLessPrority(item)){
			moveItemsToRight();
		}
		queue[insertPosition] = item;
		queueTail++;
		insertPosition = queueTail;
	}
	
	private void moveItemsToRight() {
		if(insertPosition>0)
		queue[insertPosition] = queue[--insertPosition];
	}
	private boolean hasLessPrority(Object item) {
		try{
			return insertPosition>0 && Integer.valueOf(queue[insertPosition-1].toString()).intValue() > Integer.valueOf(item.toString()).intValue() ;
		}catch(NumberFormatException e){
			return false;
		}
	}
	public Object dequeue(){
		return queue[--queueTail];
	}

	public Object peek(){
		if(queueTail== 0) return null;
		return queue[queueTail-1];
	}
	
	public boolean isEmpty(){
		return queueTail == 0;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return Arrays.toString(queue);
	}
	
}
