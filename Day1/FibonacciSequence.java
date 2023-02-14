package Java_Program;

import java.io.*;
import java.util.Scanner;
public class FibonacciSequence {
	static int fibo(int n){
        if (n <= 1)
            return n;
 
        return fibo(n - 1)+ fibo(n - 2);
    }
  
	public static void main (String[] args) {
		Scanner scan = new Scanner (System.in);
		//String s = new String();
	    //s = scan.nextLine();
	    //System.out.println("s: "+s);
	    int a =scan.nextInt();
		//
		for(int i=0;i<a;i++){
		    System.out.print(fibo(i)+", ");
		}
       
	}
}
