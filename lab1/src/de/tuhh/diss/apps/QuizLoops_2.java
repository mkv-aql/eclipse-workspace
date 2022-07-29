package de.tuhh.diss.apps;
import de.tuhh.diss.io.SimpleIO;

public class QuizLoops_2 {
  public static void main(String[] args) {
    final int B = 10;
    int cnt = 0;
    for (int i = 0; i <= B; i++) {
      SimpleIO.println("i = " + i);
      for (int j = 0; j < i; j++) {
        SimpleIO.println("  j = " + j);
        cnt++;
      }
    }
    
    SimpleIO.println("cnt = " + cnt);
  }
}
