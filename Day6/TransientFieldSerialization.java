package Java_Program;
import java.io.*;
class TransientFieldClass implements Serializable{
	private int id;
	private transient String name;
	public TransientFieldClass(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
}
public class TransientFieldSerialization {
	
	 public static void main(String[] args) throws Exception {
	        TransientFieldClass obj = new TransientFieldClass(1, "John");
	        
	        // serialization of object and its field
	        FileOutputStream fileOut = new FileOutputStream("myobject.ser");
	        ObjectOutputStream out = new ObjectOutputStream(fileOut);
	        out.writeObject(obj);
	        out.close();
	        fileOut.close();
	        
	        // deserialize object from file 
	        FileInputStream fileIn = new FileInputStream("myobject.ser");
	        ObjectInputStream in = new ObjectInputStream(fileIn);
	        TransientFieldClass newObj = (TransientFieldClass) in.readObject();
	        in.close();
	        fileIn.close();
	        
	        //we find that the transient field contains default values
	        System.out.println("ID: " + newObj.getId());  
	        System.out.println("Name: " + newObj.getName());  
	        }
}
