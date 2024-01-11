package de.tuhh.diss.SS22;

import java.util.Arrays;
import java.util.Comparator;

public class MusicAlbum extends Media {
    private String interpreter;
    private int numberOfSongs;

    MusicAlbum(String title, String interpreter, int numberOfSongs) {
        super(title);
        this.interpreter = interpreter;
        this.numberOfSongs = numberOfSongs;
    }

    @Override
    String getInfo() {
        return "Title: " + super.title + ", Interpreter: " + this.interpreter + ", Songs: " + this.numberOfSongs;
    }
}
