package de.tuhh.diss.WS19;

import de.tuhh.diss.io.SimpleIO;

public class Task_2a {

	public static void main(String[] args) {
		double[] array = {0,1,2,3,4,5,6,7};
		SimpleIO.println(oddSum(array));

	}
	
	public static double oddSum(double[] array) {
		if ((array == null) || (array.length == 0)) {
			return 0;
		}
		else {
			double sum = 0;
			
			for (int i = 0; i < array.length; i=i+2) {
				sum = sum + array[i];
			}
			
			return sum;
		}
		
		
	}

}
