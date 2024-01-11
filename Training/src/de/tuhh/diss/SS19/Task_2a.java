package de.tuhh.diss.SS19;

import de.tuhh.diss.io.SimpleIO;

public class Task_2a {

	public static void main(String[] args) {
		SimpleIO.println(isMultipleOf(9,3));
		SimpleIO.println(isMultipleOf(9,2));

	}
	
	public static boolean isMultipleOf(int a, int b) {
		if (a % b == 0) {
			return true;
		}
		else {
			return false;
			}
	}

}
