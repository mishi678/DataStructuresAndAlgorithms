package com.thestacktree.datastructure.tree.node;

public class Node {
	public Node(Node left,Object data, Node right) {
		this.left =  left;
		this.data =  data;
		this.right = right;
	}
	public Object data;
	public Node left;
	public Node right;
	
	@Override
	public int hashCode() {
		
		return data.hashCode();
	}
}
