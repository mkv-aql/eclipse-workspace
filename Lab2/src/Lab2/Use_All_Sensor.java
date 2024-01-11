package Lab2;

import lejos.hardware.Button;
import lejos.hardware.lcd.LCD;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.EV3GyroSensor;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.hardware.sensor.SensorMode;
import lejos.robotics.SampleProvider;
import lejos.utility.Delay;

public class Use_All_Sensor {

	public static void main(String[] args) {
		//Color Sensor
		EV3ColorSensor colSens = new EV3ColorSensor(SensorPort.S1);
		SensorMode colorId = colSens.getColorIDMode();
		//Ultrasonic Sensor
		EV3UltrasonicSensor distSens = new EV3UltrasonicSensor(SensorPort.S4);
		SampleProvider dist = distSens.getDistanceMode();
		//Gyro sensor
		EV3GyroSensor angleSens = new EV3GyroSensor(SensorPort.S3);
		SampleProvider angle = angleSens.getAngleMode();
		//Motors
		EV3LargeRegulatedMotor leftMotor = new EV3LargeRegulatedMotor(MotorPort.B);
		@SuppressWarnings("resource")
		EV3LargeRegulatedMotor rightMotor = new EV3LargeRegulatedMotor(MotorPort.C);

		rightMotor.setSpeed(720);
		leftMotor.setSpeed(720);

		Delay.msDelay(1000); 
		
		
		
		
		
		//Color sensor implementation
		float[] sampleColor;
		sampleColor = new float[colorId.sampleSize()];
		colorId.fetchSample(sampleColor, 0);
		Delay.msDelay(500); 
		System.out.println(sampleColor[0]);
		
		//Ultrasonic Sensor implementation
		float[] sampleUltrasonic;
		sampleUltrasonic = new float[dist.sampleSize()];
		dist.fetchSample(sampleUltrasonic, 0);
		
		System.out.println(sampleUltrasonic[0]);
		
		while(true) {
			dist.fetchSample(sampleUltrasonic, 0);
			LCD.clear();
			int i = -1;
			i++;
			LCD.drawString(String.valueOf(sampleUltrasonic[i]), 0, 1);
			Delay.msDelay(100);
			
			if (Button.ENTER.isDown()) {
				break;
			}
		}
		
		//Gyro Sensor Implementation
		float[] sampleAngle;
		sampleAngle = new float[angle.sampleSize()];
		int count = 0;
		float totalAngle = 0;
		float lastAngle = 0;
		
		//Motor implementation, but in this case it using  a class method for driving
		Drive_Method car = new Drive_Method();
		
		while(true) {
			car.turnLeft();
			angle.fetchSample(sampleAngle, 0);
			float deltaAngle = sampleAngle[0] - lastAngle;
			totalAngle += deltaAngle;
			System.out.println("Sample Angle: "+sampleAngle[0]);
			System.out.println("Total Angle: "+totalAngle);
			lastAngle = sampleAngle[0];
			Delay.msDelay(10);

			
			if (totalAngle >= 360) {
				count++;
				totalAngle -= 360;
				System.out.println("No. of turns: " +count);
				LCD.clear();
				LCD.drawString(String.valueOf(count), 1, 1);
				
			}
			
		}
		
		

	}

}
