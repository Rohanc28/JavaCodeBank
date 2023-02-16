//https://www.hackerrank.com/challenges/java-static-initializer-block/problem?h_r=profile
public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a<=0 || b<=0){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
        else{
            System.out.println(a*b);
        }
    }
