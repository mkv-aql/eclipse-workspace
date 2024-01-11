package de.tuhh.diss.exams;

public class WS18 {
	public static void main(String[] args) {
		//1a, is a divisible by b without remainder. 
		boolean a = method_1(5, 0);
		System.out.println(a);
		
		//1b, calculates mean value of > 0
		double[] c = {1, 2, -3, 4.4, 5.8, 6, 7.9};
		double b = method_2(c);
		System.out.println("mean value = " +b);
	}
	
	// 1a
	public static boolean method_1(int a, int b) {
		if (b == 0) {
			System.out.println("b cannot be 0");
			return false;
			
		}
		
		if (a % b == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	public static double method_2(double[] a) {
		double sum = 0;
		int N = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0) {
				sum = sum + a[i];
				N++;
		}
		}
		sum = sum/N;
		
		return sum;
	}
	
	
	

}
