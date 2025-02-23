package PametniUredaji;

public class SmartThermostat extends SmartDevice implements RemoteControllable {
    private String temperatura;
    private double temp;

    public SmartThermostat(String firmwareVersion) {
        super(firmwareVersion);
    }

    public void remoteControl(String temperatura) {
        this.temperatura = temperatura;
        performAction();
    }

    @Override
    public void performAction() {
        temp = Double.parseDouble(temperatura);
    }

    @Override
    public void displayStatus() {
        System.out.println("Trenutna temperatura je: " + temp);
    }
}
