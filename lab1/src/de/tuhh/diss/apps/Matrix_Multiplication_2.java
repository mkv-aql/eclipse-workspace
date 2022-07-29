/**
 * 
 */
package de.tuhh.diss.apps;

import de.tuhh.diss.io.SimpleIO;

/**
 * @author Makav
 *
 */
public class Matrix_Multiplication_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SimpleIO.println("Insert size of matrix M x N: ");
		int M = SimpleIO.readInt();
		int N = SimpleIO.readInt();
		float[][] A = new float[M][N];
		
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				SimpleIO.println("Insert value of matrix at position  [" +i +"]" +"[" +j +"]");
				A[i][j] = SimpleIO.readFloat();
			}
				
		}
		
		SimpleIO.println("Inserted value of matrix:");
		for (int i = 0; i < M; i++) {
			SimpleIO.println("");
			SimpleIO.print("[");
			for (int j = 0; j < N; j++) {
				SimpleIO.print(A[i][j]);
				SimpleIO.print(" ");
				} SimpleIO.print("]");
			} 
			
		

	}

}
