package com.thestacktree.hashtree;

import java.util.Iterator;
import java.util.LinkedList;

public class HashTable<String,E> {

	int bucketSize = 10;
	private LinkedList[] hashBucket = new LinkedList[bucketSize];
	

	public void put (String key , E value){
		LinkedList<Node> chain = new LinkedList<Node>();
		boolean isNewItem = true;
		if(hashBucket[getHashCode(key)]!=null){
			chain = hashBucket[getHashCode(key)];
			
			for (Object node: chain.toArray()){
				Node item = (Node) node;
				if(item.key == key){
					item.value =value;
					isNewItem = false;
					break;
				}
			}
		}
		if(isNewItem){
			chain.add(new Node((java.lang.String) key,value));
		}
		hashBucket[getHashCode(key)]= chain ;
	}
	
	public E get(String key){
		E hashtreeItem = null;
		LinkedList<Node> chain = new LinkedList<Node>();
		if(hashBucket[getHashCode(key)]!=null){
			chain = hashBucket[getHashCode(key)];
			
			for (Object node: chain.toArray()){
				Node item = (Node) node;
				if(item.key == key){
					hashtreeItem = (E) item.value;
					break;
				}
			}
		}
		return hashtreeItem;
	}
	
	private int getHashCode(String key){
		
		int hashCode = 0;
		if(key!=null)
			for(Character ch : key.toString().toCharArray()){
				hashCode +=  ch;
			}
		if(hashCode > bucketSize){
			return hashCode%bucketSize ;
		}else{
			return hashCode ;
		}
		
	}
}

class Node<E>{
	public Node(String key, E value) {
		this.key = key;
		this.value = value;
	}
	public String key;
	public E value;
	 @Override
	public java.lang.String toString() {
		
		return "{"+key+" : "+value+"}";
	}
}
