package methodOverloading;

import java.util.Random;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(addNumbers(3,2));
		System.out.println(addNumbers(3.5,2.6));
		System.out.println(addNumbers(3.5,2.6,3.1));
		addNumbers();
		
		MethodOverloading a = new MethodOverloading(); 
		a.addNumbersNoStatic();
		
	}
	
	public static int addNumbers(int a, int b) {
		
		return a + b;
	}
	
	public static double addNumbers(double a, double b) {
		
		return a + b;
	}
	
	public static double addNumbers(double a, double b, double c) {
		
		return a + b + c;
	}
	
	public static void addNumbers() {
		Random r = new Random();
		System.out.println(r.nextInt(6) + r.nextInt(3));
	}
	
	public void addNumbersNoStatic() {
		Random r = new Random();
		System.out.println(r.nextInt(10) + r.nextInt(10));
	}


}
