package de.tuhh.diss.apps;
import de.tuhh.diss.io.SimpleIO;


public class Mean_2 {
  public static void main(String[] args) {
    int[] a = new int[5];
    for (int i = 0; i < a.length; i++) {
      SimpleIO.println("Please enter value "+ (i+1));
      a[i] = SimpleIO.readInt();
    }

    double mean = 0;
    int N = 0;
    for (int i = 0; i < a.length; i++) {
      if (a[i] < 0) continue;
      mean += a[i];
      N++;
    }

    if (N > 0) {
      mean /= N;
    } else {
      mean = Double.NaN;
    }
    
    SimpleIO.println("Mean is "+ mean);
  }
}
