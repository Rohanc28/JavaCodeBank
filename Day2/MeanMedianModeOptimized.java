package Java_Program;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
public class MeanMedianModeOptimized {
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
	        Arrays.sort(arr);

	        if (n % 2 == 0) {
	            return (double) (arr[n / 2 - 1] + arr[n / 2]) / 2;
	        } else {
	            return arr[n / 2];
	        }
	    }

	    public static int findMode(int[] arr) {
	        int n = arr.length;
	        HashMap<Integer, Integer> freqMap = new HashMap<>();

	        for (int i = 0; i < n; i++) {
	            int freq = freqMap.getOrDefault(arr[i], 0);
	            freqMap.put(arr[i], freq + 1);
	        }

	        int maxFreq = 0;
	        int mode = -1;

	        for (int key : freqMap.keySet()) {
	            int freq = freqMap.get(key);

	            if (freq > maxFreq) {
	                maxFreq = freq;
	                mode = key;
	            }
	        }

	        return mode;
	    }
	}


