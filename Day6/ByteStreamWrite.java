package Java_Program;
import java.io.FileOutputStream;
import java.io.IOException;
public class ByteStreamWrite {
	public static void main(String[] args) {
	    String writeStr="Lorem ipsum dolor sit amet. Sit sequi debitis aut quae quia qui magni incidunt est assumenda asperiores hic inventore unde qui dolorem amet.";
	    String fileDir="C:\\Users\\rchaturvedi\\eclipse-workspace\\Java_Program_1\\src\\Java_Program\\filename.txt";
	    FileOutputStream FileOutput = null;
	    try{
	        FileOutput=new FileOutputStream(fileDir);
	        byte[] bytes=writeStr.getBytes();
	        FileOutput.write(bytes);
	        System.out.print("Done");
	    }catch (IOException ioexcp) {
	        ioexcp.printStackTrace();
	    }finally {
	        if(FileOutput != null) {
	            try {
					FileOutput.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
	        }
	    }
	}
}
