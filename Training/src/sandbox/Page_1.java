package sandbox;

import de.tuhh.diss.io.SimpleIO;

public class Page_1 {
	
	public static final int N = 10;
	
	public static double result;
	
	public static int testvar = 0;

	public static void main(String[] args) {
		double x = 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1;
		
		SimpleIO.println(x);
		SimpleIO.println(x == 0.9);
		SimpleIO.println(2.0*3.0/5);
		
		SimpleIO.println("");
		
		int count = 0;
		int icount = 0;
		
		for (int i = 0; i < 5; i++) {
			icount++;
			for (int j = 0; j < i; j++) {
				count++;
			}
		}
		SimpleIO.println(icount);
		SimpleIO.println(count);
		
		int[] arr = {1,2,3};
		
		int a,b = 5;
		SimpleIO.println(b);
		
		SimpleIO.println("");
		
		test3();
		SimpleIO.println(result);
		
		SimpleIO.println("");
		
		SimpleIO.println(testvar);
		test4();
		SimpleIO.println(testvar);
		test5();
		SimpleIO.println(testvar);
		
		int value = 55;
		int range = 60;
		value = (value + 1) % range;
		SimpleIO.println(value);
		SimpleIO.println("");
		SimpleIO.println("");
		
		SimpleIO.println(5^2);
	}
	
	public static void test(int N) {
		
	}
	
	public static void test2() {
		result = 1 + 1;
	}
	
	public static double test3() {
		result = 1 + 1;
		return result;
	}
	
	public static double test4() {
		testvar = testvar + 1;
		return testvar;
	}
	
	public static void test5() {
		testvar = testvar + 1;
	}

}
