package Lab2;

import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.utility.Delay;

public class Drive_Method {
	private double smallGear;
	private double bigGear;
	private double wheelDiameter; //in cm
	private double circumference; // in cm ~16.96cm
	EV3LargeRegulatedMotor leftMotor;
	EV3LargeRegulatedMotor rightMotor;
	private double wheelDistance; //in cm
	
	public Drive_Method() {
		this.smallGear = 8.0; 
		this.bigGear = 24.0;
		this.wheelDiameter = 5.4; //in cm
		this.circumference = 2*Math.PI*(this.wheelDiameter/2); // in cm ~16.96cmW
		this.leftMotor = new EV3LargeRegulatedMotor(MotorPort.B);
		this.rightMotor = new EV3LargeRegulatedMotor(MotorPort.C);
		rightMotor.setSpeed(720);
		leftMotor.setSpeed(720);
		this.wheelDistance = 12.3; //in cm
	}
	
	
	public double convSmall2Big(double rotateSmallMotor) {
		double rotateBigMotor = 0;
		rotateBigMotor = rotateSmallMotor * (bigGear/smallGear);
		return rotateBigMotor;
	}
	
	public double convBig2Small(double rotateBigMotor) {
		double rotateSmallMotor = 0;
		rotateSmallMotor = rotateBigMotor * (smallGear/bigGear);
		return rotateSmallMotor;
	}
	

	public void move(int desired_degrees) {
		//double moveDistance = distance / circumference;
		leftMotor.rotate(-desired_degrees, true);
		rightMotor.rotate(-desired_degrees, true);

	}
	
	public void move() {
		//double moveDistance = distance / circumference;
		leftMotor.rotate(-100, true);
		rightMotor.rotate(-100, true);

	}
	
	public void stop() {
		//double moveDistance = distance / circumference;
		leftMotor.stop();
		rightMotor.stop();

	}
	
	//NOT DONE
	public void turnLeft() {
/*
		double rotate90 = (this.wheelDistance * Math.PI)/4;
		rotate90 = degrees(rotate90);
		//rotate90 = arcLength(rotate90);
		//rotate90 = convSmall2Big(rotate90);
		//System.out.println(this.wheelDistance);
		//System.out.println(rotate90);
		leftMotor.rotate((int) rotate90*3, true);
		rightMotor.rotate((int) -rotate90*3, true);
		*/
		leftMotor.rotate(50, true);
		rightMotor.rotate(-50, true);
		
	}
	
	public void turnRight() {
		int rotate90 = (123 * 90) / 2;
		leftMotor.rotate(-rotate90, true);
		rightMotor.rotate(-rotate90, true);
	}
	
	//Convert degrees to arcLength
	public double arcLength(double degrees) {
		//Arc length calculation (radians)
		double arcLength = (wheelDiameter/2) * Math.toRadians(degrees);
		return arcLength;
	}
	
	//Convert desired arcLength to degrees
	public double degrees(double arcLength) {
		double degrees = (arcLength / (2 * Math.PI * (wheelDiameter/2))) * 360;
		return degrees;
	}
}
