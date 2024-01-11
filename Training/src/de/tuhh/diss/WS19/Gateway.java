package de.tuhh.diss.WS19;

import de.tuhh.diss.io.SimpleIO;

public class Gateway {
    private static final int MAX_BULBS = 10;
    private Bulb[] bulbs = new Bulb[MAX_BULBS];

    public boolean addBulb(Bulb bulb) {
        for (int i = 0; i < MAX_BULBS; i++) {
            if (bulbs[i] == null) {
                bulbs[i] = bulb;
                return true;
            }
        }
        return false;
    }

    public void lightUp() {
        for (Bulb bulb : bulbs) {
            if (bulb != null) {
                bulb.toggleStatus();
                SimpleIO.println("ON");
            }
            else {
            	SimpleIO.println("OFF");
            }
        }
    }
}