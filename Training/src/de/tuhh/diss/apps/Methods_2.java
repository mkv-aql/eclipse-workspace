package de.tuhh.diss.apps;

public class Methods_2 {
	
	public static final int e = 10; 
	
	public static void main(String[] args) {
		
		method_1();
		
		method_2(3, 4.5f, 9);
		
		System.out.println(method_3(3, 4, 5));
		System.out.println("");
		
		System.out.println(method_4(5, 5)); 
		System.out.println("");
		
		System.out.println(method_5(4, 5) +" is bigger");
		System.out.println("");
		
		System.out.println("public static final int e = " +e);
		System.out.println("");
		
		method_6();
		
		method_7();
		
		//method_8("hello");
	}
	
	public static void method_1() {
		System.out.println("Running method 1: ");
		float a = 1.0f;
		int b = 2;
		double c = 3.0d;
		
		double d = a + b + c;
		
		System.out.println(d);
		System.out.println("");
	}
	
	public static void method_2(int a, float b, double c) {
		System.out.println("Running method 2: ");
		double d = a + b + c;
		System.out.println(d);
		System.out.println("");
	}
	
	public static int method_3(int a, int b, int c) {
		System.out.println("Running method 3: ");
		int d = a + b + c; 
		return d;
	}
	
	public static boolean method_4(double a, double b) {
		System.out.println("Runnig method 4: ");
		
		return (a == b);
	}
	
	public static int method_5(int a, int b) {
		System.out.println("Running method 5: ");
		if (a > b) {
			return a;
		}
		else {
			return b;
		}
	}
	
	public static void method_6() {
		System.out.println("public static final int: (in method) " +e);
		System.out.println("");
	}
	
	public static void method_7() {
		System.out.println("Changing variable of e, originally e = " +e);
		int e = 5;
		System.out.println("New e: " +e);
		System.out.println("");
	}
	
	public static void method_8(String[] a) {
		if (a.length <= 0) {
			return;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
	
}
