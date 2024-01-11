package lab_1;

import de.tuhh.diss.io.SimpleIO;

public class Task_1_5 {

	public static void main(String[] args) {
		double w = 1;
		double h = 0;
		double BMI = 0;
		final double BMI_UPPER = 25;
		final double BMI_LOWER = 18.5;
		double avgBMI = 0;
		
		
		System.out.println("How many users?");
		int u = SimpleIO.readInt();
		
		String[][] store = new String[u][2];
		String s;
		String name;
		
		for (int i = 0; i < u; i++) {
			System.out.println("Insert name: ");
			name = SimpleIO.readString();
			store[i][0] = name;
			
			while (true) {
				
				System.out.println("Insert weight kg for " +name);
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
						System.out.println("Insert height m for " +name);
						h = SimpleIO.readDouble();
					
					
						if (h < 0 || h > 2.72) {
							System.out.println("Height cannot be negative and/or above 2.72m");
							continue;
						}
						else {
							BMI = w/(h*h);
							String BMI_String = Double.toString(BMI);
							store[i][1] = BMI_String;
							
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
							
							break; //break out height loop
						}
						
						
					}	
				}
				break; //break out weight loop
			}
		}
		
		/*
		System.out.println(store[0][0]);
		System.out.println(store[0][1]);
		*/
		
		
		System.out.println("Do want to acess people's BMI info? insert name below, or type 'stop' to stop");
		
		
		while(true) {
			s = SimpleIO.readString();
			
			for (int i = 0; i < u; i++) {
				if (s.equals(store[i][0])) {
					System.out.println("BMI of "+s +" is " +store[i][1]);
				}
				else {
					
					continue;
				}
			}
			
			if(s.equals("stop")) {
				break;
			}

			
		}
		
		for (int i=0; i<u;i++) {
			avgBMI = avgBMI + Double.parseDouble(store[i][1]);
		}
		avgBMI = avgBMI/u;
		System.out.println("Average BMI of database = " +avgBMI);

	}

}
