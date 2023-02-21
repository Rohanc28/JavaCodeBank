
import java.util.*; 
public class ChangeStringCase
{
   public static void main(String args[])
   {
		Scanner sc= new Scanner(System.in);
		String str="";
		
		System.out.print("Enter any string: ");
		str=sc.nextLine();

		String lowerCaseString="",upperCaseString="";

		lowerCaseString= str.toLowerCase();  
		upperCaseString= str.toUpperCase();  
		System.out.println("Original g: "+str);
		System.out.println("Low: "+lowerCaseString);
		System.out.println("Up: "+upperCaseString);   
   }
}
