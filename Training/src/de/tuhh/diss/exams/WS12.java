package de.tuhh.diss.exams;

import de.tuhh.diss.io.SimpleIO;

public class WS12 {
	private static int a; 
	private static int test(int b, int c) {
		System.out.println("received b value: " +b);
		System.out.println("received c value: " +c);
		b = 2*b;
		c = b+c;
		a++;
		System.out.println("test c = " +c);
		
		return b;
	}
	public static void main(String[] args) {
		int b = 3;
		int c = 5;
		a = 0;
		SimpleIO.println("test();  " +test (c, b)); //Value of returned b
		SimpleIO.println("a = " +a); //a++ for global a already ran
		SimpleIO.println("c = " +c);
	}

}
