package de.tuhh.diss.SS19;

public class B extends A {
 private M m;

 public B(M m) {
 super();
 this.m = m;
 }

 public void print() {
 this.m.print();
 print("B");
 }
 }
