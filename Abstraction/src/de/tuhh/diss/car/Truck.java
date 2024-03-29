package de.tuhh.diss.car;

import de.tuhh.diss.io.SimpleIO;

public class Truck {
	
	private double dist;
	private Engine3 engine; //If a class is used for declaration, then it must be defined below 'public Truck(Engine3 engine)'
	
	//Truck t1 = new Truck(); will go here, when called.
	//Truck t3 = new Truck(e); will go here, when called. After receiving the 'e' input variables of 'Engine3 e = new Engine3(3, 100);
	public Truck() {
		this(new Engine3(0, 100));
		SimpleIO.println(engine.get_Engine3_Power()); //Just for printing, not needed
	}
	
	//Truck t2 = new Truck(200); will go here when called.
	public Truck(int power) {
		this(new Engine3(0, power));
		SimpleIO.println(engine.get_Engine3_Power()); //Just for printing, not needed
	}

	//Truck(Engine3) needs to be defined
		//This will be able to be manipulated later when calling the Truck class in 'Driver.java'
		//With default dist = 0 value
	public Truck(Engine3 engine) {
		dist = 0;
		this.engine = engine;
		SimpleIO.println(engine.get_Engine3_Power()); //Just for printing, not needed
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
