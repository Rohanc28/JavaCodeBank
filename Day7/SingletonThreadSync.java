public class SingletonThreadSync {

    public static void main(String[] args) {
        
        //  new thread to generate the Singleton object
        Thread singletonGeneratorThread = new Thread(() -> {
            SingletonObject singleton = SingletonObject.getInstance();
        });
        singletonGeneratorThread.start();

        // three reader threads
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
                
            }
        });

        // interviewer reader threads
        readerThread1.start();
        readerThread2.start();
        readerThread3.start();
    }
}

class SingletonObject {
    // Singleton object
    private static SingletonObject instance;

    private SingletonObject() {
        System.out.println("No direct instantiation allowed");
    }

    public static SingletonObject getInstance() {
        if (instance == null) {
            instance = new SingletonObject();
        }
        return instance;
    }
}
