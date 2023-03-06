class Car {
    private Engine engine;

    public Car() {
        this.engine = new Engine();
    }

    public void start() {
        this.engine.start();
    }

    // other methods
}

class Engine {
    public void start() {
        System.out.println("Engine started");
    }

    // other methods
}

public class CompositionExample {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
    }
}
