package de.tuhh.diss.SS19;

//Types of Sensor
public class TempSensor extends Sensor{
	public TempSensor(String brand) {
		super(brand);
	}
	
	public double readSensor() {
		
		return 1.0; //Just example
	}
}