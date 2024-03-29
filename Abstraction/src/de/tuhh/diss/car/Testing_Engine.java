/**
 * 
 */
package de.tuhh.diss.car;

import de.tuhh.diss.io.SimpleIO;

/**
 * @author Makav
 *
 */
public class Testing_Engine {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Calling the Engine class from 'Engine.java'_____________
		Engine e;
		
		e = new Engine();
			
		//setPower and shift is accessible from here, because it is a 'public void' within the 'Engine' class of 'Engine.java'. 
		e.setPower(100);
		e.shift(2);
		SimpleIO.println(e.getSpeed());
		
		
		//Calling Engine2 class from 'Engine2.java'___________________
		Engine2 f;
			//Setting up the gear and power
		f = new Engine2(2, 7);
			//Calling the method for processing the Engine2 received variables
		SimpleIO.println(f.get_Engine2_Power());
		
			//Setting up only the power, and have gear = 1 as a default
		f = new Engine2(6);
			//Calling the method for processing the Engine2 received variables
		SimpleIO.println(f.get_Engine2_Power());
		
			//Testing of calling 'Engine2' class method
		//f.Engine2(2, 7); Does not work, because the Engine2 class is private, and can only be accessible from within the 'Engine2' class of 'Engine2.java'  
			//It is accessible from here, only if it is 'public void'.
		
		
		//Calling Engine3 class from 'Engine3.java'________________________
		Engine3 g;
		g = new Engine3(4, 9);
		SimpleIO.println(g.get_Engine3_Power());
		g = new Engine3(6);
		SimpleIO.println(g.get_Engine3_Power());
		

	}

}
