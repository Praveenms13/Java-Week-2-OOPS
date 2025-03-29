class Employee {
    private static String companyName = "TechCorp";
    private static int totalEmployees = 0;
    private final int id;
    private String name;
    private String designation;

    public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    public void displayDetails() {
        if (this instanceof Employee) {
            System.out.println("Company Name: " + companyName);
            System.out.println("Employee Name: " + name);
            System.out.println("Employee ID: " + id);
            System.out.println("Designation: " + designation);
        }
    }
}

class Manager extends Employee {
    public Manager(String name, int id, String designation) {
        super(name, id, designation);
    }
}

public class Company {
    public static void main(String[] args) {
        Employee e1 = new Employee("Alice", 101, "Developer");
        Manager e2 = new Manager("Bob", 102, "Team Lead");

        e1.displayDetails();
        e2.displayDetails();

        Employee.displayTotalEmployees();

        System.out.println("e1 is instance of Employee: " + (e1 instanceof Employee));
        System.out.println("e2 is instance of Manager: " + (e2 instanceof Manager));
    }
}
