import java.util.Scanner;

class Book {
    private String guestName;
    private String roomType;
    private int nights;
    HotelBooking () {
        this.guestName = "Sample Guest Name";
        this.roomType = "Sample Room Type";
        this.nights = 3;
    }
    HotelBooking (String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }
    public String getGuestName() {
        return this.guestName;
    }
    public String getRoomType() {
        return this.roomType;
    }
    public int getNights() {
        return this.nights;
    }
}

public class LibraryBookingSystem {
    public static void main (String args[]){
        HotelBooking hotelBookingObj = new HotelBooking();
        System.out.println(hotelBookingObj.getGuestName());
        System.out.println(hotelBookingObj.getRoomType());
        System.out.println(hotelBookingObj.getNights());
        HotelBooking hotelBookingObje = new HotelBooking("Praveen", "window type", 10);
        System.out.println(hotelBookingObje.getGuestName());
        System.out.println(hotelBookingObje.getRoomType());
        System.out.println(hotelBookingObje.getNights());
    } 
}