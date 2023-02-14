package Java_Program;

import java.util.Scanner;

public class MaxElement3d {
	public static int findMax(int[][][] arr) {
	    int max = Integer.MIN_VALUE;
	    for (int[][] matrix : arr) {
	        for (int[] row : matrix) {
	            for (int num : row) {
	                if (num > max) {
	                    max = num;
	                }
	            }
	        }
	    }
	    return max;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int rows = scan.nextInt();
		int cols =scan.nextInt();
		int dep =scan.nextInt();
		int[][][] arr = new int[rows][cols][dep];
		System.out.println("R: "+rows+"\n"+"C: "+cols+"\nD: "+dep);
		System.out.println("Enter the elements of the array:");
	    for (int i = 0; i < rows; i++) {
	        for (int j = 0; j < cols; j++) {
	        	for(int k = 0; k < dep; k++) {
	            arr[i][j][k] = scan.nextInt();
	        	}
	        }
	    }
	    System.out.println("The 3D array is:");
	    for (int i = 0; i < rows; i++) {
	    	System.out.println("i: "+(i+1)+"\n");
	        for (int j = 0; j < cols; j++) {
	        	for(int k=0; k < dep;k++) {
	            System.out.print(arr[i][j][k] + " ");
	        	}
	        	System.out.println();
	        }
	        System.out.println();
	    }
	    System.out.println("Max element: "+findMax(arr));
		}
}
