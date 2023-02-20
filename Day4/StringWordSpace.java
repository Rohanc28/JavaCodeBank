package Java_Program;
import java.util.*;
public class StringWordSpace {
    public static void main(String args[]) {
      Scanner s=new Scanner(System.in);
      String str=s.nextLine();
      int word=0;
      int space=0;
      boolean flag=false;
      if(str.charAt(0)!=' '){
          word=1;
          flag=true;
      }
      else if(str.charAt(0)==' '){
          space=1;
          flag=false;
      }
      for(int i=1;i<str.length();i++){
          if(str.charAt(i)==' '){
              space++;
              flag=false;
          }
          else if(str.charAt(i)!=' '&& (flag==false)){
              word++;
              flag=true;
          }
      }
      System.out.println("words: "+word+"\nSpaces: "+space);
    }
}
