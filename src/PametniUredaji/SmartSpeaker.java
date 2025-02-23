package PametniUredaji;

public class SmartSpeaker extends SmartDevice {

    private String glazba;
    private double glasnoca;
    private boolean upaljeno;

    public SmartSpeaker(String firmwareVersion) {
        super(firmwareVersion);
    }

    public void testGlasnoca(double glasnoca) {
        this.glasnoca = glasnoca;
    }

    public void remoteControl(String glazba) {
        this.glazba = glazba;
        performAction();
    }

    public void performAction() {
        if (glazba.equalsIgnoreCase("pusti")) {
            upaljeno = true;
        } else if (glazba.equalsIgnoreCase("prekini")) {
            upaljeno = false;
        } else {
            System.out.println("Nepoznata komanda: " + glazba);
        }
    }

    @Override
    public void displayStatus() {
        // Display current state and volume level
        System.out.println("Trenutno stanje glazbe je: " + (upaljeno ? "UPALJENA" : "UGAŠENA"));
        System.out.println("Trenutna glasnoća je: " + glasnoca);
    }
}
