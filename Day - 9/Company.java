import java.util.*;

class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    void show() {
        System.out.println("Employee: " + name);
    }
}

class Department {
    String name;
    List<Employee> employees = new ArrayList<>();

    Department(String name) {
        this.name = name;
    }

    void addEmployee(Employee e) {
        employees.add(e);
    }

    void showEmployees() {
        System.out.println("Department: " + name);
        for (Employee e : employees)
            e.show();
    }
}

class Company {
    String name;
    List<Department> departments = new ArrayList<>();

    Company(String name) {
        this.name = name;
    }

    void addDepartment(Department d) {
        departments.add(d);
    }

    void showStructure() {
        System.out.println("Company: " + name);
        for (Department d : departments)
            d.showEmployees();
    }
}
