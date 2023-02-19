package Java_Program;
import java.util.ArrayList;

public class QueueUsingArray {
    private int[] queueArray;
    private int front;
    private int rear;
    private int maxSize;

    public QueueUsingArray(int size) {
        maxSize = size;
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
    }

    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full");
        }
        rear++;
        queueArray[rear] = data;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        }
        int temp = queueArray[front];
        front++;
        if (front == maxSize) {
            front = 0;
        }
        return temp;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        }
        return queueArray[front];
    }

    public boolean isEmpty() {
        return (rear == -1 || front == rear + 1);
    }

    public boolean isFull() {
        return (rear == maxSize - 1 || front == 0 && rear == maxSize - 1);
    }

    public int size() {
        if (isEmpty()) {
            return 0;
        }
        if (isFull()) {
            return maxSize;
        }
        if (rear >= front) {
            return rear - front + 1;
        } else {
            return (maxSize - front) + (rear + 1);
        }
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
