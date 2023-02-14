package Java_Program;
import java.util.Scanner;

public class SortArray2d {
	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);

	        System.out.print("Enter the number of rows: ");
	        int rows = scan.nextInt();
	        System.out.print("Enter the number of columns: ");
	        int cols = scan.nextInt();

	        int[][] arr = new int[rows][cols];

	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                arr[i][j] = scan.nextInt();
	            }
	        }

	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                for (int k = 0; k < rows; k++) {
	                    for (int l = 0; l < cols; l++) {
	                        if (arr[i][j] < arr[k][l]) {
	                            int temp = arr[i][j];
	                            arr[i][j] = arr[k][l];
	                            arr[k][l] = temp;
	                        }
	                    }
	                }
	            }
	        }
	        System.out.println("The sorted 2D array is:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                System.out.print(arr[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
	}
