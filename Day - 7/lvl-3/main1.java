class Student {
    public int rollNumber = 91;
    private float cgpa = 6;
    protected String name = "Praveen";

    public void setCGPA(float cgpa) {
        this.cgpa = cgpa;
    }

    public float getCGPA() {
        return cgpa;
    }

    public void displayDetails() {
        System.err.println("Printing From within class ...");
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + cgpa);
        System.out.println("Roll Number: " + rollNumber);
    }
}

class PostgraduateStudent extends Student {
    public String getName() {
        return name;
    }
}

public class main1 {
    public static void main(String[] args) {
        Student studentObj = new Student();
        studentObj.displayDetails();
        System.out.println("From the Main, Calling PostgraduateStudent which returns the name (Protected Variable)");
        PostgraduateStudent postgraduateStudentObj = new PostgraduateStudent();
        System.out.println(postgraduateStudentObj.getName());
    }
}
