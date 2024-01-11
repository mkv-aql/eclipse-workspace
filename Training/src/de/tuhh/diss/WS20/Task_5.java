package de.tuhh.diss.WS20;

public class Task_5 {

	public static void main(String arg[]) {
		 Drink[] drinks = { new Coffee(100, 2), new Drink(250),
		 new Spirit(20, 40), new Drink(150) };
		 Person p = new Person();
		 for (int i = 0; i < drinks.length; i++) {
		 drinks[i].serve(p);
		 }
		 p.getStatus();
		 }

}
