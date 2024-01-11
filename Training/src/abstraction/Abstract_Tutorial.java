package abstraction;
import de.tuhh.diss.io.SimpleIO;

/**
 * 
 */

//Abstract classes (superclass) are used to make regular classes
	//Below is an example of a cat abstract class, but when called in main, it will not respond like a regular method
abstract class Cat {
	String breed = "Jetzt geht's los!";
	
	public void meow() {
		SimpleIO.println("Meow!");
	}
}

//Abstract class dog for a complete example of a superclass 'Dog' (Abstract class Dog)
	//Within this superclass, it will list everything what a "Dog" can do. (Behavior)
abstract class Dog {
	String breed;
	
	//Method within the 'Dog' superclass, with an implemented method to print
	public void bark() {
		SimpleIO.println("A dog says Bark!");
	}
	
	//Abstract method for 'poop', but it does nothing here (unimplemented method). Hypothetically, different dogs poop differently.
	//In this case the superclass 'Dog' will have the method 'poop()', but the 'Object' to the superclass will determine the detail of how.
		//But Object 'Chihuahua' (class chihuahua) must give a method for 'poop()' when it is called below.
		//The Object 'Chihuahua' will then need an Unimplemented Method solution, or else it will get an error below.
	public abstract void poop();
}

//The chihuahua class ("Chihuahua" Object) will be the extend of the superclass Dog (Inheritance)
	//Automatically comes with the superclass "Dog" Attributes, such as 'String breed', and method 'bark()'.   
class Chihuahua extends Dog {
	//Calling 'poop()' method, and also giving a function for what will 'poop()' do.
		//By putting an unimplemented method solution to the Chihuahua object, in this case the method will only print
	public void poop() {
		SimpleIO.println("Dog Pooped!");
	}
	
}

//--------------------------------------------------------------------------------- SEPARATOR-------------------------------------------

//Interfaces, are just a list of abstract variable, attributes and abstract methods (Behavior only), but unimplemented only. Or else it gets an error.
	//Interface automatically assumes everything within the interface is abstract, and must not be implemented. (Only a list of attributes and methods)
interface LizardInterface {
	void eat();
	void poop();
	void run();
	void climb();
	
	//Putting an implemented method will not work
	/*
	public void attack() {
		SimpleIO.println("Lizard attacks");
	}
	
	public abstract void defend() {
		SimpleIO.println("Lizard defends");
	}
	*/
}

//Using the Lizard interface 
class Dragon implements LizardInterface {
	//Must implement all methods from the interface, else error.
	public void eat() {
		SimpleIO.println("Lizard eats");
	}
	
	public void poop() {
		// bla bla bla
		
	}

	public void run() {
		// bla bla bla
		
	}

	public void climb() {
		// bla bla bla
		
	}
}


/**
 * @author Makav
 *
 */
public class Abstract_Tutorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//The Cat() method below will not work as a regular method calling, because 'abstract class Cat' is different from 'class Cat'
		/*
		Cat c = new Cat();
		c.meow();
		*/
		
		//The Dog() method below will work through the chihuahua class method (Create a reference for Chihuahua to variable a, then initiating it)
			//The chihuahua will be called "a"
		Chihuahua a = new Chihuahua();
		
		a.bark();
		SimpleIO.println(a.breed); //This will print out "null" because it is not set yet, eventhough 'breed' in dog has a string variable to it
		
		//Calling the poop() method
		a.poop();
		
		

	}
	
	

}


