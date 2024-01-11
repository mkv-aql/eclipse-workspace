package de.tuhh.diss.SS19;

public class Task_5 {

	public static void main(String[] args) {
		 M m = new M();
		 A a1 = new A();
		 A a2 = new B(m);
		 a1.print();
		 a2.print();
		 m.print();
		 }

}
