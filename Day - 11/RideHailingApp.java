interface GPS {
    String getCurrentLocation();

    void updateLocation(String location);
}

abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;
    private String location;

    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public abstract double calculateFare(double distance);

    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Driver: " + driverName);
        System.out.println("Rate per Km: " + ratePerKm);
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    protected void setLocation(String location) {
        this.location = location;
    }

    protected String getLocation() {
        return location;
    }
}

class RideCar extends Vehicle implements GPS {
    public RideCar(String id, String driver, double rate) {
        super(id, driver, rate);
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance + 50;
    }

    @Override
    public String getCurrentLocation() {
        return getLocation();
    }

    @Override
    public void updateLocation(String location) {
        setLocation(location);
    }
}

class RideBike extends Vehicle implements GPS {
    public RideBike(String id, String driver, double rate) {
        super(id, driver, rate);
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance;
    }

    @Override
    public String getCurrentLocation() {
        return getLocation();
    }

    @Override
    public void updateLocation(String location) {
        setLocation(location);
    }
}

class RideAuto extends Vehicle implements GPS {
    public RideAuto(String id, String driver, double rate) {
        super(id, driver, rate);
    }

    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance + 20;
    }

    @Override
    public String getCurrentLocation() {
        return getLocation();
    }

    @Override
    public void updateLocation(String location) {
        setLocation(location);
    }
}

public class RideHailingApp {
    public static void main(String[] args) {
        Vehicle[] rides = {
                new RideCar("V001", "John", 15),
                new RideBike("V002", "Mike", 8),
                new RideAuto("V003", "Raj", 10)
        };

        for (Vehicle v : rides) {
            v.getVehicleDetails();
            if (v instanceof GPS) {
                GPS gps = (GPS) v;
                gps.updateLocation("Downtown");
                System.out.println("Current Location: " + gps.getCurrentLocation());
            }

            System.out.println("Fare for 10km: " + v.calculateFare(10));
            System.out.println("------------------------");
        }
    }
}
