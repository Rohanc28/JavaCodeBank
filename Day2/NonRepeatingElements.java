package Java_Program;

import java.util.Scanner;

public class NonRepeatingElements {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        System.out.print("Enter size of array: ");
	        int size = input.nextInt();
	        int[] arr = new int[size];
	        System.out.println("Enter elements of array:");
	        for (int i = 0; i < size; i++) {
	            arr[i] = input.nextInt();
	        }
	        int[] freqTable = new int[1000]; 
	        for (int i = 0; i < size; i++) {
	            int element = arr[i];
	            freqTable[element]++;
	        }
	        System.out.print("Non-repeating elements: ");
	        for (int i = 0; i < size; i++) {
	            int element = arr[i];
	            if (freqTable[element] == 1) {
	                System.out.print(element + " ");
	            }
	        }
	    }
	}
