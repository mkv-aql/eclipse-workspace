package de.tuhh.diss.WS19;

public class WhiteBulb extends Bulb {
    private boolean status;

    @Override
    public void toggleStatus() {
        this.status = !this.status;
    }
}

