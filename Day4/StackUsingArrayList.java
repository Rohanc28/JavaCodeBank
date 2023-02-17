package Java_Program;
import java.util.ArrayList;
public class StackUsingArrayList {
	

	public static class Stack {

	    private ArrayList<Integer> stackList;

	    public Stack() {
	        stackList = new ArrayList<Integer>();
	    }

	    public void push(int element) {
	        stackList.add(element);
	    }

	    public int pop() {
	        if (stackList.isEmpty()) {
	        	System.out.println("Queue is Empty");
	        }
	        int lastIndex = stackList.size() - 1;
	        int lastElement = stackList.get(lastIndex);
	        stackList.remove(lastIndex);
	        return lastElement;
	    }

	    public int peek() {
	        if (stackList.isEmpty()) {
	        	System.out.println("Queue is Empty");
	        }
	        int lastIndex = stackList.size() - 1;
	        return stackList.get(lastIndex);
	    }

	    public boolean isEmpty() {
	        return stackList.isEmpty();
	    }

	    public int size() {
	        return stackList.size();
	    }
	    

	}
	public static void main(String[] args) {
		Stack s = new Stack();
		s.push(0);
		s.pop();
		s.push(10);
		System.out.println(s.peek());
		if(!s.isEmpty()) {
			System.out.println("Not empty");
		}
		else{
			System.out.println("Empty");
		}
	}
}
