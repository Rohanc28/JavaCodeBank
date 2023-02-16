//https://www.hackerrank.com/challenges/java-loops-i/problem?h_r=profile
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();
        //write code here
        for(int i=1;i<11;i++){
            System.out.println(N+" x "+i+" = "+(i*N));
        }
    }
}
