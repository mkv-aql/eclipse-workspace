package de.tuhh.diss.apps;

import de.tuhh.diss.io.SimpleIO;

public class SumToN {
	public static void main(String[] args) {
		SimpleIO.println("Insert the initial and limit values");
		int M = SimpleIO.readInt();
		int N = SimpleIO.readInt();
		
		System.out.println(method_1(M, N));
		
	}
	
	public static double method_1(int start, int end) {
		int sum = 0;
		for (int i = start; i <= end; i++) {
			sum = sum + i;
		}
		
		return sum;
	}

}
