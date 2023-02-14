package Java_Program;
import java.util.Scanner;

public class IntersectionArrays {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n1 = scan.nextInt();
        int[] arr1 = new int[n1];
        System.out.print("Enter the elements of first array: ");
        for (int i = 0; i < n1; i++) {
            arr1[i] = scan.nextInt();
        }

        System.out.print("Enter size of second array: ");
        int n2 = scan.nextInt();
        int[] arr2 = new int[n2];
        System.out.print("Enter the elements of second array: ");
        for (int i = 0; i < n2; i++) {
            arr2[i] = scan.nextInt();
        }

        int[] intersection = new int[Math.min(n1, n2)];
        int count = 0;
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                if (arr1[i] == arr2[j]) {
                    boolean alreadyExists = false;
                    for (int k = 0; k < count; k++) {
                        if (intersection[k] == arr1[i]) {
                            alreadyExists = true;
                            break;
                        }
                    }
                    if (!alreadyExists) {
                        intersection[count++] = arr1[i];
                    }
                    break;
                }
            }
        }

        if (count == 0) {
            System.out.println("There is no intersection between the two arrays.");
        } else {
            System.out.print("The intersection of the two arrays is: ");
            for (int i = 0; i < count; i++) {
                System.out.print(intersection[i] + " ");
            }
        }
    }
}
