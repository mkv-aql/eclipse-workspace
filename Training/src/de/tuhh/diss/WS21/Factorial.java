package de.tuhh.diss.WS21;

import de.tuhh.diss.io.SimpleIO;

public class Factorial {

	public static void main(String[] args) {
		System.out.println(factorial(2));
		System.out.println(factorial2(5));
		System.out.println(factorialGPT(5));

	}
	
	public static double factorial(int i) {
		double sum = 1;
		double max = 2*i + 1;
		
		for (double j = max; j > 0; j-- ) {
			sum = sum*j;
		}
		
		return sum;
	}
	
	public static double factorial2(int i) {
		int max = i;
		int sum = 1;
		
		for(int j = max; j>0;j--) {
			sum = sum*j;
		}
		
		return sum;
	}
	
	public static long factorialGPT(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
     
        return result;
    }

}
