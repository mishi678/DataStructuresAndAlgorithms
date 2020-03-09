package com.thestacktree.datastructure.tries;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Node {
	public Node() {
		
	}
	public Node(Character ch) {
		this.value = ch;
	}
	public Character value;
	public HashMap<Character, Node> leafNodes = new HashMap<Character, Node>();;
	public boolean endOfWord;
	
	public boolean hasLeafNodes() {
		return !leafNodes.isEmpty();
	}
	public boolean hasLeafNode(Character ch) {
		return hasLeafNodes() && leafNodes.get(ch) != null;
	}
	
	public ArrayList<Node> getLeafNodes() {
		ArrayList<Node> leafArray = new ArrayList<Node>();
		for(Character ch :leafNodes.keySet()){
			leafArray.add(leafNodes.get(ch));
		}
		return leafArray;
	}
	@Override
	public String toString() {
		String eod = endOfWord? ".":"";
		return value +">"+leafNodes+eod;
	}
}
