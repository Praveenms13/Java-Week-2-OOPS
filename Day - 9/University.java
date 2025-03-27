import java.util.*;

class Faculty {
    String name;

    Faculty(String name) {
        this.name = name;
    }

    void show() {
        System.out.println("Faculty: " + name);
    }
}

class Department {
    String name;

    Department(String name) {
        this.name = name;
    }

    void show() {
        System.out.println("Department: " + name);
    }
}

class University {
    String name;
    List<Department> departments = new ArrayList<>();
    List<Faculty> faculties = new ArrayList<>();

    University(String name) {
        this.name = name;
    }

    void addDepartment(Department d) {
        departments.add(d);
    }

    void addFaculty(Faculty f) {
        faculties.add(f);
    }

    void showStructure() {
        System.out.println("University: " + name);
        for (Department d : departments)
            d.show();
        for (Faculty f : faculties)
            f.show();
    }
}
