package animal;

import de.tuhh.diss.io.SimpleIO;

public class Animal {
	//Attribute
	private int legs;
	private boolean tail;
	private String name;
	private int age;
	
	
	//Constructor
	public Animal(int legs, boolean tail, String name, int age) {
		this.legs = legs;
		this.tail = tail;
		this.name = name;
		this.age = age;
	}
	
	//Methods
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void makeSound() {
		SimpleIO.println("Rawr means I love u");
	}
}
