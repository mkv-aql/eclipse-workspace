package de.tuhh.diss.WS18;

import de.tuhh.diss.io.SimpleIO;

public class Task_2a {

	public static void main(String[] args) {
		SimpleIO.println(isDivisibleBy(8,3));
		SimpleIO.println(isDivisibleBy(9,3));
		SimpleIO.println(isDivisibleBy(9,0));

	}
	
	public static boolean isDivisibleBy(int a, int b) {
		if (b == 0) {
			return false;
		}
		else if (a % b == 0){
			return true;
		}
		else {
			return false;
		}
	}

}
