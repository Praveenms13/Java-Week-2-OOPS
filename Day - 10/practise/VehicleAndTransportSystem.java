
class Vehicle {
    protected int maxSpeed;
    protected String fuelType;

    public Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    public void displayDetails() {
        System.out.println("");
    }
}

class Car extends Vehicle {
    private int seatCapacity = 0;

    public Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    public void displayDetails() {
        System.out.println("------ Car Sub Class Starts ------");
        System.out.println("Max Speed: " + maxSpeed);
        System.out.println("Fuel type: " + fuelType);
        System.out.println("Maximum Seat Capacity: " + seatCapacity);
        System.out.println("------ Car Sub Class ends ------");
    }
}

class Truck extends Vehicle {
    private int loadCapacity = 0;

    public Truck(int maxSpeed, String fuelType, int loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    public void displayDetails() {
        System.out.println("------ Truck Sub Class Starts ------");
        System.out.println("Max Speed: " + maxSpeed);
        System.out.println("Fuel type: " + fuelType);
        System.out.println("Maximum Load Capacity: " + loadCapacity);
        System.out.println("------ Truck Sub Class ends ------");
    }
}

class MotorCycle extends Vehicle {
    private int seatCapacity = 0;
    public MotorCycle(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    public void displayDetails() {
        System.out.println("------ MotorCycle Sub Class Starts ------");
        System.out.println("Max Speed: " + maxSpeed);
        System.out.println("Fuel type: " + fuelType);
        System.out.println("Seat Capacity: " + seatCapacity);
        System.out.println("------ MotorCycle Sub Class ends ------");
    }
}

public class VehicleAndTransportSystem {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[3];

        vehicles[0] = new Car(140, "Petrol", 7);
        vehicles[1] = new MotorCycle(180, "Petrol", 2);
        vehicles[2] = new Truck(110, "Diesel", 3);

        vehicles[0].displayDetails();
        vehicles[1].displayDetails();
        vehicles[2].displayDetails();
    }
}
