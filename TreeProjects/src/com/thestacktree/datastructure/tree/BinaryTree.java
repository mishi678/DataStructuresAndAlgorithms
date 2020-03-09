package com.thestacktree.datastructure.tree;

import com.thestacktree.datastructure.tree.node.Node;

public class BinaryTree {
	Node rootNode ;
	public void insert(Object item ){
		if(rootNode == null){
			rootNode = new Node(null, item, null);
		}else {
			
			if(item.hashCode() > rootNode.data.hashCode() ){
				insertRight(rootNode,item);
			}else{
				insertLeft(rootNode,item);
			}
			
		}
	}
	private void insertLeft(Node currentNode, Object newItem) {
		
		 if(newItem.hashCode() > currentNode.data.hashCode())
			if(currentNode.right== null )
				currentNode.right = new Node(null, newItem, null);
			else
				insertRight(currentNode.right, newItem);
		else if(newItem.hashCode() < currentNode.data.hashCode()){
			if(currentNode.left == null )
				currentNode.left = new Node(null, newItem, null);
			else
				insertLeft(currentNode.left, newItem);
		}
		
	}
	private void insertRight(Node currentNode ,Object newItem) {
		 if(newItem.hashCode() > currentNode.data.hashCode())
			if(currentNode.right== null )
				currentNode.right = new Node(null, newItem, null);
			else
				insertRight(currentNode.right, newItem);
		else if(newItem.hashCode() < currentNode.data.hashCode()){
			if(currentNode.left== null )
				currentNode.left = new Node(null, newItem, null);
			else
				insertLeft(currentNode.left, newItem);
		}
			
	}
//	private boolean findLeft(Node currentNode, Object searchItem) {
//		if(currentNode.left == null )
//			return false;
//		else if(searchItem.hashCode() > currentNode.left.data.hashCode())
//			return findRight(currentNode, searchItem);
//		else if (searchItem.hashCode() < currentNode.left.data.hashCode())
//			return findLeft(currentNode.left, searchItem);
//		else
//			return true;
//		
//	}
//	private boolean findRight(Node currentNode ,Object searchitem) {
//		if(currentNode.right == null )
//			return false;
//		else if(searchitem.hashCode() > currentNode.right.data.hashCode())
//			return findRight(currentNode, searchitem);
//		else if(searchitem.hashCode() < currentNode.right.data.hashCode())
//			return findLeft(currentNode, searchitem);
//		else
//			return true;
//		
//	}
	public boolean find(Node node ,Object value) {
		return false;
	}
}
