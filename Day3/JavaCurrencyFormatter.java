//https://www.hackerrank.com/challenges/java-currency-formatter/problem?h_r=profile

public class Solution {
    
    private static final DecimalFormat df = new DecimalFormat("00,000.00");
  //us ind china
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
      NumberFormat n = NumberFormat.getCurrencyInstance(Locale.US);
        String us = n.format(payment);
        NumberFormat n1 = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        String india = n1.format(payment);
        NumberFormat n2 = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = n2.format(payment);
        NumberFormat n3 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = n3.format(payment);
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
