package de.tuhh.diss.car;

import de.tuhh.diss.io.SimpleIO;

public class Engine4 {
	
	private int numGears; //Normally the maximum gears in engines are 6
	private int gear;
	private int power;

	public Engine4(int numGears, int gear, int power) {
		this.numGears = numGears;
		this.gear = gear;
		this.power = power;
		
	}
	
	public boolean shift(int gears) {
		int newGear = gear + gears;
		if (newGear > numGears || newGear < 0) {
			return false;
		}
		this.gear = newGear;
		return true;
	}
	
	public void setPower(int power) {
		if (power > 0) {
			this.power = power;
		}
		
	}

	public double getSpeed() {
		int speed;
		speed = (gear * this.power)/this.numGears; //Hypothetically, this is how speed is calculated. lol (maximum gear normally is 6)
		SimpleIO.println("Speed is: " +speed); //Just for printing, not necessary needed.
		return speed;
	}
	
	public boolean checkGear(int gear) {
		if (gear >= 0 && gear < numGears) {
			SimpleIO.println("Gear Exists");
			return true;
		} else
			SimpleIO.println("Gear not Exists");
			return false;
	}
	
	public int currentGear() {
		SimpleIO.println("Current gear is: " +gear);
		return gear;
	}
	
	
	
}

