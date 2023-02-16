//https://www.hackerrank.com/challenges/java-loops/problem?h_r=profile
class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            double prev=a;
            for(int j=0;j<n;j++){
                prev=(prev + (Math.pow(2,j)*b));
                int d=(int)prev;
                System.out.print(d+" ");
                
            }
            System.out.println();
        }
        
        in.close();
    }
}
