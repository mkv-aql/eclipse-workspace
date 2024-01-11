package Lab2;

import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.utility.Delay;

public class Part_3_3 {

	public static void main(String[] args) {

		
		Drive_Method car = new Drive_Method();
		Delay.msDelay(500); 
		
		double distance = 20; //in cm
		int desired_degrees = (int) car.degrees(distance);
		desired_degrees = (int) car.convSmall2Big(desired_degrees);
		System.out.println(desired_degrees);
		car.leftMotor.rotate(-desired_degrees, true);
		car.rightMotor.rotate(-desired_degrees, true);
		Delay.msDelay(3000);
		
		
		

	}

}
