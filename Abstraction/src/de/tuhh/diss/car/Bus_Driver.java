package de.tuhh.diss.car;

public class Bus_Driver {

	public static void main(String[] args) {
		//numGear, gear, power
		Engine4 e = new Engine4(6, 0, 150);
		//Bus b1 properties defined by Engine4
		Bus b1 = new Bus(e);
		
		//The driver decides to check if gear 4 exists
		b1.checkGearExist(4);
		//The driver decides to check if gear 7 exists
		b1.checkGearExist(7);
		//Starts driving, by changing gear
		b1.shiftUp();
		//Starts moving the bus
		b1.drive(120); //Drives for 120 seconds
		//Increase the gear, or shift up
		b1.shiftUp();
		//continue driving the bus
		b1.drive(80); //Drives for 80 seconds
		//While driving, the driver decides to check the speed
		b1.getSpeed();
		//continue driving the bus
		b1.drive(50); //Drives for 50 seconds
		//Checking the distance traveled
		b1.getDist();
		// Driver decides to increase gear and also checking current gear
		b1.shiftUp();
		b1.getGearNo();
		b1.shiftUp();
		b1.getGearNo();
		b1.shiftUp();
		b1.getGearNo();
		b1.shiftUp();
		b1.getGearNo();
		b1.shiftUp();
		b1.getGearNo();
		
		
	}

}