import java.util.*;

class Doctor {
    String name;

    Doctor(String name) {
        this.name = name;
    }

    void consult(Patient p) {
        System.out.println("Dr. " + name + " consulted patient " + p.name);
        p.addDoctor(this);
    }
}

class Patient {
    String name;
    List<Doctor> doctors = new ArrayList<>();

    Patient(String name) {
        this.name = name;
    }

    void addDoctor(Doctor d) {
        if (!doctors.contains(d)) doctors.add(d);
    }

    void showDoctors() {
        System.out.println(name + " consulted with:");
        for (Doctor d : doctors) System.out.println("Dr. " + d.name);
    }
}

class Hospital {
    List<Doctor> doctors = new ArrayList<>();
    List<Patient> patients = new ArrayList<>();

    void addDoctor(Doctor d) {
        doctors.add(d);
    }

    void addPatient(Patient p) {
        patients.add(p);
    }
}
