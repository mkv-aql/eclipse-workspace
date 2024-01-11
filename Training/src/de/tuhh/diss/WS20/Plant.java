package de.tuhh.diss.WS20;

//The Plant class is abstract because you can't create an object of type Plant
public abstract class Plant {
 private String name;
 private int size;

 public Plant(String name, int size) {
     this.name = name;
     this.setSize(size);
 }

 public void cut() {
     setSize(getSize() - 1);
 }

 public int water() {
     setSize(getSize() + 1);
     return getSize();
 }

public int getSize() {
	return size;
}

public void setSize(double d) {
	this.size = (int) d;
}
}
