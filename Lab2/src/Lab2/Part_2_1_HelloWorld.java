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
		int milliseconds = 1000;
		String s = "Hello World";
		
		Delay.msDelay(milliseconds); 
		
		LCD.drawString(s, 0, 0);
		
		Delay.msDelay(500);
		
		//Banner (moving string)
		String b = "This is a banner";
		
		for (int i = 0; i<10; i++) {
			LCD.clear();
			LCD.drawString(b, i, 0);
			Delay.msDelay(100);
		}
		
		LCD.clear();
		LCD.drawString(s, 0, 0);
	}

}
