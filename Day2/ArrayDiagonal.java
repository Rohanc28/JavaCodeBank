package Java_Program;
import java.util.Scanner;

	public class ArrayDiagonal {
	    public static void main(String[] args) {
	    	Scanner scan= new Scanner(System.in);
	    	
	    	int[][][] arr = new int[3][3][3];
	    	System.out.println("Enter the elements of the 3D array:");
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                for (int k = 0; k < 3; k++) {
	                    System.out.printf("arr [%d][%d][%d] = ", i, j, k);
	                    arr[i][j][k] = scan.nextInt();
	                }
	            }
	        }

	        int n = arr.length;

	        for (int i = 0; i < n; i++) {
	            System.out.print(arr[i][i][i] + " ");
	        }
	    }
	}
