package com.tst;

public class Node {
	public Node(Object item,Node nextNode) {
		this.item = item;
		this.nextNode = nextNode;
	}
	public Object item;
	public Node nextNode;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return item.toString();
	}
}
