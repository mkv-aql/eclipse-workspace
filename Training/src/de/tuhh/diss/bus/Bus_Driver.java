package de.tuhh.diss.bus;

import de.tuhh.diss.io.SimpleIO;

public class Bus_Driver {
	
	public static void main(String[] args) {
		Engine e = new Engine(0, 200, 6); //gear, power, gear number
		Bus b = new Bus(e); //Chosen engine for the bus
		
		b.checkGear(3); // checking if gear 3 exist
		b.checkGear(7); // checking if gear 7 exist
		
		b.getDistance(); //See how much distance travelled
		
		b.shiftUp(); // change gear up
		b.whatGear(); // what is the current gear now
		
		b.drive(8); //Drive for 8 seconds
		b.getDistance();
		
		b.shiftUp();
		b.whatGear();
		b.drive(5);
		b.getDistance();
		
		b.shiftUp();
		b.shiftUp();
		b.shiftUp();
		b.shiftUp();
		b.whatGear();
		b.drive(9);
		b.getDistance();
		
		b.shiftUp();
		b.whatGear();
		
		b.drive(0);
		b.getDistance();
		
		//Testing of clearing a reference
		//b = null;
		//b.whatGear(); // will get an runtime error
		
		//Testing copying references, the both become the 1 reference (same instance). Whatever c does, b will have the same result as c.
		SimpleIO.println("");
		Bus c = b;
		c.whatGear();
		b.whatGear();
		c.drive(10); // making c drive, but will also affect b. 
		c.getDistance();
		b.getDistance();
		
	}

}
