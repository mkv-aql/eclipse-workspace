/**
 * 
 */
package de.tuhh.diss.apps;
import de.tuhh.diss.io.SimpleIO;


//Important Import for decimal separators of , and . in decimal numbers (1,5 and 1.5)
import java.util.Locale;

////PERSONAL REMINDERS
//Inserted a loop in name user input based on the number of memory
//BMI calculation must calculate each list of names to each of the respective data
// Add Local.ROOT in "String ConvertedF2S = String.format(Locale.ROOT, "%.02f", w);"
	//so that the float values will stay in . decimal format instead of ,

/**
 * @author Makav
 *
 */
public class BMI_Calculation_SimIO_1_43_Final_Cleaner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaring number of names to be inserted
		System.out.println("How many names do you want to insert? ");
		int l = SimpleIO.readInt();
		//Corrected list from user input perspective, because arrays starts at 0
		int cl = l; 
		//User name input for storing in multidimensional array
		String[][] names; 
		//Allocate memory by inputing the number of inputed number of names 
			//Each name will have 4 data (name, height, weight, BMIstatus)
		names = new String[cl][4];
		//Get the size of the array inserted into the memory
		System.out.println(names.length);
		System.out.println("");
		
		
		//User input name loop, Will keep looping based in no. of name list memory
		for (int i = 0; i < l; i++) {
			System.out.println("Insert your name: ");
			String a = SimpleIO.readString();
			//Testing if input string works
			System.out.println("your name is: " +a);
			//input the string into array or list in 1st element
			names[i][0] = a;
			
		}
		
		//Testing if name in array exists, in a loop
		for (int i = 0; i < l; i++) {
			System.out.println("");
			System.out.println("Checking if name is in an array: " +names[i][0]);
			System.out.println("");
		}
		
		
		//User input height loop, will loop for every name that was listed
		float ggh = 0; //so that the h will be global-global height (0 for init.)
		for (int i = 0; i < l; i++) {
			//Loop of height input error filter
			System.out.println("Insert height in m: ");
			float gh = 0; //So that h will be global height
			ggh = gh; //So that h will be global height
			while(true) {
				float h = SimpleIO.readFloat();
				gh = h; //So that h will be global
				
				if(h < 0){
					System.out.println("Height can't be a negative number! ");
					//break; //Breaks the while loop and moves on
					continue; //Repeat the while loop again
				}
					
				if(h > 2.72) {
					System.out.println("Height can't be a above 2.72m ");
					//break;
					continue;
				}
					
				else {
					System.out.println("Inserted height is: " + h);
					System.out.println("");
					//Convert the float h to string, because names list are in strings
					String ConvertedF2S = String.format(Locale.ROOT,"%.02f", h);
					//input the string into array or list in 2nd element
					names[i][1] = ConvertedF2S;
					break;
				}
			}
		}
		
		//Testing if height in array exists, in a loop
		for (int i = 0; i < l; i++) {
				System.out.println("");
				System.out.println("Checking if height is in an array: " +names[i][1]);
				System.out.println("");
				}
		
		//User input weight loop, will loop for every name that was listed
		float ggw = 0; //so that the w will be global-global weight (0 for init.)
		for (int i = 0; i < l; i++) {
			
			//Loop for weight
			float gw = 0; //So that weight will be global weight
			ggw = gw;
			System.out.println("Insert weight in kg: ");
			while(true) {
				float w = SimpleIO.readFloat();
				gw = w; //So that weight will be global weight
				ggw = gw; //So that weight will be global weight
				if(w < 0) {
					System.out.println("Weight can't be a negative number! ");
					continue;
				}
				
				else {
					System.out.println("Inserted weight: " + w);
					System.out.println("");
					String ConvertedF2S = String.format(Locale.ROOT, "%.02f", w);
					//input the string into array or list in 3rd element
					names[i][2] = ConvertedF2S;
					break;
				}
				
				
			}
		}
		
		//Testing if weight in array exists, in a loop
		for (int i = 0; i < l; i++) {
			System.out.println("");
			System.out.println("Checking if weight is in an array: " +names[i][2]);
			System.out.println("");
			}		
		
		
		
		//Checking if global weight is globally controllable from while loop
		System.out.println("Global value Weight check:  " + ggw);
		System.out.println("");
		
		String x3 = names[0][1];
		float y3 = Float.parseFloat(x3);
		System.out.println("Checking conversion of String to Float:  " + y3);
		
		//Classification of BMI in an array
		double BMI_UPPER = 25;
		double BMI_LOWER = 18.5;
		
		//BMI status for 2nd array of the name list
		String BMIstatus = "null";
		
		//User input BMIstatus loop, will loop for every name that was listed
		for (int i = 0; i < l; i++) {
			//Pick the value from the array list for height and weight
			String x1 = names[i][1];
			float y1 = Float.parseFloat(x1);
			String x2 = names[i][2];
			float y2 = Float.parseFloat(x2);
			
			float BMI = y2/(y1*y1);
			
			while(BMI > 0) {
				
				if(BMI < BMI_LOWER) {
					System.out.println("BMI underweight ");
					System.out.println("");
					//Declare underweight to BMIstatus for 2nd Array list
					BMIstatus = "underweight";
					names[i][3] = BMIstatus;
					break;
					}
				if(BMI >= BMI_UPPER) {
					System.out.println("BMI overweight ");
					System.out.println("");
					//Declare overweight to BMIstatus for 2nd Array list
					BMIstatus = "overweightt";
					names[i][3] = BMIstatus;
					break;
				}
				else {
					System.out.println("BMI Normal weight ");
					System.out.println("");
					//Declare normal to BMIstatus for 2nd Array list
					BMIstatus = "normal";
					names[i][3] = BMIstatus;
					break;		
					}
				
			}
			
		}
		
		//Testing if weight in array exists, in a loop
		for (int i = 0; i < l; i++) {
			System.out.println("");
			System.out.println("Checking if BMIstatus is in an array: " +names[i][3]);
			System.out.println("");
			}			
		
		//Testing if list will contain name and BMIstatus
		for (int i = 0; i < l; i++) {
			//Print 2 elements from the same array
			System.out.println(names[i][0] + " is " +names[i][3]);
		}
	}
}
