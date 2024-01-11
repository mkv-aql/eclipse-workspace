package de.tuhh.diss.apps;

import de.tuhh.diss.io.SimpleIO;

public class Data_Types_1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		case1();
		case2();
		

	}
	
	public static void case1() {
		double a = 3/2; //Gets calculated as an int, must put decimal numbers for double
		double b = 3.0/2; //Gets calculated as a double
		double c = 4.7/3.1; //Gets calculated as a double
		
		System.out.println("a = " +a +" b = " +b +" c = " +c);
		SimpleIO.println("a = " +a +" b = " +b +" c = " +c);
		
	}
	
	public static void case2() {
		double d = 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1;
		System.out.println(d); //Will not print 0.9, because of 64 bit limit calculation
		
		boolean x = d == 0.9; //d does not equal 0.9, therefor "false" declared to x
		SimpleIO.println(x);
		
		int e = 5;
		boolean y = (e == 5);
		SimpleIO.print(y);
	}

}
