package Lab2;

import lejos.hardware.lcd.LCD;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.hardware.sensor.SensorMode;
import lejos.robotics.SampleProvider;
import lejos.utility.Delay;

public class Part_3_3_version2 {
	public static void main(String[] args) {
		
		
		Drive_Method car = new Drive_Method();
		//Delay.msDelay(500); 
		
		//Motor Sensor
		double distance = 20; //in cm
		int desired_degrees = (int) car.degrees(distance);
		desired_degrees = (int) car.convSmall2Big(desired_degrees);
		System.out.println(desired_degrees);
		car.move(desired_degrees);
		Delay.msDelay(3000);
		
		
		//Distance sensor
		EV3UltrasonicSensor distSens = new EV3UltrasonicSensor(SensorPort.S4);
		SampleProvider dist = distSens.getDistanceMode();
		
		float[] sampleDist;
		sampleDist = new float[dist.sampleSize()];
		dist.fetchSample(sampleDist, 0);
		
		System.out.println(sampleDist[0]);
		
		
		
		//Color sensor
		EV3ColorSensor colSens = new EV3ColorSensor(SensorPort.S1);
		SensorMode colorId = colSens.getColorIDMode();
		
		float[] sampleCol;
		sampleCol = new float[colorId.sampleSize()];
		colorId.fetchSample(sampleCol, 0);
		
		Delay.msDelay(50); 
		
		System.out.println(sampleCol[0]);
		
		
		
		while(true) {
			car.move();
			
			//Get Distance
			dist.fetchSample(sampleDist, 0);
			System.out.println(sampleDist[0]);
			LCD.clear();
			LCD.drawString((String.valueOf(sampleDist[0])), 1, 1);
			
			if (sampleDist[0] < 0.032) {
				car.stop();
				
				//Get color
				colorId.fetchSample(sampleCol, 0);
				Delay.msDelay(50); 
				System.out.println(sampleCol[0]);
				LCD.drawString((String.valueOf(sampleCol[0])), 1, 2);
				
				
				break;
			}
			
		
		}
		

	}
}
