package Java_Program;
import java.util.*;
public class SqueezeString {
    public static void main(String args[]) {
      Scanner s=new Scanner(System.in);
      String str=s.nextLine();
      String sc="";
      int word=0;
      //boolean flag=false;
      
      for(int i=0;i<str.length();i++){
          if(str.charAt(i)!=' '){
              char a =str.charAt(i);
              sc+=a;
              
          }
          continue;
          }
      
      System.out.println("Squeezed String: "+sc);
    }
}
