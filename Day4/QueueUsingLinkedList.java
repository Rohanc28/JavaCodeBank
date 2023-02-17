package Java_Program;
import java.util.LinkedList;

public class QueueUsingLinkedList {
	

	public static class Queue {

	    private LinkedList<Integer> queueList;
	    private int capacity;

	    public Queue(int capacity) {
	        this.capacity = capacity;
	        queueList = new LinkedList<Integer>();
	    }

	    public void enqueue(int element) {
	        if (isFull()) {
	        	System.out.println("Queue is full");
	        }
	        queueList.addLast(element);
	    }

	    public int dequeue() {
	        if (isEmpty()) {
	        	System.out.println("Queue is empty");
	        }
	        int firstElement = queueList.getFirst();
	        queueList.removeFirst();
	        return firstElement;
	    }

	    public int peek() {
	        if (isEmpty()) {
	        	System.out.println("Queue is empty");
	        }
	        return queueList.getFirst();
	    }

	    public boolean isEmpty() {
	        return queueList.isEmpty();
	    }

	    public boolean isFull() {
	        return queueList.size() == capacity;
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
