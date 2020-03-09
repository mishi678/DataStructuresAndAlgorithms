package exercise;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueueMain {
	public static void main(String[] args) {
		Queue orginalQueue = new ArrayDeque<>();
		orginalQueue.add("10");
		orginalQueue.add("20");
		orginalQueue.add("30");
		orginalQueue.add("40");
		orginalQueue.add("50");
		
		System.out.println(orginalQueue);
		System.out.println(reverseQueueTill(orginalQueue,3));
		
	}
	
	public static Queue reverseQueueTill(Queue orginalQueue, int position){
		Queue newReversedQueue = new ArrayDeque<>();
		int iterationCount = 0;
		Stack queueStack = new Stack<Object>();
		while (!orginalQueue.isEmpty() && iterationCount++ < position) {
			queueStack.add(orginalQueue.poll());			
		}
		
		while (!queueStack.isEmpty() ) {
			newReversedQueue.add(queueStack.pop());			
		}
		while (!orginalQueue.isEmpty() ) {
			newReversedQueue.add(orginalQueue.poll());			
		}
		
		
		
		return newReversedQueue;
	}
}
