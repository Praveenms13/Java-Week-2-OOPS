

class Employee {
    protected String name;
    protected int id;
    protected int salary;

    public Employee(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("");
    }
}

class Manager extends Employee {
    private int teamSize = 0;
    public Manager(String name, int id, int salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
        System.out.println("Salary: " + salary);
        System.out.println("Team Size: " + teamSize);
    }
}

class Developer extends Employee {
    private String programmingLanguage = "";
    public Developer(String name, int id, int salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
        System.out.println("Salary: " + salary);
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

class Intern extends Employee {
    private int internPeriod = 0;
    public Intern(String name, int id, int salary, int internPeriod) {
        super(name, id, salary);
        if (internPeriod <= 0) {
            System.out.println("intern period cannot be 0 or less than 0");
            System.exit(0);
        } 
        this.internPeriod = internPeriod;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
        System.out.println("Salary: " + salary);
        System.out.println("Intern Period: " + internPeriod);
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee manager = new Manager("Vibusha", 10, 50000, 100);
        Employee developer = new Developer("Praveen", 11, 40000, "Java");
        Employee intern = new Intern("Koushik", 13, 30000, 9);

        manager.displayDetails();
        developer.displayDetails();
        intern.displayDetails();
    }
}
