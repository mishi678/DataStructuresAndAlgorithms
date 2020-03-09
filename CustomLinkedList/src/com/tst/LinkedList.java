package com.tst;

public class LinkedList {
	
	private Node first;
	private Node last;
	private int count = 0;
		
	public void addFirst(Object item) {
		if(first !=null) {
			first = new Node(item, first);
		}else {
			first = new Node(item,null);
			last = first;
		}
		count++;
	}
	
	public void addAt(Object item,int insertIndex)throws IndexOutOfBoundsException {
		if(insertIndex > count || insertIndex< 0) {
			throw new IndexOutOfBoundsException("insert position is outside list count .  The index value should be between 0 and "+count+"");
		}
		int nextNodeIndex = 0;
		Node nextNode = first;
		if(nextNode != null) {
			
			while(nextNodeIndex <insertIndex && nextNode.nextNode != null) {
				nextNode = nextNode.nextNode;
				nextNodeIndex++;
			}
			
			nextNode.nextNode = new Node(item,nextNode.nextNode);
			count++;
		}else {
			addFirst(item);
		}
		
	}
	
	public void deleteFirst() {
		if(!isEmpty()) {
			Node nextNode = first.nextNode;
			first.nextNode = null;
			first = nextNode;
		}
	}
	boolean isEmpty(){
		if(first ==  null)
			return true;
		else 
			return false;
	}
	
	public void reverse() {
		if(!isEmpty()) {
			Node curreNode = last;
			Node[] nodeArray = toArray();
			Node current = last;
			first = last ;
			for(int x = count-1 ;x >0 ;x--) {
				current.nextNode = nodeArray[x - 1];
				current = current.nextNode; 
			}
			current.nextNode = null;
			last = current;
		}
	}
	
	public Node[] toArray() {
		Node[] nodeArray = new Node[count];
		if(!isEmpty()) {
			Node current = first;
			int currentIndex =0;
			while(current.nextNode!=null) {
				nodeArray[currentIndex++] = current;
				current = current.nextNode;
			}
			nodeArray[currentIndex] = current;
		}
		
		return nodeArray;
	}
	public boolean contains() {
		return false;
	}
	
	public int indexOf(Object data) {
		int nodeIndex = -1;
		return nodeIndex;
	}
	
	public Node findNodeFromEnf(int nodePositionFromLast) {
		Node nodeAtPostion= null;
		if(!isEmpty() && nodePositionFromLast >-1) {
			Node firstNode = first;
			Node endNode = firstNode;
			int posCount = 0;
			while(endNode != null ) {
				
				if(posCount++ >= nodePositionFromLast) {
					nodeAtPostion =firstNode;
					firstNode = firstNode.nextNode;
					
				}
				endNode = endNode.nextNode;
				
			}
			System.out.println("");
		}
		return nodeAtPostion;
	}
	@Override
	public String toString() {
		String listvalue="";
		Node nextNode = first;
		if(first != null) {
			
			while(nextNode != null) {
				listvalue = listvalue +" , "+ nextNode.toString();
				
				nextNode = nextNode.nextNode;
			}
			
		}else {
			listvalue = "List is empty";
		}
		return listvalue;
	}
	

}
