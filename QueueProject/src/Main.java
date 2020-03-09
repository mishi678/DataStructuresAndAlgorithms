import com.thestacktree.datastructure.ArrayQueue;
import com.thestacktree.datastructure.PriorityQueue;
import com.thestacktree.datastructure.StackQueue;

public class Main {
	public static void main(String[] args) {
		//ArrayQueue queue = new ArrayQueue();
//		StackQueue queue = new StackQueue();
		PriorityQueue queue = new PriorityQueue(10);
		try {
			queue.enqueue("9");
			queue.enqueue("2");
			queue.enqueue("7");
			queue.enqueue("4");
			System.out.println(queue);
			
			queue.enqueue("5");
			queue.enqueue("2");
			System.out.println(queue);
			
			queue.dequeue();
			System.out.println(queue);
			
			System.out.println(queue.peek());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
