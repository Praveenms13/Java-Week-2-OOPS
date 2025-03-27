import java.util.*;

class Course {
    String name;
    List<Student> students = new ArrayList<>();

    Course(String name) {
        this.name = name;
    }

    void enrollStudent(Student s) {
        students.add(s);
    }

    void showStudents() {
        System.out.println("Course: " + name);
        for (Student s : students)
            System.out.println(s.name);
    }
}

class Student {
    String name;
    List<Course> courses = new ArrayList<>();

    Student(String name) {
        this.name = name;
    }

    void enroll(Course c) {
        courses.add(c);
        c.enrollStudent(this);
    }

    void showCourses() {
        System.out.println(name + "'s courses:");
        for (Course c : courses)
            System.out.println(c.name);
    }
}

class School {
    String name;
    List<Student> students = new ArrayList<>();

    School(String name) {
        this.name = name;
    }

    void addStudent(Student s) {
        students.add(s);
    }
}
