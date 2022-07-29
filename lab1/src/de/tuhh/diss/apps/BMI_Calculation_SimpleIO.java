/**
 * 
 */
package de.tuhh.diss.apps;
import de.tuhh.diss.io.SimpleIO;
import java.util.Scanner;

/**
 * @author Makav
 *
 */
public class BMI_Calculation_SimpleIO {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Insert height in m: ");
		float h = SimpleIO.readFloat();
		System.out.println("Inserted height is: " + h);
		System.out.println("");
		
		float n = h+2;
		System.out.println("if 2m is added: ");
		System.out.println(n);
		System.out.println("");
		
		System.out.println("Insert weight in kg: ");
		float w = SimpleIO.readFloat();
		System.out.println("Inserted weight: " + w);
		
		float BMI = w/(h*h);
		System.out.println("BMI is: " + BMI);
		
		
		

	}

}
