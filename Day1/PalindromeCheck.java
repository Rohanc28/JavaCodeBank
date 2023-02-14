package Java_Program;

import java.io.*;
import java.util.Scanner;
public class PalindromeCheck {

	public static void main (String[] args) {
		Scanner scan = new Scanner (System.in);
		String s = new String();
	    s = scan.nextLine();
	    //ABBABBA inp
		System.out.println("s: "+s);
		//
		for(int i=0;i<s.length()/2;i++){
		    // no need to check for center char in case of odd length string
		    if(s.charAt(i)!=s.charAt(s.length()-1-i)){
		        System.out.println("NOT A PALINDROME");
		        return;
		    }
		}
		System.out.println("ITS A PALINDROME!");
	
		
	}
}
