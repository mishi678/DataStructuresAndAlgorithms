package com.thestacktree.datastructure.tries;

public class Main {
public static void main(String[] args) {
	Tries tries = new Tries();
	
	tries.insert("book");
	tries.insert("booking");
	tries.insert("apple");
	tries.insert("bible");
	tries.insert("baby");
	tries.insert("qaby");
	tries.insert("baby");
	tries.insert("waby");
	tries.insert("babsy");
	tries.insert("baby");
	tries.insert("aakaby");
	tries.insert("baby");
	tries.insert("babyy");
	tries.insert("baby");
	tries.insert("babyy");
	tries.insert("rbaby");
	tries.insert("brraby");
	System.out.println(tries.listWords());
	System.out.println(tries.autoComplete("bo"));

}
}
