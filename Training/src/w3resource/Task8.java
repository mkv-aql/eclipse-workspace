package w3resource;

import de.tuhh.diss.io.SimpleIO;

public class Task8 {

	public static void main(String[] args) {
		invest(1000, 1.1, 5);

	}
	
	public static void invest(double amount, double interest, int year) {
		double total = amount;
		
		for (int i = 0; i < year; i++) {
			total = total*interest;
			SimpleIO.println("Year: " +(i+1) +" Total: " +total);
		}
	}

}
