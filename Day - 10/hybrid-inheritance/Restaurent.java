interface worker {
    void performDuties();
}
class Person {
    protected String name;
    protected int id;
    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}
class Chef extends Person implements worker{
    private String speciality;
    public Chef(String name, int id, String speciality) {
        super(name, id);
        this.speciality = speciality;
    }
    @Override
    public void performDuties() {
        System.out.println("---------- Chef ----------");
        displayInfo();
        System.out.println("Specialty: " + speciality);
        System.out.println("Duties: Prepares dishes and manages the kitchen.");
        System.out.println();
    } 
}


class Waiter  extends Person implements worker{
    private String section;
    public Waiter(String name, int id, String section) {
        super(name, id);
        this.section = section;
    }
    @Override
    public void performDuties() {
        System.out.println("---------- Waiter ----------");
        displayInfo();
        System.out.println("Assigned Section: " + section);
        System.out.println("Duties: Takes orders and serves customers.");
        System.out.println();
    } 
}

public class Restaurent {
    public static void main (String args[]) {
        Chef chef = new Chef("Gordon Ramsay", 101, "Italian Cuisine");
        chef.performDuties();

        Waiter waiter = new Waiter("Alice Johnson", 202, "Outdoor Seating");
        waiter.performDuties();
    }
}
