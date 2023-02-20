package Java_Program;
import java.util.*;
public class CharCount {
    public static void main(String args[]) {
      Scanner s=new Scanner(System.in);
      String str=s.nextLine();
      int word=0;
      for(int i=0;i<str.length();i++){
          if(str.charAt(i)!=' ' && (str.charAt(i)!='1')&& (str.charAt(i)!='2')&& (str.charAt(i)!='3')&& (str.charAt(i)!='4')&& (str.charAt(i)!='5')&& (str.charAt(i)!='6')&& (str.charAt(i)!='7')&& (str.charAt(i)!='8')&& (str.charAt(i)!='9')&& (str.charAt(i)!='0')){
              word++;
          }
      }
      System.out.println("words: "+word);
    }
}
