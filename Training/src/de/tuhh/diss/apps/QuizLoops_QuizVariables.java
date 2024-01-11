package de.tuhh.diss.apps;

public class QuizLoops_QuizVariables {
	public static int a = 10;
	private static int b = 4;
	
	public static void main(String[] args) {
		int count = 0;
		for (int i = 0; i <= a; i++) {
			System.out.println("i = " +i);
			
			for (int j = 1; j < i; j++) {
				System.out.println(" j = " +j);
				count++;
			}
		}
		System.out.println("Count = " +count);
		System.out.println("private b = " +b);
		
		final int a = 5;
		System.out.println("new a = " +a);
		int b = 2;
		double c;
		c = b / a;
		System.out.println("c = " +c);
		
		final double d = 5;
		c = d / b;
		System.out.println("c = " +c);
		double e = 3;
		c = e / a;
		System.out.println("c = " +c);
		
		System.out.println(method_1());
		System.out.println(method_2());
	}
	
	public static double method_1() {
		double c = a * b;
		
		return c;
	}
	
	public static double method_2() {
		double c = a * b;
		final double a = 2;
		int b = 3;
		c = a * b;
		
		return c;
	}
	
	

}
