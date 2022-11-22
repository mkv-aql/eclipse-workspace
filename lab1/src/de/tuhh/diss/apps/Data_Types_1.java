/**
 * 
 */
package de.tuhh.diss.apps;

/**
 * @author Makav
 * 
byte	1 byte	Stores whole numbers from -128 to 127
short	2 bytes	Stores whole numbers from -32,768 to 32,767
int		4 bytes	Stores whole numbers from -2,147,483,648 to 2,147,483,647
long	8 bytes	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
float	4 bytes	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
double	8 bytes	Stores fractional numbers. Sufficient for storing 15 decimal digits
boolean	1 bit	Stores true or false values
char	2 bytes	Stores a single character/letter or ASCII values
long	When int is not large enough to store the value
 *
 */
public class Data_Types_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myNum = 5;               // Integer (whole number)
		float myFloatNum = 5.99f;    // Floating point number
		char myLetter = 'D';         // Character
		boolean myBool = true;       // Boolean
		String myText = "Hello";     // String
		long myLongNum = 21421432354325234L; //Long
		float f1 = 35e3f; 			//Scientific number (e vs E is the same)
		double d1 = 12E4d; 			//Scientific number
		
		System.out.println(myNum);
		System.out.println(myFloatNum);
		System.out.println(myLetter);
		System.out.println(myBool);
		System.out.println(myText);
		System.out.println(myLongNum);
		System.out.println(f1);
		System.out.println(d1);
		
		//Convert Value types
		double numfloat = 9.78d;
		int numint = (int) numfloat; 
		System.out.println("numFloat: " +numfloat +" to Integer numint: " +numint);
		
	}

}
