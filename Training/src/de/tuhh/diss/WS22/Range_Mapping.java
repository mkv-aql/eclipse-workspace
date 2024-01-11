package de.tuhh.diss.WS22;

public class Range_Mapping {

	public static void main(String[] args) {
		double oldValue = 500;
        double newValue = mapToPwm(oldValue);
        System.out.println("The new value is: " + newValue);
        
        System.out.println(mapToGrade(3.3));

	}
	
	public static double mapToPwm(double oldValue) {
		double oldMin = 100;
		double oldMax = 2300;
		double newMin = 0;
		double newMax = 1024;
		
		double newValue = (oldValue - oldMin) * (newMax - newMin) / (oldMax - oldMin) + newMin;
		
		return newValue;
	}
	
	public static double mapToGrade(double oldValue) {
		double oldMin = 4.0;
		double oldMax = 1.0;
		double newMin = 50;
		double newMax = 100;
		
		double newValue = (oldValue - oldMin) * (newMax - newMin) / (oldMax - oldMin) + newMin;
		
		return newValue;
	}

}
