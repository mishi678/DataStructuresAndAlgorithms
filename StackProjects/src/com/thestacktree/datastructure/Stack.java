package com.thestacktree.datastructure;

public class Stack {
	private int stackSize =3;
	Object[] stackArray = new Object[stackSize];
	int topIndex = 0;
	
	public void push(Object item){
		if(topIndex == stackSize)
			reSizeStackArray();
		
		stackArray[topIndex++] = item;
	}
	public Object pop(){
		topIndex--;
		return stackArray[topIndex];
	}
	public Object peek(){
		return stackArray[topIndex];
	}
	public boolean isEmpty(){
		
		return topIndex == 0;
	}
	
	private void reSizeStackArray(){
		
		stackSize = stackSize * 2;
		Object[] newStackArray = new Object[stackSize];
		int itemCount = 0;
		for(Object item: stackArray){
			newStackArray[itemCount++] = item;
		}
		System.out.println("Stack Capacity Re sized to "+stackSize);
		stackArray = newStackArray;
	}

}
