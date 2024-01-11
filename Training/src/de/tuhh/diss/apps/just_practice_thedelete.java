package de.tuhh.diss.apps;
import de.tuhh.diss.io.SimpleIO;

public class just_practice_thedelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int intNum = 50;
		float floatNum = 30.5f; 
		double doubleNum = 45.8d;
		boolean tf = true;
		String word = "some words";
		char a = 'b';
		
		System.out.println(intNum);
		System.out.println(floatNum);
		System.out.println(doubleNum);
		System.out.println(tf);
		System.out.println(word);
		System.out.println(a);
		
		float floatNum2 = (float) intNum; 
		
		System.out.println(floatNum2);
		
		System.out.println(intNum +"  " +floatNum +"  " +doubleNum +"  " +tf );
		
		SimpleIO.println(floatNum +"  " +a +"  " +doubleNum);
		

	}

}
