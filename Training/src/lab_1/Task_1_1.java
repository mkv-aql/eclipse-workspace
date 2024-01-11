package lab_1;

import de.tuhh.diss.io.SimpleIO;

public class Task_1_1 {

	public static void main(String[] args) {
		double w = 1;
		double h = 0;
		double BMI = 0;
		
		while (true) {
			System.out.println("Insert weight kg");
			w = SimpleIO.readDouble();
			
			if (w == 0) {
				System.out.println("Loop ends");
				break;
			}
			else {
				
				System.out.println("Insert height m");
				h = SimpleIO.readDouble();
				
				BMI = w/(h*h);
				
				System.out.println("BMI = " +BMI);
			}
			
			
		}
		
		

	}

}
