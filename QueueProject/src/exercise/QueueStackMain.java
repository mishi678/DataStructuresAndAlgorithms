package exercise;

public class QueueStackMain {
	public static void main(String[] args) {
		QueueStack stack = new QueueStack();
		System.out.println(stack.isEmpty());
		stack.push("1");
		stack.push("2");
		stack.push("3");
		stack.push("4");
		stack.push("5");
		System.out.println(stack.isEmpty());
		
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
		
	}
}
