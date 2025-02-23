package PametniUredaji;

public abstract class SmartDevice implements RemoteControllable {
    private String firmwareVersion;

    public SmartDevice(String firmwareVersion) {
        this.firmwareVersion = firmwareVersion;
    }

    public void updateFirmware(String version) {
        this.firmwareVersion = version;
        System.out.println("Firmware ažuriran na verziju: " + version);
    }

    public abstract void performAction();
    public abstract void displayStatus();
}