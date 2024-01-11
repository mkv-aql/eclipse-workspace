package de.tuhh.diss.WS20;

//The Flower class extends the Plant class and overrides the water method
public class Flower extends Plant {
 private String color;
 private boolean isBlooming;

 public Flower(String name, int size, String color) {
     super(name, size);
     this.color = color;
     this.isBlooming = false;
 }

 @Override
 public int water() {
     // The flower grows twice as fast as a regular plant, when it is watered
     setSize(getSize() + 2);
     return getSize();
 }
}
