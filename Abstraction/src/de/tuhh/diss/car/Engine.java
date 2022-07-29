/**
 * 
 */
package de.tuhh.diss.car;

/**
 * @author Makav
 *
 */
public class Engine {

	/**
	 * @param args
	 */
	private int gear; //It will automatically be 'int gear 0', when referenced to another class
	private int power;  //It will automatically be 'int power 0', when referenced to another class
	
	public void shift(int gears) {
		gear += gears;
	}
	
	public void setPower(int p) {
		power = p;
	}
	
	public int getSpeed() {
		return gear * power;
	}

}


