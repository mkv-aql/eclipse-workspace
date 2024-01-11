package de.tuhh.diss.SS22;

import java.util.Arrays;
import java.util.Comparator;

public abstract class Media implements Comparable {
    protected String title;
    private boolean available;

    Media(String title) {
        this.title = title;
        this.available = true;
    }

    public void toggleAvailability() {
        this.available = !this.available;
    }

    abstract String getInfo();

    @Override
    public int compareTo(Object other) {
        if (other instanceof Media) {
            return this.title.compareTo(((Media) other).title);
        }
        return -1;
    }
    
    public String getTitle() {
        return this.title;
    }
}
