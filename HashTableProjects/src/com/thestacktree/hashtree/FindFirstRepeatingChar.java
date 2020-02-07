package com.thestacktree.hashtree;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindFirstRepeatingChar {
 public static void main(String[] args) {
	String astring = " green apple";
	Set<Character> amap = new HashSet();
	
	for(Character ch : astring.toCharArray()){
		if(amap.contains(ch)){
			System.out.println("First Repeted character is "+ch);
			break;
		}
		amap.add(ch);
	}
}
}
