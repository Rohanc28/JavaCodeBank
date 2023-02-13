package Java_Program;

import java.io.*;
import java.util.Scanner;
public class IntSwap {
	public static void main (String[] args) {
		Scanner scan = new Scanner (System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println("a:"+a+"\nb:"+b);
	
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a:" +a+"\nb:"+b);
		
	}
}
