interface MedicalRecord {
    void addRecord(String record);

    String viewRecords();
}

abstract class Patient {
    private String patientId;
    private String name;
    private int age;
    private String medicalHistory = "";

    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public abstract double calculateBill();

    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    protected void appendToHistory(String record) {
        medicalHistory += record + "; ";
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }
}

class InPatient extends Patient implements MedicalRecord {
    private int daysAdmitted;
    private double roomCharge;

    public InPatient(String id, String name, int age, int days, double charge) {
        super(id, name, age);
        this.daysAdmitted = days;
        this.roomCharge = charge;
    }

    @Override
    public double calculateBill() {
        return daysAdmitted * roomCharge + 1000;
    }

    @Override
    public void addRecord(String record) {
        appendToHistory(record);
    }

    @Override
    public String viewRecords() {
        return getMedicalHistory();
    }
}

class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;

    public OutPatient(String id, String name, int age, double fee) {
        super(id, name, age);
        this.consultationFee = fee;
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }

    @Override
    public void addRecord(String record) {
        appendToHistory(record);
    }

    @Override
    public String viewRecords() {
        return getMedicalHistory();
    }
}

public class HospitalSystem {
    public static void main(String[] args) {
        Patient[] patients = {
                new InPatient("P001", "Raj", 45, 3, 1500),
                new OutPatient("P002", "Sara", 30, 500)
        };

        for (Patient p : patients) {
            p.getPatientDetails();
            if (p instanceof MedicalRecord) {
                MedicalRecord m = (MedicalRecord) p;
                m.addRecord("Checkup Complete");
                System.out.println("Medical History: " + m.viewRecords());
            }

            System.out.println("Bill: " + p.calculateBill());
            System.out.println("-----------------------");
        }
    }
}
