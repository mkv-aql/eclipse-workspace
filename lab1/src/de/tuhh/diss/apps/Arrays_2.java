/**
 * 
 */
package de.tuhh.diss.apps;
import de.tuhh.diss.io.SimpleIO;

/**
 * @author Makav
 *
 */
public class Arrays_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// an Array can have multiple components stored with 1 variable name
			//Each component has its own index [x][y] or even [x][y][z]
		
		//Declaring an Array
		int[] a;
		float[] b;
		double[] c;
		
		//Then must allocate memory size
		a = new int[20];
		b = new float[35];
		c = new double[1000];
			
		//Declaring an array with values
		int[] d = {3, 5, 8}; //It will automatically allocate 3 memory size
			//it is equivalent to:
		int[] e = new int[3];
		e[0] = 3;
		e[1] = 5;
		e[2] = 8;
		
		//Finding or printing the array length or size
		SimpleIO.println(d.length); //Size of d will be 3
		
		//Multi-dimensional arrays
		int[][] f;
		float[][] g;
		double[][] h;
		
		f = new int[4][5];
		g = new float[20][20];
		h = new double[5][15];
		
		int[][] i = {{1,2,3}, {4,5,6}}; //Size is [2][3]
		SimpleIO.println(i.length); // Size of i will be 2
		
		int[][] j = {{1,2,3,5}, {4,5,6,5}, {7,8,9,5}}; // Size is [3][4]
		SimpleIO.println(j.length); // Size of i will be 2
		
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
