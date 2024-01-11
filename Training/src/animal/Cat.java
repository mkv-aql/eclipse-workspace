package animal;

import de.tuhh.diss.io.SimpleIO;

public class Cat extends Mammal{
	//Attribute
	String breed;
	
	//Constructor
	public Cat(int legs, boolean tail, String name, int age, boolean haveFur, String breed) {
		super(legs, tail, name, age, haveFur);
		this.breed = breed;
	}
	
	//methods
	public void poop() {
		SimpleIO.println("Cat poops");
	}
	
	@Override
	public void makeSound() {
		SimpleIO.println("Meow! Meow!");
	}
	
	

}
