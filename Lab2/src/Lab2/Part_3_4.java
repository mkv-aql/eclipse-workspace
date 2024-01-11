package Lab2;

import lejos.hardware.lcd.LCD;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.EV3GyroSensor;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.hardware.sensor.SensorMode;
import lejos.robotics.SampleProvider;
import lejos.utility.Delay;

public class Part_3_4 {

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
		
		
		//Gyro sensor
		EV3GyroSensor angleSens = new EV3GyroSensor(SensorPort.S3);
		SampleProvider angle = angleSens.getAngleMode();
		
		float[] sampleAngle;
		sampleAngle = new float[angle.sampleSize()];
		int count = 0;
		float totalAngle = 0;
		float lastAngle = 0;
		
		while(true) {
			car.turnLeft();
			angle.fetchSample(sampleAngle, 0);
			float deltaAngle = sampleAngle[0] - lastAngle;
			totalAngle += deltaAngle;
			System.out.println("Sample Angle: "+sampleAngle[0]);
			System.out.println("Total Angle: "+totalAngle);
			lastAngle = sampleAngle[0];
			Delay.msDelay(10);
			
			/*
			if (sampleAngle[0] >= 360) {
				count++;
				sampleAngle[0] -= 360;
				System.out.println("No. of turns: " +count);
				
			}
			*/
			
			if (totalAngle >= 360) {
				count++;
				totalAngle -= 360;
				System.out.println("No. of turns: " +count);
				LCD.clear();
				LCD.drawString(String.valueOf(count), 1, 1);
				
			}
			
		}
		
		/*
		car.turnLeft();
		angle.fetchSample(sampleAngle, 0);
		System.out.println(sampleAngle[0]);
		Delay.msDelay(2000);
		car.turnLeft();
		angle.fetchSample(sampleAngle, 0);
		System.out.println(sampleAngle[0]);
		Delay.msDelay(2000);
		*/
		

	}

}
