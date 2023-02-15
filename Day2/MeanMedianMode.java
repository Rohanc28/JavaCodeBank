package Java_Program;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Scanner;
public class MeanMedianMode {

    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter array size");
    	int a=sc.nextInt();
    	System.out.println("Enter array elements;");
    	int[] arr=new int[a];
    	for(int i=0;i<a;i++) {
    		arr[i]=sc.nextInt();
    	}
        double mean = findMean(arr);
        double median = findMedian(arr);
        int mode = findMode(arr);

        System.out.println("Mean: " + mean);
        System.out.println("Median: " + median);
        System.out.println("Mode: " + mode);
    }

    public static double findMean(int[] arr) {
        int n = arr.length;
        double sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        return sum / n;
    }

    public static double findMedian(int[] arr) {
        int n = arr.length;
        double median;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        if (n % 2 == 0) {
            median = (double) (arr[(n / 2) - 1] + arr[n / 2]) / 2;
        } else {
            median = (double) arr[n / 2];
        }

        return median;
    }

    public static int findMode(int[] arr) {
        int n = arr.length;
        int mode = arr[0];
        int maxCount = 0;

        for (int i = 0; i < n; i++) {
            int count = 0;

            for (int j = 0; j < n; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                mode = arr[i];
            }
        }

        return mode;
    }
}
