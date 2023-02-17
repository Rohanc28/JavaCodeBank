package Java_Program;
import java.util.LinkedList;

public class StackUsingLinkedList {
	

	public static class Stack {

	    private LinkedList<Integer> stackList;
	    private int capacity;

	    public Stack(int capacity) {
	        this.capacity = capacity;
	        stackList = new LinkedList<Integer>();
	    }

	    public void push(int element) {
	        if (isFull()) {
	        	System.out.println("Stack is full");
	        }
	        stackList.addLast(element);
	    }

	    public int pop() {
	        if (isEmpty()) {
	        	System.out.println("Stack is empty");
	        }
	        int lastElement = stackList.getLast();
	        stackList.removeLast();
	        return lastElement;
	    }

	    public int peek() {
	        if (isEmpty()) {
	        	System.out.println("Stack is empty");
	        }
	        return stackList.getLast();
	    }

	    public boolean isEmpty() {
	        return stackList.isEmpty();
	    }

	    public boolean isFull() {
	        return stackList.size() == capacity;
	    }
	}

	public static void main (String[] args) {
		Stack s=new Stack(10);
		s.push(0);
		s.pop();
		s.push(10);
		System.out.println(s.peek());
		if(s.isEmpty()) {
			System.out.println("Stack is empty");
		}
		else if(s.isFull()) {
			System.out.println("Stack is full");
		}
		else {
			System.out.println("Stack is neither full, nor empty.");
		}
	}
}
