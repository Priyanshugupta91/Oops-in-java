
    import java.util.ArrayList;

public class Student {
    String name;
    String grade;
    ArrayList<String> courses;

    Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
        this.courses = new ArrayList<>();
    }

    void addCourse(String course) {
        courses.add(course);
    }

    void removeCourse(String course) {
        courses.remove(course);
    }

    void displayCourses() {
        System.out.println(name + "'s Courses: " + courses);
    }

    public static void main(String[] args) {
        Student s = new Student("Ankit", "A");
        s.addCourse("Math");
        s.addCourse("Science");
        s.removeCourse("Math");
        s.displayCourses();
    }
}    
