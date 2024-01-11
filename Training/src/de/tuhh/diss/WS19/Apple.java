package de.tuhh.diss.WS19;

import de.tuhh.diss.io.SimpleIO;

public class Apple extends Fruit {
 private static final String COLORS[] = {"red", "green"};
 private int color;

 public Apple(int color) {
 super("apple");
 if (color < 0 || color >= COLORS.length) {
 throw new IllegalArgumentException("invalid color (index out of bounds)");
 }
 this.color = color;
 }

 public void eat() {
 SimpleIO.print("it’s a "+ getColor() +" one, ");
 super.eat();
 }

 public String getColor() {
 return COLORS[color];
 }
 }
