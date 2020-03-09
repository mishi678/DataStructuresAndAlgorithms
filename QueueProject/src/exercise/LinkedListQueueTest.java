package exercise;

import com.thestacktree.datastructure.LinkedListQueue;

public class LinkedListQueueTest {
	public static void main(String[] args) {
		LinkedListQueue q = new LinkedListQueue();
		
		q.enqueue("1");
		q.enqueue("2");
		q.enqueue("3");
		q.enqueue("4");
		q.enqueue("5");
		q.enqueue("6");
		System.out.println(q);
		q.dequeue();
		System.out.println(q);
		System.out.println(q.peek());
		System.out.println(q);
		
	}
}
