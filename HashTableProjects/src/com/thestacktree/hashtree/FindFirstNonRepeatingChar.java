package com.thestacktree.hashtree;

import java.util.HashMap;
import java.util.Map;

public class FindFirstNonRepeatingChar {
	public static void main(String[] args) {
		String inutString = "acsg green apple";
		Map<Character,Integer> map  = new HashMap<Character,Integer>();
		for(Character ch: inutString.toCharArray()){
			if(map.containsKey(ch)){
				map.put(ch ,  1 + map.get(ch));
			}else{
				map.put(ch ,  1);
			}
		}
		System.out.println(map);
		for(Character ch: inutString.toCharArray()){
			if( map.get(ch) == 1){
				System.out.println(ch);
				break;
			}
		}
		
		
		
	}
}
