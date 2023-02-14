package Java_Program;
import java.util.Scanner;

public class Sum3DArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the dimensions of 3D arrays: ");
        int rows = scan.nextInt();
        int cols = scan.nextInt();
        int depth = scan.nextInt();

        int[][][] arr1 = new int[rows][cols][depth];
        int[][][] arr2 = new int[rows][cols][depth];

        System.out.println("Enter the elements of array1: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < depth; k++) {
                    arr1[i][j][k] = scan.nextInt();
                }
            }
        }

        System.out.println("Enter the elements of array2: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < depth; k++) {
                    arr2[i][j][k] = scan.nextInt();
                }
            }
        }

        int[][][] sumArray = new int[rows][cols][depth];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < depth; k++) {
                    sumArray[i][j][k] = arr1[i][j][k] + arr2[i][j][k];
                }
            }
        }

        System.out.println("The sum of the two 3D arrays is: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < depth; k++) {
                    System.out.print(sumArray[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}

