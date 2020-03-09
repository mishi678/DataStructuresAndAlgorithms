package exercise;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class QueueStack {
	Queue<Object> q1 = new LinkedList<Object>();
	Queue<Object> q2 = new LinkedList<Object>();
	
	public void push(Object item){
		q1.add(item);
	}
	
	public Object pop(){
		refill();
		return q2.poll();
	}
	
	private void refill(){
		
		if(q2.isEmpty()){
			while(!q1.isEmpty()){
				q2.add(q1.poll());
			}
		}
	}
	public Object peek(){
		return q2.peek();
	}
	
	public boolean isEmpty(){
		return q2.isEmpty() && q1.isEmpty();
	}
	
	@Override
	public String toString() {
		refill();
		
		return Arrays.toString(q2.toArray());
	}
	
}
