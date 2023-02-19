package Java_Program;
import java.util.ArrayList;
public class StackUsingArray {

	public static class Stack {

	public class Stack {

    private int[] stackArray;
    private int top;
    private int capacity;

    public Stack(int capacity) {
        stackArray = new int[capacity];
        top = -1;
        this.capacity = capacity;
    }

    public void push(int element) {
        if (isFull()) {
            System.out.println("Not empty");
        }
        top++;
        stackArray[top] = element;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Empty");
        }
        int lastElement = stackArray[top];
        top--;
        return lastElement;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Empty");
        }
        return stackArray[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
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
