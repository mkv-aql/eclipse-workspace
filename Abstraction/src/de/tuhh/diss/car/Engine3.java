/**
 * Using 'this' to reduce usage of variables
 */
package de.tuhh.diss.car;

/**
 * @author Makav
 *
 */
public class Engine3 {
	private int gear;
	private int power;
	
	//name of the innerclass must match public class (abstract class)
	public Engine3(int gear, int power) {
		//To avoid using p and g, to save memory then the below is made. But it cannot work if it is static (eg. public static)
		//gear = gear
		//power = power
		
			//Using 'this' will result in giving the reference of the gear and power variables from the 'private int', this way the gear and power affects the global variable
				//In Python; this.blabla = self.blabla
		this.gear = gear;
		this.power = power;
	}
	
	//A 2nd default paramaters, incase only 1 argument is given
		//If using 'this', then...
	public Engine3(int power) {
		this(0, power); //This will refer back to the first 'Public Engine3', '(0, power)' will go into '(int gear, int power)'
	}
	
	//Method for processing the input/received variables of 'public Engine2'. Because 'public' is private and cannot be accessed straight from outside, but only within 'Engine2 public class'
	public int get_Engine3_Power() {
		return gear * power;
	}

}
