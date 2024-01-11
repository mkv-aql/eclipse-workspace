package lab_1;

import de.tuhh.diss.io.SimpleIO;

public class Task_1_3 {
	

	public static void main(String[] args) {
		double w = 1;
		double h = 0;
		double BMI = 0;
		final double BMI_UPPER = 25;
		final double BMI_LOWER = 18.5;
		
		
		while (true) {
			
			System.out.println("Insert weight kg");
			w = SimpleIO.readDouble();
			
			if (w < 0) {
				System.out.println("Weight must not be negative");
				System.out.println("");
				continue;
			}
			
			else if (w == 0) {
				System.out.println("Loop ends");
				break;
			}
			else {
				
				while (true) {
					System.out.println("Insert height m");
					h = SimpleIO.readDouble();
				
				
					if (h < 0 || h > 2.72) {
						System.out.println("Height cannot be negative and/or above 2.72m");
						continue;
					}
					else {
						BMI = w/(h*h);
						
						System.out.println("BMI = " +BMI);
						
						if (BMI < BMI_LOWER) {
							System.out.println("You are underweight");
						}
						else if (BMI >= BMI_UPPER) {
							System.out.println("You are overweight");
						}
						else {
							System.out.println("You are Normal");
						}
						
						System.out.println("");
						System.out.println("");
						
						break;
					}
				}	
			}
		}

	}

}
