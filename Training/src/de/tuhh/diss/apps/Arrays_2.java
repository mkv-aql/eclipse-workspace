package de.tuhh.diss.apps;

import de.tuhh.diss.io.SimpleIO;

public class Arrays_2 {
	public static void main(String[] args) {
		//declare and array
		int[] a;
		float[] b;
		double[] c; 
		
		//Declare memory size for arrays
		a = new int[25];
		b = new float[4];
		c = new double[9];
		
		//Declare and allocate memory at the same time
		int[] d = new int[11];
		
		//Declare array and pre-input values
		int[] e = {1, 3, 7, 9}; //automatically allocates the memory needed
		
		//Declare array and input values manually
		int[] f = new int[3];
		f[0] = 2;
		f[1] = 5;
		f[2] = 24;
		System.out.println("Size of array: " +f.length); //Print size of array
		
		//Print the values of the array, java is not like python at printing arrays
		for (int i = 0; i < f.length; i++)
			SimpleIO.print(f[i] +", ");
		
		
		
	}

}
