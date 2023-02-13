package Java_Program;

import java.io.*;
import java.util.Scanner;
public class PrimeCheck {
	public static void main (String[] args) {
		Scanner scan = new Scanner (System.in);
		//String s = new String();
	    //s = scan.nextLine();
	    //System.out.println("s: "+s);
	    int a =scan.nextInt();
		//
		int count = 0;
        for (int i = 1; i <= a; i++){
            if (a % i == 0)
                count++;
        }
        if (count == 2)
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
	}
}
