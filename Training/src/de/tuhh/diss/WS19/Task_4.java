package de.tuhh.diss.WS19;

public class Task_4 {

	public static void main(String[] args) {
        // Create some bulbs, in this case 3. 2 whites, 1 on and 1 off. 1 color, on.
        Bulb whiteBulb = new WhiteBulb();
        Bulb whiteBulb2 = new WhiteBulb();
        ColoredBulb coloredBulb = new ColoredBulb();
        coloredBulb.setColor(new Color(255, 0, 0)); // Set color to red
        //OR
        Color red = new Color(255,0,0);
        coloredBulb.setColor(red); // Set color to red
        coloredBulb.setLightIntensity(0.5); // Set intensity to 0.5

        // Create a gateway
        Gateway gateway = new Gateway();

        // Add bulbs to the gateway
        gateway.addBulb(whiteBulb);
        gateway.addBulb(whiteBulb2);
        gateway.addBulb(coloredBulb);

        // Light up all bulbs
        gateway.lightUp();
        
        
    }

}
