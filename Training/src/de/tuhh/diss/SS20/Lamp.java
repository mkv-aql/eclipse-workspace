package de.tuhh.diss.SS20;

public abstract class Lamp {
    private double brightness;
    private RgbLed rgbLed;

    public abstract boolean setScene(LightingScene scene);

    public double setBrightness(double brightness) {
        this.brightness = brightness;
        return this.brightness;
    }
}

