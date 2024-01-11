package de.tuhh.diss.assignment5678.WS18;

public class Customer {
	public static void main(String[] args) {
		CoffeeShop a = new CoffeeShop("Starbucks");
		
		Cup b = a.MakeCoffee(true, true);
		
		b.drink(50);
		b.checkLvl();
		b.drink(460);
		b.checkLvl();
		b.fill(700);
		b.checkLvl();
	}

}
