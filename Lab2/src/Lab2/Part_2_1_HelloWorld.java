package Lab2;

import lejos.hardware.lcd.LCD;
import lejos.utility.Delay;

/**
 * 
 */

/**
 * @author Makav
 *
 */
public class Part_2_1_HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello World";
		LCD.drawString(s, 0, 0);
		
		int milliseconds = 5000;
		Delay.msDelay(milliseconds); 
	}

}
