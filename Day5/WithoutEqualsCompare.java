import java.util.*; 

public class WithoutEqualsCompare {
  
    static void usingXor(int a, int b){
        if ((a ^ b) != 0)
            System.out.print("Not Same");
        else
            System.out.print("Same");
    }
    static void compareInt(int a,int b){
        if (a==b){
            System.out.print("Same");
        }
        else
            System.out.print("Not Same");
    }
    public static void main(String[] args)
    {
        System.out.println("Using Xor: ");usingXor(10, 20);
        System.out.println("\nUsing comparison: ");compareInt(10, 20);
    }
}
