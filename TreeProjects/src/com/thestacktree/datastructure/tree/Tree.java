package com.thestacktree.datastructure.tree;

import java.util.Stack;

public class Tree {

	public Node root ;

	public void insert(Object data){
		Node newNode = new Node(data);
		if(root == null) {
			root = newNode;
		}
		Node currentNode = root;
		
		 while(true) {
		
			 if(currentNode.data.hashCode()> data.hashCode()) {
				 if(currentNode.leftNode == null) {
					 currentNode.leftNode = newNode;
					 break;
				 }
				 currentNode = currentNode.leftNode;
			 }
			 else if(currentNode.data.hashCode()< data.hashCode()) {
				 if(currentNode.rightNode == null) {
					 currentNode.rightNode = newNode;
					 break;
				 }
				 currentNode = currentNode.rightNode;
			 }else
				 break;
		 }
		
	}
	
	public boolean find(Object tree) {
		return false;
	}
	
	public void  preOrderSearch() {
		preOrderSearch(root);
	}
	public void  inOrderSearch() {
		inOrderSearch(root);
	}
	private void  preOrderSearch(Node currentroot) {
		if(currentroot == null)
			return;
		System.out.println(currentroot.data);
		preOrderSearch(currentroot.leftNode);
		preOrderSearch(currentroot.rightNode);
	}
	private void  inOrderSearch(Node currentroot) {
		if(currentroot == null)
			return;
		inOrderSearch(currentroot.leftNode);
		System.out.println(currentroot.data);
		inOrderSearch(currentroot.rightNode);
	}
	
	
	
	@Override
	public String toString() {
		
		return root.toString();
	}
	
	public boolean isBinaryTree() {
		return isBinaryTree(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
	}
	private boolean isBinaryTree(Node currentNode ,int min,int max) {
		boolean isInrange=true;
		if(currentNode != null) {
			 isInrange= currentNode.data.hashCode() > min && 
					currentNode.data.hashCode() <max && 
					isBinaryTree(currentNode.leftNode , min,currentNode.data.hashCode()) &&
					isBinaryTree(currentNode.rightNode , currentNode.data.hashCode(),max); 
		}
		else {
			isInrange =  true;
		}
		System.out.println(currentNode +" min:"+min+" max:"+max +" isInRange:"+isInrange);
		return isInrange;
	}
	
	public void printKthNodes(int k) {
		printKthNodes(root,0,k);
	}
	private void printKthNodes(Node currentNode ,int distanceToRoot ,int k) {
		if(currentNode == null )
			return;
		if(distanceToRoot == k) {
			System.out.println(currentNode);
			return;
		}
		printKthNodes(currentNode.leftNode , distanceToRoot +1 ,k);
		printKthNodes(currentNode.rightNode , distanceToRoot +1 ,k);
		
	}
	
	
}
