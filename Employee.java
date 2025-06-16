public class Employee {
    String name;
    String jobTitle;
    double salary;

    Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    void updateSalary(double newSalary) {
        this.salary = newSalary;
    }

    void display() {
        System.out.println("Name: " + name + ", Job Title: " + jobTitle + ", Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee e = new Employee("John", "Developer", 50000);
        e.display();
        e.updateSalary(60000);
        e.display();
    }
}