public class TrafficLight {
    String color;
    int duration; // in seconds

    TrafficLight(String color, int duration) {
        this.color = color;
        this.duration = duration;
    }

    void changeColor(String newColor, int newDuration) {
        this.color = newColor;
        this.duration = newDuration;
    }

    boolean isRedOrGreen() {
        return color.equalsIgnoreCase("red") || color.equalsIgnoreCase("green");
    }

    public static void main(String[] args) {
        TrafficLight t = new TrafficLight("Red", 30);
        System.out.println("Current: " + t.color + ", isRedOrGreen: " + t.isRedOrGreen());
        t.changeColor("Yellow", 5);
        System.out.println("Changed to: " + t.color);
    }
}
