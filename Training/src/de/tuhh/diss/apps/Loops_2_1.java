package de.tuhh.diss.apps;

import de.tuhh.diss.io.SimpleIO;

public class Loops_2_1 {
	
	public static void main(String[] args) {
		
		//For loop
		for (int i = 0; i < 10; i++)
			SimpleIO.println("Iteration number: " +i);
		
		System.out.println();
		
		//For loop with precise ending
		for (int j = 0; j <= 10; j++)
			SimpleIO.println("Itertaion number: " +j);
		
		//Adding up odd numbers only
		int odd_sum = 0;
		for (int i = 1; i <= 20; i+=2)
			odd_sum += i;
			SimpleIO.println("sum of odd numbers: " +odd_sum);
			
		System.out.println();
		
		for (int i = 1; i <= 20; i+=2)
			odd_sum += i*i;
			SimpleIO.println("Sum of squared odd numbers: " +odd_sum);
	}

}
