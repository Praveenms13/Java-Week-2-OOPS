import java.util.*;

class Course {
    String name;
    Professor professor;

    Course(String name) {
        this.name = name;
    }

    void assignProfessor(Professor p) {
        this.professor = p;
        System.out.println(p.name + " assigned to course " + name);
    }
}

class Professor {
    String name;

    Professor(String name) {
        this.name = name;
    }
}

class Student {
    String name;
    List<Course> courses = new ArrayList<>();

    Student(String name) {
        this.name = name;
    }

    void enrollCourse(Course c) {
        courses.add(c);
        System.out.println(name + " enrolled in " + c.name);
    }
}
