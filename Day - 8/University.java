class Student {
    private static String universityName = "Global University";
    private static int totalStudents = 0;
    private final int rollNumber;
    private String name;
    private String grade;

    public Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    public void displayDetails() {
        if (this instanceof Student) {
            System.out.println("University: " + universityName);
            System.out.println("Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Grade: " + grade);
        }
    }

    public void updateGrade(String newGrade) {
        if (this instanceof Student) {
            this.grade = newGrade;
        }
    }
}

class EngineeringStudent extends Student {
    public EngineeringStudent(String name, int rollNumber, String grade) {
        super(name, rollNumber, grade);
    }
}

public class University {
    public static void main(String[] args) {
        Student s1 = new Student("John", 101, "A");
        EngineeringStudent s2 = new EngineeringStudent("Alice", 102, "B");

        s1.displayDetails();
        s2.displayDetails();

        s2.updateGrade("A+");

        System.out.println("\nAfter grade update:\n");
        s2.displayDetails();

        Student.displayTotalStudents();

        System.out.println("s1 is instance of Student: " + (s1 instanceof Student));
        System.out.println("s2 is instance of EngineeringStudent: " + (s2 instanceof EngineeringStudent));
    }
}
