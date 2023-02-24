package Java_Program;
import java.io.*;
public class ByteStreamRead {

	public static void main(String[] args) {
		FileInputStream fileInput = null;
	      try {
	         fileInput = new FileInputStream("C:\\Users\\rchaturvedi\\eclipse-workspace\\Java_Program_1\\src\\Java_Program\\filename.txt");
	         int data;
	         while ((data = fileInput.read()) != -1) {
	            System.out.print((char) data);
	         }
	         fileInput.close();
	      } catch (IOException e) {
	         System.out.println("An error occurred: " + e.getMessage());
	         e.printStackTrace();
	      } finally {
	    	  
	      }
	   }

}
