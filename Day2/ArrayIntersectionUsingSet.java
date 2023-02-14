package Java_Program;
import java.util.*;

public class ArrayIntersectionUsingSet {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.print("Enter elements of first array (space-separated): ");
	        String[] arr1Str = input.nextLine().split(" ");
	        int[] arr1 = new int[arr1Str.length];
	        for (int i = 0; i < arr1Str.length; i++) {
	            arr1[i] = Integer.parseInt(arr1Str[i]);
	        }

	        System.out.print("Enter elements of second array (space-separated): ");
	        String[] arr2Str = input.nextLine().split(" ");
	        int[] arr2 = new int[arr2Str.length];
	        for (int i = 0; i < arr2Str.length; i++) {
	            arr2[i] = Integer.parseInt(arr2Str[i]);
	        }

	        Set<Integer> set1 = new HashSet<Integer>();
	        for (int i : arr1) {
	            set1.add(i);
	        }

	        Set<Integer> set2 = new HashSet<Integer>();
	        for (int i : arr2) {
	            set2.add(i);
	        }
	        
	        Set<Integer> N = new HashSet<Integer>(set1);
	        N.retainAll(set2);

	        System.out.println("Intersection of the two arrays: " + N);
	    }
	}
