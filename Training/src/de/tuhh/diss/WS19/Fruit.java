package de.tuhh.diss.WS19;

import de.tuhh.diss.io.SimpleIO;

abstract public class Fruit {
 protected String name;

 public Fruit(String name) {
 this.name = name;
 }

 public void eat() {
 SimpleIO.println("eating " + name);
 }
 }
