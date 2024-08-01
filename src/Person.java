class Address {
    String city;
    String state;

    public Address(String city, String state) {
        this.city = city;
        this.state = state;
    }

    public Address(Address another) {
        this.city = another.city;
        this.state = another.state;
    }
}

public class Person {
    private String name;
    private int age;
    private Address address;

    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = new Address(address); // Deep copy of Address
    }

    public Person(Person another) {
        this.name = another.name;
        this.age = another.age;
        this.address = new Address(another.address); // Deep copy of Address
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("City: " + address.city);
        System.out.println("State: " + address.state);
    }


    public static void main(String[] args) {
        Address address1 = new Address("New York", "NY");
        Person person1 = new Person("Alice", 30, address1);
        Person person2 = new Person(person1);

        person1.displayInfo();
        person2.displayInfo();
    }
}
