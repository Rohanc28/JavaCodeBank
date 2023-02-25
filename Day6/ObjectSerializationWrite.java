package Java_Program;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectSerializationWrite {
    public static void main(String[] args) {
        String fileDir = "C:\\Users\\rchaturvedi\\eclipse-workspace\\Java_Program_1\\src\\Java_Program\\objectfile.txt";
        MyObject newObject = new MyObject("Object");

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(fileDir))) {
            objectOutputStream.writeObject(newObject);
            System.out.println("Object written to file: " + newObject);
        } catch (IOException e) {
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
