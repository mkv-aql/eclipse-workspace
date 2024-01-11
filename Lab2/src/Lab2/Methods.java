package Lab2;

public class Methods {
	public int smallGear = 8; 
	public int bigGear = 24;
	public double wheelDiameter = 5.4; //in cm
	public double circumference = 2*Math.PI*(wheelDiameter/2); // in cm ~16.96cm
	
	public double convSmall2Big(double rotateSmallMotor) {
		double rotateBigMotor = 0;
		
		rotateBigMotor = rotateSmallMotor * (smallGear/bigGear);
		
		return rotateBigMotor;
	}
	
	public double convBig2Small(double rotateBigMotor) {
		double rotateSmallMotor = 0;
		
		rotateSmallMotor = rotateSmallMotor * (bigGear/smallGear);
		
		return rotateSmallMotor;
	}
	
	//NOT DONE
	public double move(double distance) {
		double moveDistance = distance / circumference;
		
		
		
		return moveDistance;
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
