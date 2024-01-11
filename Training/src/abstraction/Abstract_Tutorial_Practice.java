package abstraction;

import de.tuhh.diss.io.SimpleIO;


//Interface
interface Movable{
	void move();
}

//Abstract class
abstract class Animal{
	abstract void eat();
	
	public void jump() {
		SimpleIO.println("Animal jumps");
	}
}

//Concrete class (connect them, and also can be instantiated)
	//Cannot use Dog because Dog already exist in the same package 'abstraction' from another class 'Abstract_Tutorial'
//class Dog extends Animal implements Movable{
class Snake extends Animal implements Movable{
	
	//Unimplemented method
	@Override
	void eat() {
		SimpleIO.println("Snake Eats");
		
	}
	
	public void move() {
		SimpleIO.println("Snake Moves");
	}
	
}

public class Abstract_Tutorial_Practice {

	public static void main(String[] args) {
		SimpleIO.println("");
		Snake d = new Snake();
		d.eat();
		d.move();
		d.jump();
		
		//Animal a = new Animal(); //Will get an error, because Animal is abstract, and cannot make an object out of it

	}

}
