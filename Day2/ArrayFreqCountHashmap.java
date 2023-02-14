package Java_Program;
import java.util.*;
import java.util.Scanner;
public class ArrayFreqCountHashmap {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.print("Enter number of rows: ");
	        int rows = input.nextInt();
	        System.out.print("Enter number of columns: ");
	        int cols = input.nextInt();
	        int[][] arr = new int[rows][cols];
	        System.out.println("Enter elements of array:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                arr[i][j] = input.nextInt();
	            }
	        }

	        Map<Integer, Integer> freqTable = new HashMap<Integer, Integer>();
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                int element = arr[i][j];
	                if (freqTable.containsKey(element)) {
	                    freqTable.put(element, freqTable.get(element) + 1);
	                } else {
	                    freqTable.put(element, 1);
	                }
	            }
	        }

	        System.out.println("Frequency count of elements:");
	        for (int element : freqTable.keySet()) {
	            int count = freqTable.get(element);
	            System.out.println(element + " : " + count);
	        }
	    }
	}

