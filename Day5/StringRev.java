package Java_Program;
import java.io.*;
public class StringRev {

    public static String rev(String s){
        if(s.length()>0){
            StringBuilder r= new StringBuilder();
            for(int i=s.length();i>0;i--){
                r.append(s.charAt(i-1));
                }
            return r.toString();
        }
        return s;
    }
	public static void main (String[] args) {
		String s=new String("reverse");
		System.out.println("Orginal String: "+s);
		//
		System.out.print("Reverse String: ");
		s=rev(s).toString();
		System.out.print(s);
	}
}

