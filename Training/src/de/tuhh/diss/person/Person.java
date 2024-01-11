package de.tuhh.diss.person;

import java.util.ArrayList;

public class Person {
	private String name;
	private int age; 
	//private Book book; //This will show that a Person can have only 1 book, made out of Book.
	private ArrayList<Book> book; // this means a Person can have more than 1 book.
	
	public Person(String initialName, int age) {
		this.name = initialName;
		this.age = age;
	}
	
	public void printPerson() {
		System.out.println("NAME: " +this.name +"AGE: " +this.age);
	}
	
	public String getName() {
		return this.name;
	}

}
