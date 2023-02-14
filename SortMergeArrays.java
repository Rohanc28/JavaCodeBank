package Java_Program;
import java.util.Arrays;
import java.util.Scanner;
public class SortMergeArrays {

    public static int[] merge(int[] arr1, int[] arr2) {
        int i = 0, j = 0, k = 0;
        int[] merged = new int[arr1.length + arr2.length];

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }

        while (i < arr1.length) {
            merged[k++] = arr1[i++];
        }

        while (j < arr2.length) {
            merged[k++] = arr2[j++];
        }

        return merged;
    }
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);

		System.out.println("Enter array size");
		int a=scan.nextInt();
		int b=a;
		int[] ar =new int[a];
		int[] br =new int[b];
		System.out.println("Enter elements for first array");
		for(int i=0;i<a;i++) {
			ar[i]=scan.nextInt();
		}
		System.out.println("Enter elements for second array");
		for(int i=0;i<a;i++) {
			br[i]=scan.nextInt();
		}
        Arrays.sort(ar);
        Arrays.sort(br);

        int[] mergedArray = merge(ar, br);
        System.out.println("Merged and sorted array: " + Arrays.toString(mergedArray));
    }
}
