package de.tuhh.diss.SS19;

//Device superclass
public class Device{
	private Sensor[] sensors = new Sensor[3];
	private String description;
	private double reportInterval;
	
	public Device(Sensor[] sensors, String description, double reportInterval) {
		System.arraycopy(sensors, 0, this.sensors, 0, sensors.length);
		this.description = description;
		this.reportInterval = reportInterval;
	}
	
	public boolean start() {
		return true;
	}
	
	public boolean stop() {
		return true;
	}
	
}






