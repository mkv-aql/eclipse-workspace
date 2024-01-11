package de.tuhh.diss.WS21;

public class Task_2a {

	public static void main(String[] args) {
		System.out.println(calculateWasteCost(2,2,2));
		System.out.println(calculateWasteCost(2,2,1));
		System.out.println(calculateWasteCost(2,2,3));
		

	}
	
	public static double calculateWasteCost(double l, double w, double h) {
		double volume = l*w*h;
		double cost = 35;
		double leftOver = 0;
		
		if (volume > 8) {
			leftOver = volume - 8;
			cost = cost + Math.ceil(leftOver)*5;
			
			return cost;
		}
		else {
			return cost;
		}
	}
	

}
