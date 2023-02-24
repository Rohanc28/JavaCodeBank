package Java_Program;
import java.io.FileWriter;
import java.io.IOException;

public class CharStreamWrite {

	public static void main(String[] args) {
		String fileDir="C:\\Users\\rchaturvedi\\eclipse-workspace\\Java_Program_1\\src\\Java_Program\\filename.txt";
		String content = "Char Stream Write Succesfull :)";

        try {
            FileWriter writer = new FileWriter(fileDir);
            writer.write(content);
            writer.close();
            System.out.println("Success");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }

}
