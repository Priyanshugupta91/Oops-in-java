public class PersonInfo{
    // PersonTest.java

    public static void main(String[] args) {
        // Creating two Person instances using constructor
        Person person1 = new Person("Alice", 25);
        Person person2 = new Person("Bob", 30);

        // Printing their attributes
        System.out.println("Person 1: Name = " + person1.getName() + ", Age = " + person1.getAge());
        System.out.println("Person 2: Name = " + person2.getName() + ", Age = " + person2.getAge());
    }
}

// Person.java
class Person {
    private final String name;
    private final int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }
}


    


