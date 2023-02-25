package Java_Program;
import java.io.*;

import java.io.IOException;
import java.io.Serializable;

public class ObjectSerializationRead {
    public static void main(String[] args) {
    	String fileDir="C:\\Users\\rchaturvedi\\eclipse-workspace\\Java_Program_1\\src\\Java_Program\\objectfile.txt";
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileDir))) {
            MyObject obj = (MyObject) ois.readObject();
            System.out.println("Object read from file: " + obj);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
@SuppressWarnings("serial")
class MyObject implements Serializable {
    private String name;

    public MyObject(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "MyObject [name=" + name + "]";
    }
}
