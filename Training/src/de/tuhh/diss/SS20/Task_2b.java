package de.tuhh.diss.SS20;

import de.tuhh.diss.io.SimpleIO;

public class Task_2b {

	public static void main(String[] args) {
		SimpleIO.println(hailstone(5,4));
		SimpleIO.println(hailstone(5,3));
		SimpleIO.println(hailstone(5,6));
		SimpleIO.println(hailstone(5,5));
		//SimpleIO.println(hailstone(-5,5));
		
		SimpleIO.println("");
		
		hailstoneGPT(5);

	}
	
	public static int hailstone(int s, int n) {
		if (s <= 0 || n < 0) {
			throw new IllegalArgumentException("Bad Value");
		}
		
		int hailstone = s;
		
		for (int i = 0; i < n; i++) {
			if (hailstone % 2 == 0) {
				hailstone = hailstone / 2;

			}
			else {
				hailstone = 3*hailstone + 1;
			}
			
		}
		
		return hailstone;
		
	}
	
	//ChatGPT
	public static void hailstoneGPT(int start) {
        if (start <= 0) {
            throw new IllegalArgumentException("Start value must be positive");
        }

        int hailstone = start;
        System.out.println(hailstone);

        while (hailstone != 1) {
            if (hailstone % 2 == 0) {
                hailstone /= 2;
            } else {
                hailstone = 3 * hailstone + 1;
            }
            System.out.println(hailstone);
        }
    }

}
