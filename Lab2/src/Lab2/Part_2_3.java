package Lab2;
import lejos.hardware.lcd.LCD;
import lejos.hardware.Button;
import lejos.hardware.Sound;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.utility.Delay;

public class Part_2_3 {

	public static double smallGear = 8; 
	public static double bigGear = 24;
	public static double wheelDiameter = 5.4; //in cm
	public double circumference = 2*Math.PI*(wheelDiameter/2); // in cm ~16.96cm
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World World");
		/*
		 
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
		double distance = 20; //in cm
		int desired_degrees = (int) degrees(distance);
		desired_degrees = (int) convSmall2Big(desired_degrees);
		System.out.println(desired_degrees);
		leftMotor.rotate(desired_degrees, true);
		rightMotor.rotate(desired_degrees, true);
		Delay.msDelay(3000);
		
		*/
		
		//Making sounds
		Sound.setVolume(50);
		Sound.playTone(400, 500);
		
		//Making buttons
		Button.waitForAnyPress();
		//Button.UP.isDown();
		while(Button.UP.isDown()) {
			Sound.setVolume(50);
			Sound.playTone(400, 500);
			Sound.playTone(800, 500);
			Sound.playTone(200, 500);
		}
		
		
		//Making buttons on display
		Button.waitForAnyPress();
		if (Button.ENTER.isDown()) {
			LCD.clear();
			String[] menu = {"Menu", "Volume", "Frequency", "Duration", "Play"};
			LCD.drawString("Menu", 0, 0);
			LCD.drawString("Volume", 1, 1);
			LCD.drawString("Frequency", 1, 2);
			LCD.drawString("Duration", 1, 3);
			LCD.drawString("Play", 1, 4);
			
			while(true) {
				Button.waitForAnyPress();
				
				if (Button.DOWN.isDown()) {
					LCD.drawString(">", 0, 1);
				}
			}
		}
		
		
		
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
