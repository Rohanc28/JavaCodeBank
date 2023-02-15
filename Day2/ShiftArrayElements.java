package Java_Program;

import java.util.Scanner;

public class ShiftArrayElements {
	  public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
	    	System.out.println("Enter array size");
	    	int a=sc.nextInt();
	    	System.out.println("Enter array elements;");
	    	int[] arr=new int[a];
	    	for(int i=0;i<a;i++) {
	    		arr[i]=sc.nextInt();
	    	}
	        int temp = arr[a - 1];
	        for (int i = a - 1; i > 0; i--) {
	            arr[i] = arr[i - 1];
	        }
	        arr[0] = temp;

	        for (int i = 0; i < a; i++) {
	            System.out.print(arr[i] + " ");
	        }
	    }
	}