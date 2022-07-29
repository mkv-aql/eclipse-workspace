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
public class BMI_Calculation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float BMI;
		
		System.out.println("Insert height in m: ");
		Scanner in = new Scanner(System.in);
		float h = in.nextFloat();
		System.out.println("Inserted height is " + h);
		
		System.out.println("Insert weight in kg: ");
		float w = in.nextFloat();
		System.out.println("Inserted weight is " + w);
		
		BMI = w/(h*h);
		System.out.println("Your BMI is " + BMI);
		
		in.close();

	}

}
