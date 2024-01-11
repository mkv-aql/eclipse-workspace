package de.tuhh.diss.WS20;

public class Drink {
 protected int amount;

 public Drink(int amount) {
 this.amount = amount;
 }

 public void serve(Person p) {
 p.addLiquid(amount);
 }
 }
