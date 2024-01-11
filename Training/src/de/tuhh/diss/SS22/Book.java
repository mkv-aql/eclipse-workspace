package de.tuhh.diss.SS22;

import java.util.Arrays;
import java.util.Comparator;

public class Book extends Media {
    private String author;
    private int numberOfPages;

    Book(String title, String author, int numberOfPages) {
        super(title);
        this.author = author;
        this.numberOfPages = numberOfPages;
    }

    @Override
    String getInfo() {
        return "Title: " + super.title + ", Author: " + this.author + ", Pages: " + this.numberOfPages;
    }
}