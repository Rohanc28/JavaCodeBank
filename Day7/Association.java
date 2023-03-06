package Java_Package;
import java.util.*;

public class Person {
    private String name;
    private int age;
    private Address address;

    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

}

public class Address {
    private String street;
    private String city;
    private String state;
    private int zipCode;

    public Address(String street, String city, String state, int zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

}

public class Association {
    public static void main(String[] args) {
        Address address = new Address("123 Main St", "Anytown", "CA", 12345);
        Person person = new Person("John", 30, address);

        System.out.println(person.getName() + " lives at " + person.getAddress().getStreet());
    }
}
