import java.util.Scanner;

public class Student {
    String name;
    int rollNumber;
    int mark;

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + mark);
        System.out.println("Grade: " + this.calculateGrade(mark));
    }
    public char calculateGrade(int mark) {
        if (mark >= 90) {
            return 'A'; 
        } else if (mark >= 80) {
            return 'B';
        } else if (mark >= 70) {
            return 'C';
        } else if (mark >= 60) {
            return 'D';
        } else if (mark >= 50) {
            return 'E';
        } else {
            return 'F';
        }
    }
}

public class program1 {
    public static void main(String[] args) {
        Student studentObj = new Student();
        studentObj.rollNumber = 91;
        studentObj.name = "Praveen";
        studentObj.mark = 85;
        studentObj.displayDetails();
    }
}