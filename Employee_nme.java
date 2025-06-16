
    import java.time.LocalDate;
import java.time.Period;

public class Employee_nme {
    String name;
    double salary;
    LocalDate hireDate;

    Employee_nme(String name, double salary, LocalDate hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    int yearsOfService() {
        return Period.between(hireDate, LocalDate.now()).getYears();
    }

    public static void main(String[] args) {
        Employee_nme e = new Employee_nme("Ankit", 60000, LocalDate.of(2020, 6, 15));
        System.out.println(e.name + " has " + e.yearsOfService() + " years of service.");
    }
}
    

