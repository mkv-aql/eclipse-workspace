package Lab2;

import lejos.hardware.lcd.LCD;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.utility.Delay;

public class Part_2_2_Version2 {

	public static void main(String[] args) {
		int milliseconds = 1000;
		String s = "Driving Test";		
		Delay.msDelay(milliseconds); 	
		LCD.drawString(s, 0, 0);
		
		//Driving
		// Create an instance of the class EV3LargeRegulatedMotor
		@SuppressWarnings("resource")
		EV3LargeRegulatedMotor leftMotor = new EV3LargeRegulatedMotor(MotorPort.B);
		@SuppressWarnings("resource")
		EV3LargeRegulatedMotor rightMotor = new EV3LargeRegulatedMotor(MotorPort.C);
		// Set the desired motor speed
		rightMotor.setSpeed(720);
		leftMotor.setSpeed(720);
		Delay.msDelay(1000); 
		
		
		
		//Driving with method
		double distance = 20;
		
		Methods car = new Methods();
		
		int desired_degrees = (int) car.degrees(distance);
		desired_degrees = (int) car.convSmall2Big(desired_degrees);
		System.out.println(desired_degrees);
		
		leftMotor.rotate(desired_degrees, true);
		rightMotor.rotate(desired_degrees, true);
		Delay.msDelay(5000);
	}

}
