class Patient {
    private static String hospitalName = "City Care Hospital";
    private static int totalPatients = 0;
    private final int patientID;
    private String name;
    private int age;
    private String ailment;

    public Patient(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    public static int getTotalPatients() {
        return totalPatients;
    }

    public void displayDetails() {
        if (this instanceof Patient) {
            System.out.println("Hospital Name: " + hospitalName);
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
        }
    }
}

class Inpatient extends Patient {
    public Inpatient(String name, int age, String ailment, int patientID) {
        super(name, age, ailment, patientID);
    }
}

public class HospitalSystem {
    public static void main(String[] args) {
        Patient p1 = new Patient("John Doe", 45, "Flu", 1001);
        Inpatient p2 = new Inpatient("Jane Smith", 30, "Appendicitis", 1002);

        p1.displayDetails();
        p2.displayDetails();

        System.out.println("Total Patients: " + Patient.getTotalPatients());

        System.out.println("p1 is instance of Patient: " + (p1 instanceof Patient));
        System.out.println("p2 is instance of Inpatient: " + (p2 instanceof Inpatient));
    }
}
