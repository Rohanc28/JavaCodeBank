package Java_Program;
import java.util.*;

class ThreadClass implements Runnable {
    public void run() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        System.out.println("thread t1 join thread t2: \t" + ThreadState.t1.getState());
  
        try {
            Thread.sleep(200);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }
}

public class ThreadState implements Runnable {
    public static Thread t1;
    public static ThreadState obj;

    public static void main(String argvs[]) {  
        obj = new ThreadState();
        t1 = new Thread(obj);
        System.out.println("thread t1 created: \t\t\t" + t1.getState());
        t1.start();
        System.out.println("thread t1 start(): \t\t\t" + t1.getState());
    }

    public void run() {
        ThreadClass myObj = new ThreadClass();
        Thread t2 = new Thread(myObj);
        System.out.println("thread t2 created: \t\t\t" + t2.getState());
        t2.start();
        System.out.println("thread t2 start(): \t\t\t" + t2.getState());

        try {  
            Thread.sleep(200);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }

        System.out.println("thread t2 sleep: \t\t\t" + t2.getState());
        try { 
            t2.join();
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        System.out.println("thread t2 process done: \t" + t2.getState());
    }

}
