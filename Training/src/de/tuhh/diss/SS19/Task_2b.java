package de.tuhh.diss.SS19;

import de.tuhh.diss.io.SimpleIO;

public class Task_2b {

	public static void main(String[] args) {
		double[] array = {1,2,3,4,5,6,7,8};
		
		SimpleIO.println(getMSE(array));
		SimpleIO.println(1.0/3);

	}
	
	public static double getMSE(double[] array) {
		if (array == null || array.length == 0) {
			return -1;
		}
		
		int N = array.length;
		double sum = 0;
		
		for (int i = 0; i < N - 1; i++) {
			sum = sum + (array[i] - getMean(array)) * (array[i] - getMean(array));
		}
		
		return (1.0/N) * sum;
		
	}
	
	
	public static double getMean(double[] array) {
		double sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}
		
		return sum/array.length;
	}

}
