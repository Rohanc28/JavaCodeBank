package Java_Program;
import java.io.*;
import java.util.Scanner;
public class VowelCheck {
	public static void main (String[] args) {
		Scanner scan = new Scanner (System.in);
		String s = new String();
	    	s = scan.nextLine();
		System.out.println("s: "+s);
		s=s.toLowerCase();
		int count=0;
		for(int i=0;i<s.length();i++){
		if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
		    count++;
			}
		}
	System.out.println("Vowel count: "+count);
		
	}
}
