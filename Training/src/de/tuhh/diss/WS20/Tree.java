package de.tuhh.diss.WS20;

//The Tree class extends the Plant class and overrides the water method
public class Tree extends Plant {
 private int age;

 public Tree(String name, int size) {
     super(name, size);
     this.age = 0;
 }

 @Override
 public int water() {
     // The tree only grows half as fast as normal plants
     setSize(getSize() + 0.5);
     return getSize();
 }
}
