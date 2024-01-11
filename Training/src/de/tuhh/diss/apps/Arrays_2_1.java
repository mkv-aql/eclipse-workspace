package de.tuhh.diss.apps;

import de.tuhh.diss.io.SimpleIO;

public class Arrays_2_1 {
	public static void main(String[] args) {	
		//Multidimensional arrays
		int[][] a;
		float [][][] b;
		double[][][][] c;
		
		//Array of size 2 elements, with size 3 elements each 
		a = new int[2][3]; // {{x,x,x},{z,z,z}}
		b = new float[3][2][3]; //{{{x,x,x},{x,x,x}},{{x,x,x},{x,x,x}},{{x,x,x},{x,x,x}}} 
		c = new double[2][3][2][1];
		
		int[][] d = {{1,2,3},{4,5,6},{1,2,3}}; //Size [2][3]
		SimpleIO.println(d.length);
		int e = d[0][2];
		SimpleIO.println(e);
		
		int[][] k= new int[3][5];
		k[0][0] = 5; //Inputing 5 into very first position of x and y
		k[2][4] = 8; //iputing 8 into very last position of x and y
		
		SimpleIO.println("Size of k: " +k.length);
		SimpleIO.println(k[0][0] +" " +k[2][4]);

		int[][][] l = {{{1,2,3,5}, {4,5,6,5}, {7,8,9,5}}, {{1,2,3,5}, {4,5,6,5}, {7,8,9,5}}};  //Size is [2][3][4]
		
		//If memory size not allocated >> compiler error
			//if memory size allocated, but inserted value exceeds size >> interpreter error

				
		
	}
}
