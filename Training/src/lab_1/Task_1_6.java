package lab_1;

import de.tuhh.diss.io.SimpleIO;

public class Task_1_6 {

	public static void main(String[] args) {
		System.out.println("Input age: ");
		
		int age = SimpleIO.readInt();
		
		MaxOxygen user = new MaxOxygen(age);
		System.out.println("Your VO2 max is: " +user.getVO2_max());

	}
	
	public static double VO_max() {
		double value = 0;
		
		
		return value;
	}

}





