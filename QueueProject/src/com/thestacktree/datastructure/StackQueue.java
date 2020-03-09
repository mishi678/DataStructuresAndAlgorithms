package com.thestacktree.datastructure;

import java.util.Stack;

public class StackQueue {

	Stack<Object> insertStack = new Stack<Object>();
	Stack<Object> queueStack = new Stack<Object>();
	
	public void enqueue(Object item) throws Exception{
		insertStack.push(item);
	}
	
	public Object dequeue(){
		refillQueue();
		return queueStack.pop();
	}
	
	public Object peek(){
		refillQueue();
		return queueStack.peek();
	}
	
	private void refillQueue(){
		if(queueStack.isEmpty()){
			
			while(!insertStack.isEmpty()){
				queueStack.push(insertStack.pop());
			}
			
		}
	}
	public boolean isEmpty(){
		return queueStack.isEmpty() && insertStack.isEmpty();
	}
	
	
	@Override
	public String toString() {
		refillQueue();
		return queueStack.toString();
	}

}
