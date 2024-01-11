package de.tuhh.diss.assignment5678.WS18;

import de.tuhh.diss.io.SimpleIO;

public class CoffeeShop {
	private String name;

	CoffeeShop(String name) {
		this.name = name;
		SimpleIO.println("new coffee shop "+ name);
		}

	public Cup MakeCoffee(boolean large, boolean takeAway) {
		if (takeAway) {
			//Cup cup = new LockableCup(); [ORIGINAL]
			Cup cup = new Cup();
			} 
		else {
			Cup cup = new Cup();
			}

		Cup cup = new Cup(); //[ADDED CORRECTION]
		if (large) {
			cup.fill(Cup.MAX_LVL);
			} 
		else {
			cup.fill(Cup.MAX_LVL / 2);
			}
		return cup;
		}
	}
