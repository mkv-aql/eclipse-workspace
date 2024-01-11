package de.tuhh.diss.SS22;

import java.util.Arrays;
import java.util.Comparator;

public class Library {
    private Media[] media;

    Library(Media[] media) {
        this.media = media;
    }

    public void printMedia() {
        Arrays.sort(this.media, Comparator.comparing(Media::getTitle));
        for (Media m : this.media) {
            System.out.println(m.getInfo());
        }
    }
}