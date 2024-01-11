package de.tuhh.diss.SS19;

//Sensor collect
public abstract class Sensor{
	private String brand;
	public Sensor(String brand) {
		this.brand = brand;
	}
	
	public abstract double readSensor();
	
	public String getBrand() {
		return this.brand;
	}
}