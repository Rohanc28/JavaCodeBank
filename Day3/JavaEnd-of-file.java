//https://www.hackerrank.com/challenges/java-end-of-file/problem?h_r=profile

public class Solution {

   public static void main(String[] args) {
   Scanner scan = new Scanner(System.in);
   for(int i = 1; scan.hasNext()== true; i++){
       System.out.println(i + " " + scan.nextLine());
   }
}
}
