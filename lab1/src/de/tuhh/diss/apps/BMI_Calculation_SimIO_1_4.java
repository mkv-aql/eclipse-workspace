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
public class BMI_Calculation_SimIO_1_4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//User name input for storing in array
		String[] names; 
		//Allocate memory
		names = new String[10];
		//User input name
		System.out.println("Insert your name: ");
		String a = SimpleIO.readString();
		//Testing if input string works
		System.out.println("your name is: " +a);
		//input the string into first of array
		names[0] = a;
		//Testing if name in array exists
		System.out.println(names[0]);
		
		//Loop of height input
		System.out.println("Insert height in m: ");
		float gh; //So that h will be global height
		while(true) {
			float h = SimpleIO.readFloat();
			gh = h; //So that h will be global
			
			if(h < 0){
				System.out.println("Height can't be a negative number! ");
				//break; //Breaks the while loop and moves on
				continue; //Repeat the while loop again
			}
				
			if(h > 2.72) {
				System.out.println("Height can't be a above 2.72m ");
				//break;
				continue;
			}
				
			else {
				System.out.println("Inserted height is: " + h);
				System.out.println("");
				break;
			}
		}
		
		//Just to test the inputed value
		float n = gh + 2;
		System.out.println("if 2m is added: ");
		System.out.println(n);
		System.out.println("");
		
		
		//Loop for weight
		float gw; //So that weight will be global weight
		System.out.println("Insert weight in kg: ");
		while(true) {
			float w = SimpleIO.readFloat();
			gw = w;
			
			if(w < 0) {
				System.out.println("Weight can't be a negative number! ");
				continue;
			}
			
			else {
				System.out.println("Inserted weight: " + w);
				System.out.println("");
				break;
			}
			
			
		}
		
		//Checking if global weight is globally controllable from while loop
		System.out.println("Global Weight check:  " + gw);
		System.out.println("");
		
		//BMI Calculation
		float BMI = gw/(gh*gh);
		System.out.println("BMI is: " + BMI);
		
		
		//Classification of BMI in an array
		double BMI_UPPER = 25;
		double BMI_LOWER = 18.5;
		
		while(BMI > 0) {
			
			if(BMI < BMI_LOWER) {
				System.out.println("BMI underweight ");
				break;
				}
			if(BMI >= BMI_UPPER) {
				System.out.println("BMI overweight ");
				break;
			}
			else {
					System.out.println("BMI Normal weight ");
					break;
				}
			
		}
		
		
		

	}

}
