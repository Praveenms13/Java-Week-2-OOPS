import java.util.Scanner;

class Vehicle {
    private String ownerName = "Praveen";
    private String vehicleType = "Toyota";
    static int registrationFee = 100;
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + this.ownerName);
        System.out.println("Vehicle Type: " + this.vehicleType);
        System.out.println("Vehicle Duration: " + this.registrationFee);
    }
    public void updateRegistrationFee(int registrationFee) {
        this.registrationFee = registrationFee;
    }
}

public class main3 {
    public static void main(String[] args) {
        Vehicle VehicleObj = new Vehicle();
        VehicleObj.displayVehicleDetails();
        System.out.println();
        System.out.println("After Updating ...");
        VehicleObj.updateRegistrationFee(200);
        VehicleObj.displayVehicleDetails();
    } 
}
