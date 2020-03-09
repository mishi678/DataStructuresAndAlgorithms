package com.thestacktree.datastructure.tree;

import com.thestacktree.datastructure.tree.node.AVLNode;

public class AVLTree {
	AVLNode root;
	public void insert(Object data){
		insert(root,data);
	}
	private void insert(AVLNode currentNode, Object data){
		AVLNode newNode = new AVLNode(null, data, null);
		if(root ==  null)
			root = newNode;
		
		if(currentNode == null)
			return;
		
		
		
		if(currentNode.data.hashCode() < data.hashCode()){
			if(currentNode.right == null)
				currentNode.right = newNode;
			else
				insert(currentNode.right,data);
		}else if(currentNode.data.hashCode() > data.hashCode()){
			if(currentNode.left == null)
				currentNode.left = newNode;
			else
				insert(currentNode.left,data);
		}
		
		if(currentNode.left != null)
			currentNode.leftHeight = currentNode.left.leftHeight + 1;
		if(currentNode.right != null)
			currentNode.rightHeight = currentNode.right.rightHeight + 1;
		
		if(isLeftWeighted(currentNode))
			rotateRight(currentNode);
		else if(isRightWeighted(currentNode))
			rotateLeft(currentNode); 
		System.out.println(""+currentNode);
		 
	}
	private void rotateLeft(AVLNode currentNode) {
		AVLNode tmp = currentNode;
		
		root  = currentNode.right ;
		if(root.left == null)
			root.left = tmp;
		else{
			insert(tmp);
		}
		tmp.right =null;	
		
	}
	private void rotateRight(AVLNode currentNode) {
		AVLNode tmp = currentNode;
		
		root  = currentNode.left ;
		if(root.right == null)
			root.right = tmp;
		else{
			insert(tmp);
		}
		tmp.left = null;
			
	}
	private boolean isLeftWeighted(AVLNode currentNode){
		return (currentNode.leftHeight - currentNode.rightHeight) >1;
	}
	private boolean isRightWeighted(AVLNode currentNode){ 
		
		return (currentNode.rightHeight - currentNode.leftHeight) >1;
	}
	
	
}
