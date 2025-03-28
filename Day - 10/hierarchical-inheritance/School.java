class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayRole() {
        System.out.println("I am a person in the school system.");
        System.out.println();
    }
}

class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    public void displayRole() {
        System.out.println("---------- Teacher ----------");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Teaches Subject: " + subject);
        System.out.println();
    }
}

class Student extends Person {
    private String grade;

    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    @Override
    public void displayRole() {
        System.out.println("---------- Student ----------");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println();
    }
}

class Staff extends Person {
    private String department;

    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    @Override
    public void displayRole() {
        System.out.println("---------- Staff ----------");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Works in Department: " + department);
        System.out.println();
    }
}

public class School {
    public static void main(String[] args) {
        Person person = new Person("Alex", 45);
        person.displayRole();

        Teacher teacher = new Teacher("Mr. John", 40, "Mathematics");
        teacher.displayRole();

        Student student = new Student("Emily", 16, "10th Grade");
        student.displayRole();

        Staff staff = new Staff("Sarah", 35, "Administration");
        staff.displayRole();
    }
}
