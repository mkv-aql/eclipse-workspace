/**
 * 
 */
package de.tuhh.diss.clock;

import de.tuhh.diss.io.SimpleIO;

/**
 * @author Makav
 *
 */
public class Clock_Test {

	public static void runTest(int fromH, int fromM, int numTicks) {
		Clock clock = new Clock();
		clock.setTime(fromH, fromM);
		
		SimpleIO.println(numTicks + " ticks from " + fromH + ":" + fromM);
		for (int i = 1; i <= numTicks; i++) {
			SimpleIO.println(clock.getTime());
			clock.timeTick();
		 }
		 clock.timeTick();
	}
	
	public static void main(String[] args) {
		runTest(0, 55, 10);
		runTest(5, 32, 125);
		
	}

}
