package com.thestacktree.datastructure;

import java.util.Arrays;

public class ArrayQueue {
	
	
	int queueSize = 5;
	
	int back = 0;
	int front = 0;
	Object[] queueArray = new Object[queueSize];
	
	public void enqueue(Object item) throws Exception{
		if(back>=queueSize ){
			if(front > 0 && front-back !=1){ //TODO Can improve this by use of % operator 
				
				back = 0;
				queueArray[back] = item;
			}else{
				throw new Exception("Queue Full");
			}
		}else{
			queueArray[back++] = item;
		}
		
		
	}
	
	public Object dequeue(){
		if(front>=queueSize ){
			if(back > 0 && back-front !=1){ //TODO Can improve this by use of % operator 
				front = 0;
			}
		}
		return queueArray[front++];
	}
	
	public Object peek(){
		return queueArray[front];
	}
	
	public boolean isEmpty(){
		return front - back == 0;
	}
	public boolean isFull(){
		return front - back == queueSize  || back - front == queueSize;
	}
	
	
	@Override
	public String toString() {
		
		return Arrays.toString(queueArray);
	}
	
}
