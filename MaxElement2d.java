package Java_Program;
import java.io.*;
import java.util.Scanner;

public class MaxElement2d {

public static int findMax(int[][] arr) {
    int max = Integer.MIN_VALUE;
    for (int[] row : arr) {
        for (int num : row) {
            if (num > max) {
                max = num;
            }
        }
    }
    return max;
}
	public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	int rows = scan.nextInt();
	int cols =scan.nextInt();
	int[][] arr = new int[rows][cols];
	System.out.println("R: "+rows+"\n"+"C: "+cols);
	System.out.println("Enter the elements of the array:");
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            arr[i][j] = scan.nextInt();
        }
    }
    System.out.println("The 2D array is:");
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            System.out.print(arr[i][j] + " ");
        }
        System.out.println();
    }
    System.out.println("Max element: "+findMax(arr));
	}
}
