import java.util.Stack;

public class StringReversal {

	public String reverse(String s) {
		StringBuffer revString =new StringBuffer(s.length());

		Stack<Character> charStack = new Stack<Character>();
		for (char c :s.toCharArray()) {
			charStack.push(c);
		}
		
		while(!charStack.isEmpty()) {
			revString.append(charStack.pop());
		}
		return revString.toString();
	}
}
