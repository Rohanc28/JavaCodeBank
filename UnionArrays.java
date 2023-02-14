package Java_Program;
import java.util.*;

public class UnionArrays {
    public static int[] getUnion(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }
        int[] union = new int[set.size()];
        int i = 0;
        for (Integer num : set) {
            union[i++] = num;
        }
        return union;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the size of the first array: ");
        int n = scan.nextInt();
        int[] arr1 = new int[n];
        System.out.println("Enter the elements of the first array: ");
        for (int i = 0; i < n; i++) {
            arr1[i] = scan.nextInt();
        }

        System.out.print("Enter the size of the second array: ");
        int m = scan.nextInt();
        int[] arr2 = new int[m];
        System.out.println("Enter the elements of the second array: ");
        for (int i = 0; i < m; i++) {
            arr2[i] = scan.nextInt();
        }

        int[] union = getUnion(arr1, arr2);
        System.out.print("Union of the two arrays: ");
        for (int i = 0; i < union.length; i++) {
            System.out.print(union[i] + " ");
        }
    }

}
