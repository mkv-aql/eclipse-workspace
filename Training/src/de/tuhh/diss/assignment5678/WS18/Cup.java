package de.tuhh.diss.assignment5678.WS18;

public class Cup {
	//private final static int MAX_LVL = 500; //[ORIGINAL], not visible to classes outside of class Cup
	public final static int MAX_LVL = 500; // [CORRECTION], now it is visible in CoffeShop.java
	
	private int fillLvl; 

	public Cup() {
		//fillLvl = 0.0; //[ORIGINAL]
		fillLvl = 0; //[ADDED CORRECTION]
		}

	public int fill(int amount) {
		if (amount > MAX_LVL - fillLvl) {
			amount = MAX_LVL - fillLvl; //semantic error line, if the amount poured in is more than Max - fill_level (left over space), it will overflow and become Max.
			fillLvl = MAX_LVL;
			} 
		else {
			fillLvl += amount;
			}
		return amount;
		}

	public int drink(int amount) {
		if (amount > fillLvl) {
			amount = fillLvl; //Semantic error line, if the drink amount is more than what is left, then fill_level would be empty after drinking.
			//fillLvl = 0.0; //[ORIGINAL]
			fillLvl = 0; //[ADDED CORRECTION]
			} else {
				fillLvl -= amount;
				}
		return amount;
		}
	
	public int checkLvl() {
		System.out.println(this.fillLvl);
		return this.fillLvl;
	}
	
	}
