package com.thestacktree.datastructure.tree.node;

public class AVLNode {
	public int leftHeight = 0;
	public int rightHeight = 0;
	public AVLNode(AVLNode left,Object data, AVLNode right) {
		this.left =  left;
		this.data =  data;
		this.right = right;
	}
	public Object data;
	public AVLNode left;
	public AVLNode right;
	
	@Override
	public int hashCode() {
		
		return data.hashCode();
	}

	@Override
	public String toString() {
		return ""+data+" lh:"+leftHeight+" rh:"+rightHeight;
	}
}
