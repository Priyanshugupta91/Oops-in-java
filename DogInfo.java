

public class DogInfo {
    // DogTest.java

    public static void main(String[] args) {
        // Creating two Dog objects using constructor
        Dog dog1 = new Dog("Buddy", "Golden Retriever");
        Dog dog2 = new Dog("Max", "German Shepherd");

        // Modifying attributes using setter methods
        dog1.setName("Charlie");
        dog1.setBreed("Labrador");

        dog2.setName("Rocky");
        dog2.setBreed("Beagle");

        // Printing updated values
        System.out.println("Dog 1: Name = " + dog1.getName() + ", Breed = " + dog1.getBreed());
        System.out.println("Dog 2: Name = " + dog2.getName() + ", Breed = " + dog2.getBreed());
    }
}

// Dog.java
class Dog {
    private String name;
    private String breed;

    // Constructor
    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Setter for breed
    public void setBreed(String breed) {
        this.breed = breed;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for breed
    public String getBreed() {
        return breed;
    }
}



