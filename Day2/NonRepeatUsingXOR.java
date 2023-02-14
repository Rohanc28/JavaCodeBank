package Java_Program;

import java.util.Scanner;

public class NonRepeatUsingXOR {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        System.out.print("Enter size of array: ");
	        int size = input.nextInt();
	        int[] arr = new int[size];
	        System.out.println("Enter elements of array:");
	        for (int i = 0; i < size; i++) {
	            arr[i] = input.nextInt();
	        }
	        int xor = 0;
	        for (int i = 0; i < size; i++) {
	            xor ^= arr[i];
	        }

	        int rightmostSetBit = xor & -xor;
	        int group1 = 0, group2 = 0;
	        for (int i = 0; i < size; i++) {
	            int element = arr[i];
	            if ((element & rightmostSetBit) != 0) {
	                group1 ^= element;
	            } else {
	                group2 ^= element;
	            }
	        }
	        System.out.print("Non-repeating elements: ");
	        if (group1 != 0) {
	            System.out.print(group1 + " ");
	        }
	        if (group2 != 0) {
	            System.out.print(group2 + " ");
	        }
	    }
	}

