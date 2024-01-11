package de.tuhh.diss.WS20;

public class Spirit extends Drink {
 private int alc;

 public Spirit(int amount, int alc) {
 super(amount);
 this.alc = alc;
 }

 public void serve(Person p) {
 super.serve(p);
 p.addAlc(amount * alc / 100);
 }
 }
