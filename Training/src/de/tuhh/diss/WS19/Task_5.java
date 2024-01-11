package de.tuhh.diss.WS19;

public class Task_5 {

	public static void main(String[] args) {
		 Fruit f = new Apple(0), g;
		 f.eat();
		 Banana b = new Banana();
		 b.eat();
		 g = f;
		 f = new Banana();
		 }

}
