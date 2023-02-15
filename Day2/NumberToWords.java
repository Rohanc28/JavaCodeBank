package Java_Program;
import java.util.Scanner;

public class NumberToWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        System.out.println(convertNumberToWords(num));
    }

    public static String convertNumberToWords(int num) {
        String[] units = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] teens = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

        if (num < 10) {
            return units[num];
        } else if (num < 20) {
            return teens[num - 10];
        } else if (num < 100) {
            return tens[num / 10] + " " + units[num % 10];
        } else if (num < 1000) {
            return units[num / 100] + " hundred " + convertNumberToWords(num % 100);
        } else if (num < 1000000) {
            return convertNumberToWords(num / 1000) + " thousand " + convertNumberToWords(num % 1000);
        } else {
            return "Number out of range";
        }
    }
}