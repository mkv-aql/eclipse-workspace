/**
 * 
 */
package de.tuhh.diss.car;

/**
 * @author Makav
 *
 */
public class Engine2 {
	private int gear;
	private int power;
	
	//name of the innerclass must match public class (abstract class)
	public Engine2(int g, int p) {
		gear = g;
		power = p;
	}
	
	//A 2nd default paramaters, incase only 1 argument is given
	public Engine2(int p) {
		gear = 1;
		power = p;
	}
	
	//Method for processing the input/received variables of 'public Engine2'. Because 'public' is private and cannot be accessed straight from outside, but only within 'Engine2 public class'
	public int get_Engine2_Power() {
		return gear * power;
	}

}
