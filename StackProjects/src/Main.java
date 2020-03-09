import com.thestacktree.datastructure.BalancedExpressionValidator;
import com.thestacktree.datastructure.Stack;

public class Main {
	public static void main(String[] args) {
//		BalancedExpressionValidator expValidator = new BalancedExpressionValidator();
//		String expressionInput = "((j({[,<]}) + (a+b) ))";
//		System.out.println("Is Expression "+expressionInput+" isBalanced :"+expValidator.isBalncedExpression(expressionInput));
		
		Stack stack = new Stack();
		stack.push("Item1");
		stack.push("Item2");
		stack.push("Item3");
		stack.push("Item4");
		stack.push("Item5");
		
		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		
	}
}
