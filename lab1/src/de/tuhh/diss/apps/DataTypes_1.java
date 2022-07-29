package de.tuhh.diss.apps;

import de.tuhh.diss.io.SimpleIO;

public class DataTypes_1 {
    
    public static void main(String[] args) {
        case1();
        case2();
        case3();
        case4();
    }
    
    public static void case1() {
        double a = 3 / 2;
        double b = 3 / 2.0;
        double c = 3.0 / 2;
        
        SimpleIO.println("a = "+ a +", b = "+ b + ", c = "+ c);
    }

    public static void case2() {
        double a = 6 / 4 / 2; //The result will be 0, because the calculation will treated as int
        double b = 6 / 4 / 2.0; //Result will be 0.5, because calculation of 6 and 4 will be in int (6/4 = 1), but 2.0 will be treated as double or float (1/2.0 = 0.5)
        double c = 6.0 / 4 / 2; //Result will be 0.75, because 6.0 is treated as a float or double (6.0/4 = 1.5), then 1.5/2 = 0.75
        
        SimpleIO.println("a = "+ a +", b = "+ b + ", c = "+ c);
    }

    public static void case3() {
        int    x = 2147483647 * 2;   // 2147483647 == 2^31-1
        short  y = (short)(32767 * 2);
        
        SimpleIO.println("x = "+ x +", y = "+ y);
    }

    public static void case4() {
        double  x = 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1; 
        //Due to the nature of floating point arithmetics, with a limit of 64 bit, it will be rounded up somewhere
        //and will stack up to an inaccurate summation
        boolean b = x == 0.9;
        
        SimpleIO.println("x = "+ x +", b = "+ b);
    }
}
