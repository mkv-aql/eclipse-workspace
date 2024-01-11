package de.tuhh.diss.apps;

import de.tuhh.diss.io.SimpleIO;

public class Mean_Calculator {
	public static void main(String[] args) {
		int a = SimpleIO.readInt();
		
		SimpleIO.println("a = " +a);
		
		System.out.println("Enter the amount of values N");
		int N = SimpleIO.readInt();
		
		double[] b = new double[N];
		
		for (int i = 0; i < N; i++) {
			System.out.println("Enter the " +(i+1) +"th value");
			b[i] = SimpleIO.readInt();
			
		}
		
		//Calculation
		double TotalVal = 0;
		for (int i = 0; i < b.length; i++) { 
			TotalVal = TotalVal + b[i];
			
		}
		
		double Mean = TotalVal / N;
		SimpleIO.println("Mean = " +Mean);
		
	}

}
