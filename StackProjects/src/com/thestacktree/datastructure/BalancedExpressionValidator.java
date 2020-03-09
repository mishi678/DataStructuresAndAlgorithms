package com.thestacktree.datastructure;

import java.util.Stack;

public class BalancedExpressionValidator {

	public boolean isBalncedExpression(String expressionInput){
		boolean isBalanced = false;
		String openExpressionSymbols ="{([";
		String closingExpressionSymbols ="})]";
		Stack<Character> symbolStacl = new Stack<Character>();
		for(Character ch : expressionInput.toCharArray()){
			if(openExpressionSymbols.contains(ch.toString()) ){
				symbolStacl.push(closingExpressionSymbols.charAt(openExpressionSymbols.indexOf(ch.toString())));
			}else if( closingExpressionSymbols.contains(ch.toString())){
				if( !symbolStacl.isEmpty() && symbolStacl.pop().toString().equals(ch.toString())){
					isBalanced = true;
				}else{
					isBalanced = false;
					break;
				}
			}
			
		}
		
		return isBalanced && symbolStacl.isEmpty();
	}
}
