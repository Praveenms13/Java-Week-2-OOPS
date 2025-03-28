class Device {
    protected int deviceId;
    protected String status;

    public Device(int deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
        System.out.println("I am called ..");
    }

}

class Thermostat extends Device {
    private String temperatureSetting;
    public Thermostat(int deviceId, String status, String temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    public void displayStatus() {
        System.out.println("----- Displaying Device Data -----");
        System.out.println("Device Id: " + deviceId);
        System.out.println("Device Status: " + status);
        System.out.println("Temperature Setting: " + temperatureSetting);
        System.out.println("----- Ends -----");
    }
}

public class SmartHomeDevice {
    public static void main(String[] args) {
        Thermostat[] thermostats = new Thermostat[3];
        thermostats[0] = new Thermostat(10, "On", "25");
        thermostats[1] = new Thermostat(11, "On", "27");
        thermostats[2] = new Thermostat(12, "Off", "28");

        thermostats[0].displayStatus();
        thermostats[1].displayStatus();
        thermostats[2].displayStatus();
    }
}
