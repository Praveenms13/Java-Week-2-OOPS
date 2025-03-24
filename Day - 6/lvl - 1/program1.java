import java.util.Scanner;

public class Employee {
    String name = "Praveen";
    int id = 91;
    int salary = 50000;
}

public class program1 {
    public static void main(String[] args) {
        Employee employeeObj = new Employee();
        System.out.println("Employee Id: " + employeeObj.id);
        System.out.println("Employee Name: " + employeeObj.name);
        System.out.println("Employee Salary: " + employeeObj.salary);
    }
}