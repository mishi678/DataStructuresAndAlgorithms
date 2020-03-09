import java.util.Stack;

public class ExpressionValidator {

	public boolean isBalanced(String ecpressionString) {
		boolean isBalanced = false;
		String symbols="{}()<>[]";
		Stack<String> symbolStack = new Stack<String>();
		for(Character ch:ecpressionString.toCharArray())
		{
			if(symbols.contains(ch.toString())) {
				symbolStack.push(ch.toString());
			}
			
		}
		
		return isBalanced;		
	}
	
}
