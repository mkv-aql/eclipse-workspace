package de.tuhh.diss.SS22;

import de.tuhh.diss.io.SimpleIO;

public class Task_2b {
	
	private static final double MIN_RATE = 0.5;
	private static final double MAX_RATE = 1.5;
	private static final double SPEED_FACTOR = 0.02;

	public static void main(String[] args) {
		double[] distances = {5, 10, 15};
		double[] speeds = {45, 120, 60};
		SimpleIO.println(integrateFare(distances, speeds));
		

	}
	
	private static double feePerKm(double speed) {
		double fee = speed*SPEED_FACTOR;
		fee = Math.max(fee, MIN_RATE);
		fee = Math.min(fee, MAX_RATE);
		
		return fee;
	}
	
	
	public static double integrateFare(double[] distances, double[] speeds) {
		double fare = 0;
		
		for (int i = 0; i < distances.length; i++) {
			fare = fare + feePerKm(speeds[i])*distances[i];
		}
		
		
		return fare;
	}
	

}
