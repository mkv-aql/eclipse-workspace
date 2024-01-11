package de.tuhh.diss.WS20;

public class Coffee extends Drink {
 private static final int[] STRENGTH = {2, 35, 55, 133};
 private int strength;

 public Coffee(int amount, int strength) {
 super(amount);
 this.strength = strength;
 }

 public void serve(Person p) {
 super.serve(p);
 p.addCaffeine(amount * STRENGTH[strength] / 100);
 }
 }
