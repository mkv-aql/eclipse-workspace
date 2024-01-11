package de.tuhh.diss.WS19;

import de.tuhh.diss.io.SimpleIO;

public class Task_2b {

	public static void main(String[] args) {
		SimpleIO.println(fib(10));
		SimpleIO.println(fib(4));
		
		SimpleIO.println(fibSame(10));
		SimpleIO.println(fibSame(4));

	}
	
	
	public static int fib(int n) {
		int temp = 0;
		int fib0 = 0;
		int fib1 = 1;
		
		for (int i = 1; i < n; i++) {
			temp = fib1 + fib0;
			fib0 = fib1;
			fib1 = temp;
		}
		
		return temp;
	}
	
	public static int fibSame(int n) {
		int temp = 0;
		int fib0 = 0;
		int fib1 = 1;
		
		for (int i = 2; i <= n; i++) {
			temp = fib1 + fib0;
			fib0 = fib1;
			fib1 = temp;
		}
		
		return temp;
	}

}
