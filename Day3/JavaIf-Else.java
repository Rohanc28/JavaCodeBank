//https://www.hackerrank.com/challenges/java-if-else/problem?h_r=profile
public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
        //write code here
        if(N%2==1){
            System.out.println("Weird");
        }
        else{
            if(N<=5 && N>=2){
                System.out.println("Not Weird");
            }
            if(N>=6 && N<=20){
                System.out.println("Weird");
            }
            if(N>20){
                System.out.println("Not Weird");
            }
        }
    }
    
}
