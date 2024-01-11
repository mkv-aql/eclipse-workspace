package de.tuhh.diss.SS20;

public class Task_4 {

	public static void main(String[] args) {
        // Initialize some lamps
        Bulb bulb = new Bulb();
        bulb.setBrightness(0.5);

        LedStrip ledStrip = new LedStrip();
        ledStrip.setBrightness(0.8);

        // Initialize some lighting scenes
        LightingScene scene1 = new LightingScene(); // You'd have to fill in some details here
        LightingScene scene2 = new LightingScene(); // And here

        // Set the scenes for the lamps
        bulb.setScene(scene1);
        ledStrip.setScene(scene2);

        // Create a lighting central and add the lamps
        LightingCentral lightingCentral = new LightingCentral();
        lightingCentral.addLamp(bulb);
        lightingCentral.addLamp(ledStrip);

        // Add the scenes to the lighting central
        lightingCentral.addScene(scene1);
        lightingCentral.addScene(scene2);
    }

}
