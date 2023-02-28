package Java_Program;
import java.util.*;

public class SynchronizedFuncExample {
public static class PrintString {
	synchronized void printString(String str) {
		for(int i=0;i<str.length();i++) {
			System.out.println(str.charAt(i));
		
		try {
			System.out.print(" ...zzZZZ    ");
			Thread.sleep(400);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
}
public static class Thread1 extends Thread{
	PrintString printStrObject1;
	Thread1(PrintString printStrObject1){
		this.printStrObject1 = printStrObject1;
	}
	public void run() {
		printStrObject1.printString("abcdefghij");
	}
}

 public static class Thread2 extends Thread{//implements Runnable{
	PrintString printStrObject2;
	Thread2(PrintString printStrObject2){
		this.printStrObject2 = printStrObject2;
	}
	public void run() {
		printStrObject2.printString("ABCDEFGHIJ");
	}
}



	public static void main(String[] args) {
		PrintString newObj = new PrintString();
		Thread1 thread1Obj = new Thread1(newObj);
		Thread2	thread2Obj = new Thread2(newObj);
		thread1Obj.start();
		thread2Obj.start();
	}

}
