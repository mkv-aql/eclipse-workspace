package de.tuhh.diss.apps;

import de.tuhh.diss.io.SimpleIO;

/**
* @author Makav
*
*/


public class Class_3_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Something...
		
		//In order to run method 'doSomething', must run 'AnotherClass()' first. (Create a reference of AnotherClass to variable a, then initiating it)
			//But private classes cannot be accessed from outside 'class AnotherClass'
		AnotherClass a = new AnotherClass();
		
		//There must be a method within 'class AnotherClass' to access the 'private class Within_AnotherClass'.
		a.Accessing_Within_AnotherClass();


	}

}

//This is a package class. Can only be accessed in the 'testpackage' package (Abstraction/src/testpackage)
class AnotherClass {
	int a;
	//...
	
	private class Within_AnotherClass {
		public void doSomething() {
			SimpleIO.println("Soemthing printed from WithinAnotherClass ");
		}
	}
	//Method to access the 'private class Within_AnotherClass'
	void Accessing_Within_AnotherClass() {
		Within_AnotherClass b = new Within_AnotherClass();
		b.doSomething();
	}
}
