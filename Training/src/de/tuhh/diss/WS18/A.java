package de.tuhh.diss.WS18;

import de.tuhh.diss.io.SimpleIO;

public class A {
 private static int x = 0;
 private int y;

 public A() {
 y = ++x;
 }

 public void print() {
 print("A");
 }

 protected void print(String src) {
 SimpleIO.println(src +": "+ x +", "+ y);
 }
}