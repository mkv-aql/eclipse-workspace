package de.tuhh.diss.WS20;

public class Task_2a {

	public static void main(String[] args) {
		System.out.println(sumOddSquares(3));

	}
	
	
	public static int sumOddSquares(int n) {
		int sum = 0;
		int i = 0;
		int start = 1;
		
		while(i < n) {
			sum = sum + start*start;
			start = start + 2;
			i++;
			
			if (i == n) {
				break;
			}
		}
		
		return sum;
	}

}
