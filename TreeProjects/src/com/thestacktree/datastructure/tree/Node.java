package com.thestacktree.datastructure.tree;

public class Node {
	public Object data;
	public Node leftNode;
	public Node rightNode;
	
	public Node(Object data) {
		this.data =data;
		
	}
	
	@Override
	public String toString() {
		
		return ""+ leftNode +"<-"+ data.toString()+"->"+rightNode+"";
	}
}
