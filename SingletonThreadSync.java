public class SingletonThreadSync {

    public static void main(String[] args) {
        
        // Start a new thread to generate the Singleton object
        Thread singletonGeneratorThread = new Thread(() -> {
            SingletonObject singleton = SingletonObject.getInstance();
        });
        singletonGeneratorThread.start();

        // Create three reader threads
        Thread readerThread1 = new Thread(() -> {
            SingletonObject singleton = SingletonObject.getInstance();
            synchronized (singleton) {
                System.out.println("Thread 1 is reading the Singleton object");
                // Perform some operation on the Singleton object here
            }
        });

        Thread readerThread2 = new Thread(() -> {
            SingletonObject singleton = SingletonObject.getInstance();
            synchronized (singleton) {
                System.out.println("Thread 2 is reading the Singleton object");
                // Perform some operation on the Singleton object here
            }
        });

        Thread readerThread3 = new Thread(() -> {
            SingletonObject singleton = SingletonObject.getInstance();
            synchronized (singleton) {
                System.out.println("Thread 3 is reading the Singleton object");
                // Perform some operation on the Singleton object here
            }
        });

        // Start the reader threads
        readerThread1.start();
        readerThread2.start();
        readerThread3.start();
    }
}

class SingletonObject {
    // This is the Singleton object
    private static SingletonObject instance;

    private SingletonObject() {
        // Private constructor to prevent direct instantiation
    }

    public static SingletonObject getInstance() {
        if (instance == null) {
            instance = new SingletonObject();
        }
        return instance;
    }
}

