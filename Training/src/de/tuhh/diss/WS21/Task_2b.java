package de.tuhh.diss.WS21;

import de.tuhh.diss.io.SimpleIO;

public class Task_2b {

	public static void main(String[] args) {
		System.out.println(sineApprox(Math.PI/2, 11));
		System.out.println(sineApproximation(Math.PI/2, 11));

	}
	
	//Mine
	public static double sineApprox(double x, int n) {
		double result = 0;
		double calculation = 0;
		
		for (int i = 0; i <= n; i++) {
			calculation = (Math.pow(-1, i) * Math.pow(x, (2 * i + 1)));
			calculation = calculation/factorial(i);
			
			
			result = result + calculation;
			
		}
		
		return result;
		
	}
	
	public static double factorial(int i) {
		double sum = 1;
		double max = 2*i + 1;
		
		for (double j = max; j > 0; j-- ) {
			sum = sum*j;
		}
		
		return sum;
	}
	
	
	//ChatGPT
	public static double sineApproximation(double x, int N) {
        double sin = 0.0;
        for (int i = 0; i <= N; i++) {
            
        	sin += Math.pow(-1, i) * Math.pow(x, 2 * i + 1) / factorialGPT(2 * i + 1);
        	
        }
        return sin;
    }

    public static long factorialGPT(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        
        return result;
    }

}
