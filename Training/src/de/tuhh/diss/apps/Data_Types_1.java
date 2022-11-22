/**
 * 
 */
package de.tuhh.diss.apps;

/**
 * @author Makav
 *
 */
public class Data_Types_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intNum = 10;
		float floatNum = 7.96f; //using f or not, will not affect anything
		float floatNum2 = 4e3f;
		double doubleNum = 19.666666;
		double doubleNum2 = 16e3d; //using d or not, will not affect anything
		char charLetter = 'b';
		boolean trueFalse = true; //always small letters for boolean
		String stringWords = "How are you today";
		long longNum = 14012453422356775L; //Must use L at the end of the long number
		
		System.out.println(intNum);
		System.out.println(floatNum);
		System.out.println(floatNum2);
		System.out.println(doubleNum);
		System.out.println(doubleNum2);
		System.out.println(charLetter);
		System.out.println(trueFalse);
		System.out.println(stringWords);
		System.out.println(longNum);

		//CONVERT VALUE TYPES
		double doubleNum3 = 64.89;
		int intNum3 = (int) doubleNum3;
		System.out.println(intNum3); //Number will be rounded, decimal places removed
		
		//PRINTING MULTIPLE VALUES
		System.out.println("Words: " +doubleNum2 +" more words: " +charLetter);
	}

}
