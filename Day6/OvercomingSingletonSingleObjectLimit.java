package Java_Program;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;

public class OvercomingSingletonSingleObjectLimit {
    public static class Singleton implements Serializable {

        private static final long serialVersionUID = 1L;
        private static Singleton instance;

        private Singleton() {// to prevent direct instantiation
        	System.out.println("No direct instantiation allowed");
           
        }

        public static Singleton getInstance() {
            if (instance == null) {
                instance = readSingletonFromFile();
                if (instance == null) {
                    instance = new Singleton();
                }
            }
            return instance;
        }

        private static Singleton readSingletonFromFile() {
            Singleton singleton = null;
            try {
                FileInputStream fileIn = new FileInputStream("singleton.ser");
                ObjectInputStream in = new ObjectInputStream(fileIn);
                singleton = (Singleton) in.readObject();
                in.close();
                fileIn.close();
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
            return singleton;
        }

        public void doSomething() {
            System.out.print("All good :)");
        }

        public void writeSingletonToFile() {
            try {
                FileOutputStream fileOut = new FileOutputStream("singleton.ser");
                ObjectOutputStream out = new ObjectOutputStream(fileOut);
                out.writeObject(instance);
                out.close();
                fileOut.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        private Object readResolve() throws ObjectStreamException {
            return instance;
        }
    }

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.doSomething();
        singleton.writeSingletonToFile();
    }
}
