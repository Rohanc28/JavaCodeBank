//https://www.hackerrank.com/challenges/java-stdin-stdout/problem?h_r=profile
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d=scan.nextDouble();
        String s=scan.nextLine();
        String s1=scan.nextLine();
        s=s+s1;
        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
