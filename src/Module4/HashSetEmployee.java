package Module4;


import java.util.HashSet;
import java.util.Set;

public class HashSetEmployee {

    public static void main(String[] args) {
        Set<Employee> employees = new HashSet<>();

        Employee e1 = new Employee("101", "Dev");
        Employee e2 = new Employee("102", "Preesha");
        Employee e3 = new Employee("101", "Dev");

        employees.add(e1);
        employees.add(e2);
        employees.add(e3);

        System.out.println("Employees in HashSet:");
        for (Employee e : employees) {
            System.out.println(e);
        }

        System.out.println("Total employees: " + employees.size());
    }
}