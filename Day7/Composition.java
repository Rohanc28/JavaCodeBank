public class Car {
    private Engine engine;

    public Car() {
        this.engine = new Engine();
    }

    public void start() {
        this.engine.start();
    }
}

public class Engine {
    public void start() {
        System.out.println("Engine started");
    }

}

public class Composition {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
    }
}
