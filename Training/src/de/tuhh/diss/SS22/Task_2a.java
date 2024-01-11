package de.tuhh.diss.SS22;

import de.tuhh.diss.io.SimpleIO;

public class Task_2a {

	public static void main(String[] args) {
		SimpleIO.println(calculateFare(11));

	}
	
	public static double calculateFare(float d) {
		double fare = 10*1.1;
		double leftOver = 0;
		
		if(d > 10) {
			leftOver = d - 10;
			fare = fare + Math.round(leftOver)*0.9;
			return fare;
		}
		else {
			return fare;
		}
		
		
		
	}
	
	

}
