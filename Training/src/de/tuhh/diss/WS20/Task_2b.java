package de.tuhh.diss.WS20;

public class Task_2b {

	public static void main(String[] args) {
		double[] array1 = {-1, -2, -3, -4};
		double[] array2 = {-1, 2, -3, 4};
		double[] array3 = {};
		double[] array4 = {1,2,3,4};
		double[] array5 = null;
		double[] array6; //Memory size undeclared
		
		System.out.println(negativeAverage(array1));
		System.out.println(negativeAverage(array2));
		System.out.println(negativeAverage(array3));
		System.out.println(negativeAverage(array4));
		System.out.println(negativeAverage(array5));
		//System.out.println(negativeAverage(array6)); //Compile Error

	}

	
	public static double negativeAverage(double[] array) {
		if (array == null || array.length == 0) {
			return 0;
		}
		
		double sum = 0;
		int count = 0;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] < 0) {
				sum = sum + array[i];
				count++;
			}
			else {
				continue;
			}
		}
		
		if (sum == 0) {
			return 0;
		}
		else {
			return sum/count;
		}
		
			
		
		
	}
}
