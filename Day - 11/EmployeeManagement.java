import java.util.ArrayList;
import java.util.List;

interface Department {
    void assignDepartment();
    String getDepartmentDetails();
}
abstract class Employee {
    private int employeeId;
    private String name;
    private int baseSalary;
    public Employee(int employeeId, String name, int baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }
    public abstract void calculateSalary();
    public void displayDetails() {
        System.out.println("------- From Main Class -------");
        System.out.println("Employee Id: " + employeeId);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Base Salary: " + baseSalary);
    }
    public int getBaseSalary() {
        return baseSalary;
    }
    public String getName() {
        return this.name;
    }
    public int getEmployeeId() {
        return this.employeeId;
    }
    public void setBaseSalary(int baseSalary) {
        if (baseSalary < 0) {
            throw new IllegalArgumentException("Base salary cannot be negative.");
        } else { 
            this.baseSalary = baseSalary;
        }
    }
}

class FullTimeEmployee extends Employee implements Department {
    private final int bonus;
    private String departmentName;
    public FullTimeEmployee(int employeeId, String name, int baseSalary, int bonus) {
        super(employeeId, name, baseSalary);
        this.bonus = bonus;
    }
    @Override
    public void calculateSalary() {
        int totalSalary = getBaseSalary() + bonus;
        System.out.println("Full-Time Employee Salary: " + totalSalary);
    }
    @Override
    public void assignDepartment() {
        this.departmentName = "Finance"; 
    }
    @Override
    public String getDepartmentDetails() {
        return "Department: " + departmentName;
    }
}

class PartTimeEmployee extends Employee implements Department {
    private int hoursWorked;
    private int hourlyRate;
    private String departmentName;
    public PartTimeEmployee(int employeeId, String name, int baseSalary, int hoursWorked, int hourlyRate) {
        super(employeeId, name, baseSalary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }
    @Override
    public void calculateSalary() {
        int totalSalary = hoursWorked * hourlyRate;
        System.out.println("Part-Time Employee Salary: " + totalSalary);
    }
    @Override
    public void assignDepartment() {
        this.departmentName = "Intern"; 
    }
    @Override
    public String getDepartmentDetails() {
        return "Department: " + departmentName;
    }
}


public class EmployeeManagement {
    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmployeeObj = new FullTimeEmployee(10, "Praveen", 10000, 100);
        PartTimeEmployee partTimeEmployeeObj = new PartTimeEmployee(10, "Praveen Part Time", 5000, 25, 50);
        fullTimeEmployeeObj.assignDepartment();
        partTimeEmployeeObj.assignDepartment();
        
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(fullTimeEmployeeObj);
        employeeList.add(partTimeEmployeeObj);
        
        for (Employee emp : employeeList) {
            emp.displayDetails();
            emp.calculateSalary();
            if (emp instanceof Department) {
                System.out.println(((Department)emp).getDepartmentDetails());
            }
            System.out.println("-------------------------");
        };
    }
}
