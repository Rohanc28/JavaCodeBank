//https://www.hackerrank.com/challenges/java-string-compare/problem?h_r=profile

import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
    String smallest = "";
    String largest = "";
    for(int i=0;i<k;i++){
        smallest=smallest+s.charAt(i);
        largest=largest+s.charAt(i);
    }
    String abc;
    for(int i=0;i<s.length()-k+1;i++){
        abc="";
        for(int j=0;j<k;j++){
            abc = abc+s.charAt(i+j);
        }
        if(abc.compareTo(largest)>0){
            largest=abc;
        }
        if(abc.compareTo(smallest)<0){
            smallest=abc;
        }
    }
    return smallest + "\n" + largest;
}


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
