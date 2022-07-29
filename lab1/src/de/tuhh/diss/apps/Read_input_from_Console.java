/**
 * 
 */
package de.tuhh.diss.apps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Makav
 *
 */
public class Read_input_from_Console {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(
	            new InputStreamReader(System.in));
	 
	        // Reading data using readLine
	        String name = reader.readLine();
	 
	        // Printing the read line
	        System.out.println(name);
		

	}

}
