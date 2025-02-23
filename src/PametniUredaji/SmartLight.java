package PametniUredaji;

public class SmartLight  extends SmartDevice implements RemoteControllable {
    private String upaliSvijetlo;
    private boolean upaljeno;

    public SmartLight(String firmwareVersion) {
        super(firmwareVersion);
    }

    public void remoteControl(String upaliSvijetlo) {
        this.upaliSvijetlo = upaliSvijetlo;
        performAction();
    }

    public void performAction() {
        if (upaliSvijetlo.equalsIgnoreCase("upali")) {
            upaljeno = true;
            System.out.println("Svjetlo je upaljeno.");
        } else if (upaliSvijetlo.equalsIgnoreCase("ugasi")) {
            upaljeno = false;
            System.out.println("Svjetlo je ugašeno.");
        } else {
            System.out.println("Nepoznata komanda: " + upaliSvijetlo);
        }
    }


    public void displayStatus() {
        System.out.println("Trenutno stanje svijetla: " + (upaljeno ? "UPALJENO" : "UGAŠENO"));

    }


}
