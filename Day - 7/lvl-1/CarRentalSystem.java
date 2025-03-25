import java.util.Scanner;

class CarRentalSystemClass {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private int rentForADay = 1000;
    CarRentalSystemClass () {
        this.customerName = "Praveen";
        this.carModel = "Toyota";
        this.rentalDays = 30;
    }
    public int getGuestName() {
        return this.rentForADay * this.rentalDays;
    }
}

public class CarRentalSystem {
    public static void main (String args[]){
        CarRentalSystemClass carRentalSystemObj = new CarRentalSystemClass();
        System.out.println(carRentalSystemObj.getGuestName());
    } 
}