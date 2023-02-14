package Java_Program;
import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = scan.nextInt();
        int[] binary = new int[size];
        System.out.println("Enter binary array:");
        for (int i = 0; i < size; i++) {
            binary[i] = scan.nextInt();
        }

        int decimal = 0;
        for (int i = 0; i < size; i++) {
            decimal = decimal * 2 + binary[i];
        }

        System.out.println("Decimal value: " + decimal);
    }
}

