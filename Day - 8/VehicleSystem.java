class Vehicle {
    private static double registrationFee = 500.0;
    private final String registrationNumber;
    private String ownerName;
    private String vehicleType;

    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public void displayDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: $" + registrationFee);
        }
    }
}

class Car extends Vehicle {
    public Car(String ownerName, String vehicleType, String registrationNumber) {
        super(ownerName, vehicleType, registrationNumber);
    }
}

public class VehicleSystem {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("David", "Motorcycle", "MH12AB1234");
        Car v2 = new Car("Emma", "Sedan", "DL10XY9876");

        v1.displayDetails();
        v2.displayDetails();

        Vehicle.updateRegistrationFee(750.0);

        System.out.println("\nAfter updating registration fee:\n");

        v1.displayDetails();
        v2.displayDetails();

        System.out.println("v1 is instance of Vehicle: " + (v1 instanceof Vehicle));
        System.out.println("v2 is instance of Car: " + (v2 instanceof Car));
    }
}
