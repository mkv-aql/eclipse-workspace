package abstraction;

import de.tuhh.diss.io.SimpleIO;

//Interface, to be used when to specify the behavior a particular data type, but not concern who implements it. Also to take advantage of multiple inheritance.
interface Pet{
	void feed();
	void hug();
	void run(int m);
}

//Concrete class (connect them, and also can be instantiated)
class Cat1 implements Pet{
	public void feed() {
		SimpleIO.println("Cat gets feeded");
	}
	
	public void hug() {
		SimpleIO.println("Cat hugs owner");
	}
	
	public void run(int m) {
		SimpleIO.println("Cat runs " +m +"m");
	}
	
	public void jump() {
		SimpleIO.println("Cat Jumps");
	}
}

class Parrot implements Pet{
	public void feed() {
		SimpleIO.println("Parrot gets feeded");
	}
	
	public void hug() {
		SimpleIO.println("Parrot hugs owner");
	}
	
	public void run(int m) {
		SimpleIO.println("Parrot runs " +m +"m");
	}
	
	public void fly() {
		SimpleIO.println("Parrot flies");
	}
}



public class From_diss {


	public static void main(String[] args) {
		SimpleIO.println("");
		
		Cat1 c = new Cat1();
		c.feed();
		
		Parrot p = new Parrot();
		p.hug();
		
		c.run(35);
		p.run(12);
		
		c.jump();
		p.fly();
		
		
		

	}

}
