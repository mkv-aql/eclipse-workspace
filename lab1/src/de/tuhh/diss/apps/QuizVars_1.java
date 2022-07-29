package de.tuhh.diss.apps;
import de.tuhh.diss.io.SimpleIO;

public class QuizVars_1 {
  public static void main(String[] args) {
    final int Y = 13; //Creates the variable Y constant, to protect from changes
    int x = 10;
    double d;
    d = x / Y;
    x /= Y;
    boolean b = x > 0; //x = 0.769, therefore it will be false
    x = 2 * 3 + 2 * 9 / 2; //x will be changed
    //Y = 1; //The program would not allow the Y change line to be written. 
    
    SimpleIO.println("b = " + b);
    SimpleIO.println("d = " + d);
    SimpleIO.println("x = " + x);
  }
}
