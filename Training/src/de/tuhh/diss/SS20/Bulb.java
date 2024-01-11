package de.tuhh.diss.SS20;

public class Bulb extends Lamp {
    private LightingScene scene;

    @Override
    public boolean setScene(LightingScene scene) {
        this.scene = scene;
        return true;
    }
}
