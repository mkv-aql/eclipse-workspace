package de.tuhh.diss.apps;
import de.tuhh.diss.io.SimpleIO;

public class Loops_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//While loop
		int i = 5;
		while (i < 5) {
			SimpleIO.println("Iteration: " +i++);
			
		}
		
		int j = 1;
		while (j < 5) {
			SimpleIO.println("Iteration:" +i++); //Will go forever
		}

	}

}
