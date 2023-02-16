//https://www.hackerrank.com/challenges/java-interface/problem?h_r=profile
//Write your code here
class MyCalculator implements AdvancedArithmetic {
    public int divisor_sum(int n) {
        int sum = 0;
        int sqrt = (int) Math.sqrt(n);
        for (int i = 1; i <= sqrt; i++) {
            if (n % i == 0) {
                sum += i + n/i; 
            }
        }
        if (sqrt * sqrt == n) {
            sum -= sqrt;
        }
        return sum;
    }
}
