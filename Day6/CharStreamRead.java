package Java_Program;
import java.io.FileReader;
import java.io.IOException;

public class CharStreamRead {

	public static void main(String[] args) {
		String fileDir="C:\\Users\\rchaturvedi\\eclipse-workspace\\Java_Program_1\\src\\Java_Program\\filename.txt";
		     
	        try (FileReader reader = new FileReader(fileDir)) {
	            int character;
	            StringBuilder fileContent = new StringBuilder();
	            while ((character = reader.read()) != -1) {
	                fileContent.append((char) character);
	            }

	            System.out.println(fileContent.toString());
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	}

}
