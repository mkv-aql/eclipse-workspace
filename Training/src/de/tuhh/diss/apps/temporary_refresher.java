package de.tuhh.diss.apps;

import de.tuhh.diss.io.SimpleIO;

public class temporary_refresher {
	public static void main(String[] args) {
		
		//arrays
		int[][][] a;
		int[] b = {1,3,5,7};
		System.out.println(b[2]);
		int[] c = new int[3];
		a = new int[3][2][1];
		System.out.println(a.length);
		System.out.println(a[0].length);
		System.out.println(a[0][0].length);
		System.out.println("");
		
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				for (int k = 0; k < a[i][j].length; k++) {
					a[i][j][k] = i;
					SimpleIO.println(a[i][j][k]);
				}
			}
		}
		
		SimpleIO.println(a[0][0][0]);
		
		for (int i = 0; i <= a.length; i++) {
			for (int j = 0; j <= a[0].length; j++) {
				SimpleIO.println("[" +a[i][j][0] +a[i][j][0] +"]");
			}
		}
		
		
	}

}
