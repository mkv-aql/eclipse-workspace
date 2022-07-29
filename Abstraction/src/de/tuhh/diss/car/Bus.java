package de.tuhh.diss.car;

import de.tuhh.diss.io.SimpleIO;

public class Bus {
	private Engine4 engine;
	private double dist;
	
	//Bus(Engine4) needs to be defined
	public Bus(Engine4 engine) {
		dist = 0;
		this.engine = engine;
	}
	
	public boolean shiftUp() {
		return engine.shift(1);
	}
	
	public boolean shiftDown() {
		return engine.shift(-1);
	}
	
	public double drive(double time) {
		double curDist = 0;
		if (time > 0) {
			curDist = time * engine.getSpeed();
			dist += curDist;
		}
		return curDist;
	}
	
	public double getDist(){
		SimpleIO.println("Distance traveled: " +dist);
		return dist;
	}
	
	public double getSpeed() {
		//Fetching speed from 'Engine4'
		return engine.getSpeed();
	}
	
	public boolean checkGearExist(int gear) {
		//Fetching gear existent from 'Engine4'
		engine.checkGear(gear);
		return true;
	}
	
	public int getGearNo() {
		//Fetching gear existent from 'Engine4'
		engine.currentGear();
		return 0;
	}
}
