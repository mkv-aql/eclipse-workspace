
package Lab2;

import lejos.hardware.lcd.LCD;
import lejos.hardware.Button;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.utility.Delay;

/**
 * @author Makav
 *
 */
public class Part_2_2 {
	
	public static double smallGear = 8; 
	public static double bigGear = 24;
	public static double wheelDiameter = 5.4; //in cm
	public double circumference = 2*Math.PI*(wheelDiameter/2); // in cm ~16.96cm
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World World");
		
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
		// Start turning the motor forward
		//rightMotor.forward();
		//leftMotor.forward();
		// or backward
		//rightMotor.backward();
		Delay.msDelay(1000); 
		
		
		
		
		//Driving with method
		double distance = 20; //in cm
		int desired_degrees = (int) degrees(distance);
		desired_degrees = (int) convSmall2Big(desired_degrees);
		System.out.println(desired_degrees);
		
		//leftMotor.rotate(desired_degrees, false); //Wait for move to complete
		//leftMotor.rotate(desired_degrees, true); //Do not wait for move to complete
		//leftMotor.rotate(desired_degrees);
		//leftMotor.rotateTo(desired_degrees);
		//rightMotor.rotate(desired_degrees, true);
		
		leftMotor.rotate(-desired_degrees, true); //Because gear will rotate other way to other gears, therefore minus
		rightMotor.rotate(-desired_degrees, true); //
		Delay.msDelay(3000);
	}
	
	public static double convSmall2Big(double rotateSmallMotor) {
		double rotateBigMotor = 0;
		
		rotateBigMotor = rotateSmallMotor * (bigGear/smallGear);
		
		return rotateBigMotor;
	}
	
	public double convBig2Small(double rotateBigMotor) {
		double rotateSmallMotor = 0;
		
		rotateSmallMotor = rotateSmallMotor * (smallGear/bigGear);
		
		return rotateSmallMotor;
	}
	
	//NOT DONE
	public double move(double distance) {
		double moveDistance = distance / circumference;
		
		
		
		return moveDistance;
	}
	
	//Convert degrees to arcLength
	public static double arcLength(double degrees) {
		//Arc length calculation (radians)
		double arcLength = (wheelDiameter/2) * Math.toRadians(degrees);
		return arcLength;
	}
	
	//Convert desired arcLength to degrees
	public static double degrees(double arcLength) {
		double degrees = (arcLength / (2 * Math.PI * (wheelDiameter/2))) * 360;

		return degrees;
	}
	

}
