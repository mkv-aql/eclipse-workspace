/**
 * 
 */
package de.tuhh.diss.apps;

import de.tuhh.diss.io.SimpleIO;

/**
 * @author Makav
 *
 */
public class Methods_2 {

	/**
	 * @param args
	 */
	
	public static final int N = 10; //This can be used to make a variable global to every method
	
	
	public static void main(String[] args) {
		// In Python; it is the same as 'def example(): ... return 0' or 'def example2(input): ... return input'
			//Cannot declare methods within methods, but can only call 
				//Naming the methods should be like so: getHeight, startMotor, calculateAngle, etc. 
					//Java cannot return more than 1 values like Python from methods, but can input more than 1
		
		//To avoid broken program, there must be a robust method. 
			//For example, to avid division by zero, there must be a 'return Double.NaN;' to avoid the calculation
		
		SimpleIO.println("Hello ");
		
		//Calling the method
			//Calling the method can be done anywhere (Where statements are allowed)
		method_1();
		
		//Declared variables will work only in the method body, and will not be recognized outside of it.
		float a; 
		a = 5;
		float b = a*2;
		SimpleIO.println("Print from main: " +b);
		
		//Calling the method_2, and must be inserted into a variable
			//Must be int, because method_2 method is declared with int.
		int c = method_2();
		SimpleIO.println("Print from method_2: " +c);
		
		//Calling the method_3, and must be inserted into a variable
			//Must be double, because method_2 method is declared with double to handle decimals.
		double d = method_3();
		SimpleIO.println("Print from method_3: " +d);
		
		//Calling a method directly into a statement
		SimpleIO.println("Print from method_3 with method called into the statement directly: " +method_3());
		
		SimpleIO.println("Print from method_4 with if statement: " +method_4());
		
		//Calling a method with a parameter input. In Python; it is called arguments)
			//the parameter when called is called actual parameter 
		double e = method_5(2, 4, 6);
		SimpleIO.println("Print from method_5: " +e);
		
		//Calling a method of True or False
		boolean f = method_6(8);
		SimpleIO.println("Print from method_6, if input is odd or not: " +f);
		
		//Calling a method of which is larger between 2 values
		int g = method_7(7, 9);
		SimpleIO.println("Print from method_7, higher value is: " +g);
		
		//Testing the global variable of N
		SimpleIO.println("Global variable of N, that was declared before main(string[] .... method: " +N);

	}
	
	// Example of declaring a method or defining a function called "methodName"
	public static void method_1() {
		//statement_1;
		//statement_2; 
		
		//Declared variables will work only in the method body, and will not be recognized outside of it.
		int a = 9;
		int b = a*3;
		SimpleIO.println("Print from method_1 method: " +b);
	}
	
	// Returning values with method. In Python; 'return' after a 'def example():'
	public static int method_2() {
		//Something
		int a = 5, b = 6;
		int value_2 = a*b;
		
		return value_2;
		//anything after return will not be executed
	}
	
	public static double method_3() {
		
		double a = 5.4, b = 7.9;
		double value_3 = a*b;
		return value_3;
	}
	
	//Returning a value with an if
	public static double method_4() {
		
		double a = 5.4, b = 7.9;
		double sum = 0;
		double value_4 = a*b;
		if (sum > 40) {
			return value_4;
		} else {
			return a;
		}
		
	}
	
	//Methods with parameter input, it can be called with a certain input value. In Python; it is called arguments
		//in the method, this is called formal parameters
	public static double method_5(int first, int second, int third) {
		double sum = first + second + third;
		return sum/3;
	}
	
	//Method of returning a True of False value
	public static boolean method_6(int a) {
		return ((a % 2) != 0 );
	}
	
	
	//Method for returning which is a higher value
	public static int method_7(int a, int b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}
	
	//Method for returning a string (must be in an array)
	public static void print(String[] lines) {
		if (lines.length <= 0) {
			return; //returning nothing
		}
		for (int i = 0; i < lines.length; i++) {
			SimpleIO.println(lines[i]);
		}
	}
	 
	
	
	

}
