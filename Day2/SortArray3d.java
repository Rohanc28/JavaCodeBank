package Java_Program;
import java.util.Scanner;

public class SortArray3d {
	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);

	        System.out.print("Enter the number of 3D array elements: ");
	        int n = scan.nextInt();
	        System.out.print("Enter the number of rows in each matrix: ");
	        int rows = scan.nextInt();
	        System.out.print("Enter the number of columns in each matrix: ");
	        int cols = scan.nextInt();

	        int[][][] arr = new int[n][rows][cols];

	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < rows; j++) {
	                for (int k = 0; k < cols; k++) {
	                    arr[i][j][k] = scan.nextInt();
	                }
	            }
	        }

	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < rows; j++) {
	                for (int k = 0; k < cols; k++) {
	                    for (int x = 0; x < n; x++) {
	                        for (int y = 0; y < rows; y++) {
	                            for (int z = 0; z < cols; z++) {
	                                if (arr[i][j][k] < arr[x][y][z]) {
	                                    int temp = arr[i][j][k];
	                                    arr[i][j][k] = arr[x][y][z];
	                                    arr[x][y][z] = temp;
	                                }
	                            }
	                        }
	                    }
	                }
	            }
	        }

	        System.out.println("The sorted 3D array is:");
	        for (int i = 0; i < n; i++) {
	            System.out.println("Matrix " + i + ":");
	            for (int j = 0; j < rows; j++) {
	                for (int k = 0; k < cols; k++) {
	                    System.out.print(arr[i][j][k] + " ");
	                }
	                System.out.println();
	            }
	            System.out.println();
	        }
	    }
	}

