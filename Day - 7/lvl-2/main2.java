import java.util.Scanner;

class Course {
    private String courseName = "Dettol";
    private int duration = 6;
    private int fee = 10000;
    static String instituteName = "Vedanta";
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Fee: " + fee);
        System.out.println("Course Duration: " + duration);
        System.out.println("Course Institute Name: " + instituteName);
    }
    public void updateInstituteName(String instituteName) {
        this.instituteName = instituteName;
    }
}

public class main2 {
    public static void main(String[] args) {
        Course courseObj = new Course();
        courseObj.displayCourseDetails();
        System.out.println();
        System.out.println("After Updating ...");
        courseObj.updateInstituteName("Praveen");
        courseObj.displayCourseDetails();
    } 
}
