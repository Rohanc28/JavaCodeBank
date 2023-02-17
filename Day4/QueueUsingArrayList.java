package Java_Program;
import java.util.ArrayList;
public class QueueUsingArrayList {

	public static class Queue {

	    private ArrayList<Integer> q;
	    private int capacity;

	    public Queue(int capacity) {
	        this.capacity = capacity;
	   
	        q = new ArrayList<Integer>(capacity);
	    }

	    public void enqueue(int element) {
	        if (isFull()) {
	        	System.out.println("Queue is full");
	        }
	        q.add(element);
	    }

	    public int dequeue() {
	        if (isEmpty()) {
	        	System.out.println("Queue is empty");
	        }
	        int firstElement = q.get(0);
	        q.remove(0);
	        return firstElement;
	    }

	    public int peek() {
	        if (isEmpty()) {
	            System.out.println("Queue is empty");
	        }
	        return q.get(0);
	    }

	    public boolean isEmpty() {
	        return q.isEmpty();
	    }

	    public boolean isFull() {
	        return q.size() == capacity;
	    }
	}

	public static void main(String[] args) {
		Queue q= new Queue(5);
		q.enqueue(0);
		q.dequeue();
		q.enqueue(10);
		System.out.println(q.peek());
		if(q.isEmpty()) {
			System.out.println("Queue is empty");
		}
		else if(q.isFull()) {
			System.out.println("Queue is full");
			
		}
		else {
			System.out.println("Queue neither full, nor empty");
		}
		
	}
}
