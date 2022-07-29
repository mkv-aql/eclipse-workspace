package de.tuhh.diss.apps;

import de.tuhh.diss.io.SimpleIO;

public class SumsToN_2 {
  public static final int N = 10;
  
  public static void main(String[] args) {
    int sum;
    for (int i = 0; i <= N; i++) {
      sum = getSumMToN(1, i);
      SimpleIO.println("Sum of " + 1 + ", ..., " + i + " is " + sum);
    }
  }
  
  public static int getSumMToN(int M, int N) {
    int sum = 0;
    for (int i = M; i <= N; i++) {
      sum += i;
    }
    return sum;
  }
}
