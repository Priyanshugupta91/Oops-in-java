public class Cirlce {
    // CircleTest.java

    public static void main(String[] args) {
        // Create a Circle object with initial radius
        Circle circle = new Circle(7.0);

        // Display initial radius, area, and circumference
        System.out.println("Initial Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Circumference: " + circle.calculateCircumference());

        // Modify the radius
        circle.setRadius(10.0);

        // Display updated values
        System.out.println("\nUpdated Radius: " + circle.getRadius());
        System.out.println("Updated Area: " + circle.calculateArea());
        System.out.println("Updated Circumference: " + circle.calculateCircumference());
    }
}

// Circle.java
class Circle {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate circumference
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
}

    
