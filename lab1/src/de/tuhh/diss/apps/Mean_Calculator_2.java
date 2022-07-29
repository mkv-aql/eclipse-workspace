/**
 * 
 */
package de.tuhh.diss.apps;
import de.tuhh.diss.io.SimpleIO;

/**
 * @author Makav
 *
 */
public class Mean_Calculator_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Size of array will be 4
		float[] a = new float[4];
		a[0] = 2;
		a[1] = 4;
		a[2] = 5;
		a[3] = 3;
		
		int N = a.length;
		double mean = 0;
		for (int i = 0; i < N; i++) {
			mean += a[i];
			
		}
		SimpleIO.println("mean is: " +(mean/N));
		
		SimpleIO.println();
		
		//USer input of values
		SimpleIO.println("How many values would like to insert: ");
		
		int b = SimpleIO.readInt();
		int[] c = new int[b];
		float sum = 0;
		for (int i = 0; i < b; i++) { //It cannot be <= because it will exceed the allocated memory since the iteration will be b+1 (interpreter error)
			SimpleIO.println("Insert Value no. " +i);
			c[i] = SimpleIO.readInt();
			sum += c[i];
			
		}
		for (int i = 0; i < b; i++) {
			SimpleIO.println("Inserted Value no. " +(i+1) +" is " +c[i]);
		}
		SimpleIO.println("Mean value is: " +(sum/(c.length)));
		SimpleIO.println("Mean value is: " +c.length);
		SimpleIO.println("Mean value is: " +(sum));
		

	}

}
