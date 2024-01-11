package de.tuhh.diss.WS19;

public class ColoredBulb extends Bulb {
    private Color status;
    private double lightIntensity;

    @Override
    public void toggleStatus() {
        // Toggle status
    }

    public void setLightIntensity(double intensity) {
        this.lightIntensity = intensity;
    }

    public void setColor(Color color) {
        this.status = color;
    }
}
