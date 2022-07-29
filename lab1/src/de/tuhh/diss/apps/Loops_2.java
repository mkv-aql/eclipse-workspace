/**
 * 
 */
package de.tuhh.diss.apps;
import de.tuhh.diss.io.SimpleIO;

/**
 * @author Makav
 *
 */
public class Loops_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// While Loops
			//The condition is executed first, if not met then it will not do the statement at all (loop never started)
		int i = 5;
		SimpleIO.println("While loops: ");
		while(i < 5) {
			SimpleIO.println("Iteration: " + i++);
		}
		SimpleIO.println();
		
		// Do-While Loops
			//The statement is executed first, then the condition is executed, if condition is not met, it will not re-do the statement again (loop ended)
		int j = 5;
		SimpleIO.println("do-while loops: ");
		do {
			SimpleIO.println("Iteration: " + j++);
		} while (j < 8); // If 8 is changed to 5, it will print only "5" and then ends the loop
		SimpleIO.println();
		
		// for loops
			//No. of loops is declared first 
		SimpleIO.println("for loops: ");
		for (int k = 0; k < 5; k++) {
			SimpleIO.println("Iteration: " + k);
		}
		SimpleIO.println();
		
		//Practice: Adding squares of odd numbers 1,3,5.... until 20
		SimpleIO.println("Adding up odd numbers up until 20: ");
		int sum_odd = 0; //int sum_odd moved outside of for loop to be a global variable
		for (int l = 1; l < 20; l+=2) {
			//int sum_odd = 0;
			sum_odd += l*l;
			SimpleIO.println("Iteration: " + l);
			
		}
		
		SimpleIO.println("Total Sum of squared odd numbers: " + sum_odd);
		SimpleIO.println();
		
		//Practice 2: Adding squares of odd numbers 1,3,5.... until 20, but using while loop
		SimpleIO.println("Adding up odd numbers up until 20, using while loop: ");
		int sum_odd_2 = 0;
		int m = 1;
		while (m < 20) {
			SimpleIO.println("Iteration: " + m);
			sum_odd_2 += m*m;
			m += 2;
		}
		SimpleIO.println("Total Sum of squared odd numbers, using while loop: " + sum_odd_2);
		SimpleIO.println();
		
		//Loops with break statement, to end a loop after meeting a condition
			//Find first number divisible by 6 and 15
		int number = 1;
		while (true) {
			if ((number % 6 == 0) && (number % 15 == 0)) {
				break;
			}
			SimpleIO.println(number); //This will print out a number from 1 until it reaches 30, which is divisible by 6 and 15
			number++;
		}
		SimpleIO.println();
		
		//Loops with continue statement 
			//Adding up numbers less than 200 and not divisible by 6
		/**
		float sum_200_6 = 0;
		while (true) {
			if ((sum_200_6 < 200) && (sum_200_6 % 6 != 0)) {
				continue; //continue will redo the previous loop, in this case if statement, if the condition applies. 
			} 
			SimpleIO.println(sum_200_6);
			sum_200_6++;
			
		} //This code will not work, since it will print only 0, and there are no other numbers printed, since it will continue the if loop endlessly it will never go to println again
			//While true and continue is a bad combination, it will run in a loop forever. 
		*/
		
		int sum_200_6 = 0;
		
		for (int n = 0; n < 200; n++) {
			if (n % 6 == 0) {
				continue; //continue will redo the previous loop, in this case for loop statement, if the condition applies. 
			}
			SimpleIO.println(sum_200_6);
			sum_200_6 += n; 
		}
		SimpleIO.println();
		
		//Countdown loop with for loop
		for (int o = 50; o >= 0; o--) {
			SimpleIO.println("count down for loop; " +o);
			
		}
		SimpleIO.println();
		
		//Countdown loop with while loop
		int p = 50;
		while (p >= 0) {
			SimpleIO.println("Count down while loop; " +p);
			p--;
		}
		SimpleIO.println();
		
		//Countdown loop with do while
		int q = 50;
		do {
			SimpleIO.println("Count down do-while: " +q);
			q--;
		} while (q >= 0);
		SimpleIO.println();
		
		//Nested Loops
			//print 3 times of the countdown from 12
		for (int r = 0; r < 3; r++) {
			for (int s = 12; s >= 0; s--) {
				SimpleIO.println("Part: "+(r+1) +" no.: " +s);
			}
		}
		SimpleIO.println();
		
		
		

	}

}
