package de.tuhh.diss.SS20;

import de.tuhh.diss.io.SimpleIO;

public class Task_2a {

	public static void main(String[] args) {
		double[] array = {1,2,3,4,5,6,7,8,9};
		SimpleIO.println(thirdSum(array));

	}
	
	public static double thirdSum(double[] array) {
		if (array == null || array.length == 0) {
			return 0;
		}
		
		double sum = 0;
		
		for (int i = 0; i < array.length; i=i+3) {
			sum = sum + array[i];
		}
		
		return sum;
	}
	
	

}
