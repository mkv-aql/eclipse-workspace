package de.tuhh.diss.person;

import java.util.ArrayList;

public class Book2 {
	private String name;
	private String publisher;
	private ArrayList<Person> authors;
	
	//Constructor
	public ArrayList<Person> getAuthors(){
		return this.authors;
	}
	
	public void addAuthor(Person author) {
		this.authors.add(author);
	}
	

}
