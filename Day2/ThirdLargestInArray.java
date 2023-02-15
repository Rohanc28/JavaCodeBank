package Java_Program;
import java.util.Arrays;
import java.util.Scanner;
public class ThirdLargestInArray {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter array size");
    	int a=sc.nextInt();
    	System.out.println("Enter elements: ");
    	int[] arr= new int[a];
    	for(int i=0;i<a;i++) {
    		arr[i]=sc.nextInt();
    	}
        int thirdLargest = findThirdLargest(arr);
        System.out.println("Third largest element is: " + thirdLargest);
    }

    public static int findThirdLargest(int[] arr) {
        int n = arr.length;
        if (n < 3) {
            System.out.println("Array size is less than 3");
            return -1;
        }

        int first = arr[0];
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int i = 1; i < n; i++) {
            if (arr[i] > first) {
                third = second;
                second = first;
                first = arr[i];
            } else if (arr[i] > second) {
                third = second;
                second = arr[i];
            } else if (arr[i] > third) {
                third = arr[i];
            }
        }

        return third;
    }
}
