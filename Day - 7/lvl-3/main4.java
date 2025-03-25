class Employee {
    public int employeeID = 101;
    protected String department = "Engineering";
    private double salary = 50000.0;

    public void setSalary(double newSalary) {
        if (newSalary >= 0) {
            salary = newSalary;
        } else {
            System.out.println("Invalid salary amount!");
        }
    }

    public double getSalary() {
        return salary;
    }
}

class Manager extends Employee {
    public void showDetails() {
        System.out.println("Manager Details:");
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
    }
}

public class main4 {
    public static void main(String[] args) {
        Employee emp = new Employee();
        System.out.println("Initial Salary: " + emp.getSalary());

        emp.setSalary(75000.0);
        System.out.println("Updated Salary: " + emp.getSalary());

        Manager mgr = new Manager();
        mgr.showDetails();
    }
}
