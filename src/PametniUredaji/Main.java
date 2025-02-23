package PametniUredaji;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SmartDevice smartThermostat = new SmartThermostat("1.1.1");
        SmartDevice smartLight = new SmartLight("1.1.2");
        SmartSpeaker smartSpeaker = new SmartSpeaker("1.2.2");

        Scanner sc = new Scanner(System.in);

        // Control the light
        System.out.println("---------------Upali ili ugasi svijetlo--------------");
        String upali = sc.nextLine().trim();
        smartLight.remoteControl(upali);
        smartLight.displayStatus();


        System.out.println("-------------Podesi temperaturu------------");
        String tempInput = sc.nextLine().trim();

        try {
            double temperature = Double.parseDouble(tempInput);
            smartThermostat.remoteControl(String.valueOf(temperature));
        } catch (NumberFormatException e) {
            System.out.println("Molim vas, unesite važeću temperaturu.");
        }
        smartThermostat.displayStatus();

        // Control the smart speaker
        System.out.println("------------Odaberi glazbu pusti ili prekini------------");
        String glazba = sc.nextLine().trim();
        smartSpeaker.remoteControl(glazba);
        smartSpeaker.displayStatus();

        // Set the volume
        System.out.println("------------Postavi glasnoću------------");
        try {
            double novaGlasnoca = Double.parseDouble(sc.nextLine().trim());
            smartSpeaker.testGlasnoca(novaGlasnoca);
            smartSpeaker.displayStatus();
        } catch (NumberFormatException e) {
            System.out.println("Molim vas, unesite važeću glasnoću.");
        }


        smartLight.updateFirmware("1.1.0");
        smartThermostat.updateFirmware("2.2.0");
        smartSpeaker.updateFirmware("3.1.0");


        sc.close();
    }
}