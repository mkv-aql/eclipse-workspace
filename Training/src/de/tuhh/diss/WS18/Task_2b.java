package de.tuhh.diss.WS18;

import de.tuhh.diss.io.SimpleIO;

public class Task_2b {

	public static void main(String[] args) {
		double[] array = {1,2,3,-4,5};
		SimpleIO.println(posMean(array));
		double[] array2 = {-1,-2,3,4,-5};
		SimpleIO.println(posMean(array2));
	}
	
	
	public static double posMean(double[] array) {
		double sum = 0;
		double count = 0;
		
		if (array == null || array.length == 0) {
			return 0;
		}
		else {
			for (int i = 0; i < array.length; i++) {
				if (array[i] < 0) {
					continue;
				}
				else {
					sum = sum + array[i];
					count++;
				}
			}
		return sum/count;
		}
	}

}
