package de.tuhh.diss.WS20;

import de.tuhh.diss.io.SimpleIO;

public class Person {
 private int liquid;
 private int caffeine;
 private int alc;

 void addLiquid(int liquid) { this.liquid += liquid; }
 void addCaffeine(int caffeine) { this.caffeine += caffeine; }
 void addAlc(int alc) { this.alc += alc; }
 void getStatus() {
 SimpleIO.println("I drank "+ liquid +"ml"
 + " with "+ caffeine +"mg caffeine"
 + " and "+ alc +"ml alcohol");
 }
}
