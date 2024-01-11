package de.tuhh.diss.SS19;

import de.tuhh.diss.io.SimpleIO;

public class A {
 private static int x = 0;

 public A() {
 ++x;
 }

 public void print() {
 print("A");
 }

 protected void print(String src) {
 SimpleIO.println(src +": "+ x);
 }

 
 }