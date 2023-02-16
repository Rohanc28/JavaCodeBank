//https://www.hackerrank.com/challenges/java-output-formatting/problem?h_r=profile
public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            //for(int i=0;i<3;i++)
            //{
                String s1=sc.next();
                int x1=sc.nextInt();
                String s2=sc.next();
                int x2=sc.nextInt();
                String s3=sc.next();
                int x3=sc.nextInt();
                System.out.print(s1);
                //
                for(int i=0;i<(15-s1.length());i++){
                    System.out.print(" ");
                }
                if(x1<10){
                    System.out.print("00"+x1+"\n");
                }
                else if(x1<100){
                    System.out.print("0"+x1+"\n");
                }
                else{
                    System.out.print(x1+"\n");
                }
                //
                System.out.print(s2);
                for(int j=0;j<(15-s2.length());j++){
                    System.out.print(" ");
                }
                if(x2<10){
                    System.out.print("00"+x2+"\n");
                }
                else if(x2<100){
                    System.out.print("0"+x2+"\n");
                }
                else{
                    System.out.print(x2+"\n");
                }
                //
                System.out.print(s3);
                for(int k=0;k<(15-s3.length());k++){
                    System.out.print(" ");
                }
                if(x3<10){
                    System.out.print("00"+x3+"\n");
                }
                else if(x3<100){
                    System.out.print("0"+x3+"\n");
                }
                else{
                    System.out.print(x3+"\n");
                }
                //Complete this line
            
            System.out.println("================================");
    }
}

