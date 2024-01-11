package de.tuhh.diss.apps;

import de.tuhh.diss.io.SimpleIO;

public class Loops_2_2 {
	public static void main(String[] args) {
		
		//while loop with break statement
			//will find number that is divisible by 5 and 7
				//If num is divisible by 5 and 7, it will not break
		int num = 0;
		while (true) {
			if ((num % 5 == 0) && (num % 7 == 0) && (num != 0)) {
				break;
			}
			num++;
			SimpleIO.println(num);

		}
		
	}

}
