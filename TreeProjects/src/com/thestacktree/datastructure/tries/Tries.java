package com.thestacktree.datastructure.tries;

import java.util.ArrayList;
import java.util.List;

public class Tries {
	Node root =  new Node();
	
	public void insert(String world) {
		Node currentNode = root;
		for(Character ch:world.toCharArray()) {
			
			if(!currentNode.hasLeafNode(ch)) 
				currentNode.leafNodes.put(ch, new Node(ch));
			
			currentNode = currentNode.leafNodes.get(ch);
		}
		currentNode.endOfWord = true;
	}
	
	public List<String> listWords() {
		List<String> worldList = new ArrayList<String>();
		String prefix = "";
		listWords(worldList,prefix,root);
		return worldList;
	}
	public void listWords(List<String> worlds, String prefix, Node node) {
		prefix = prefix +( (node.value !=null)? node.value:"");
		if(node.endOfWord)
		{
			worlds.add(prefix);
		}
		if(node.hasLeafNodes())
			for(Node nextNode : node.getLeafNodes())
				listWords(worlds,prefix,nextNode);
	}
	
	public List<String>  autoComplete(String searchWorld) {
		List<String> worldList = new ArrayList<String>();
		
		if(searchWorld!=null)
		{
			Node searchNode = root;
			for(Character ch : searchWorld.toCharArray()) {
				if(searchNode.hasLeafNode(ch))
				searchNode = searchNode.leafNodes.get(ch);
				else
					return worldList;
			}
		
			listWords(worldList,((searchWorld!=null && !searchWorld.isEmpty())?searchWorld.substring(0, searchWorld.length()-1):""),searchNode);
		}
		return worldList;
	}
	
	@Override
	public String toString() {
		return root.leafNodes.toString();
	}
}
