package de.tuhh.diss.exams;

import de.tuhh.diss.io.SimpleIO;

public class SS20 {
	public static void main(String[] args) {
		//2a (sum of every 3rd element in an array) //
		int[] a = {1,2,3,4,5,6,7,8,9};
		method_1(a);
		//float sum = method_1(a);
		//SimpleIO.println(sum);
		
		//2b (return the nth hailstone numbers)//
			// next number: s = 3*s + 1 if odd. s = s/2 if even. 
		//Insert maximum value, and starting sequence count
		method_2(11, 0);
		
		//2a (sum every 3rd element in an array)
		method_3(5, 15);
		
		//2b (Hailstone number)
		method_4(5, 5);
		
		System.out.println(Math.pow(2, 5*7 + 1));
		double b = 2^(5*7 + 1); //not the same as to the power of
		b = 2^(5*7 + 1);
		System.out.println(b);
		
		
		
	}

	//2a
	private static int method_1(int[] array) {
		int sum = 0;
		for (int i = 2; i < array.length; i += 3) {
			sum = sum + array[i];
		}
		
		SimpleIO.println(sum);
		return sum;
	} 
	
	//2b
	private static int method_2(int s,  int sequence) {
		if (s == 0) {
			return sequence;
		}
		if (s % 2 == 0) {
			s = s/2;
			sequence++; 
			System.out.println("the " +sequence +"th s value: " +s);
		}
		else {
			s = (3*s) + 1;
			sequence++;
			System.out.println("the " +sequence +"th s value: " +s);
		}
		return s;
	}
	
	// 2a (sum of every 3rd element, starting from L[0])
	private static double method_3(int start, int end) {
		double sum = 0;
		int list_length = end - start; 
		int[] a = new int[list_length];
		int j = 0;
		for (int i = start; i < end; i++) {
			a[j] = i;
			j++;
		}
		
		for (int i = 0; i < a.length; i=i+3) {
			sum = sum + a[i];
		}
		System.out.println("Sum of every 3rd element = " +sum);
		return sum;
	}
	
	//2b (hailstone number) 
	//if sn == odd, 3*sn +1.
	//if sn == even, sn/2.
	private static int method_4(int start, int index) {
		int sn = 0;
		System.out.println("Strating Sn: " +start);
		for (int i = start + 1; i < (start + index); i++) {
			if (i % 2 == 0) {
				sn = i/2;
				System.out.println(i +"th Sn value is: " +sn);
			}
			else {
				sn = (3*i) + 1;
				System.out.println(i +"th Sn value is: " +sn);
			}
		}
		
		return sn;
	}
	
	
	
	
	
	

}
