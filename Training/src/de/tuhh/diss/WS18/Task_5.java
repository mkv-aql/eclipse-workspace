package de.tuhh.diss.WS18;

public class Task_5 {

	public static void main(String[] args) {
		 A a, b, c; //xa = ya = 0| xb = yb = 0| xc = yc = 0
		 a = new A(); // xa = ya = 1| xb = yb = 0| xc = yc = 0
		 b = a; // xa = ya = 1| xb = yb = 1| xc = yc = 0
		 a = new A(); // xa = ya = 2| xb = 2 yb = 1| xc = yc = 0
		 c = new B(); // extends A() | xa = 3 ya = 2| xb = 3 yb = 1| xc = yc = 3
		 a.print();
		 b.print();
		 c.print();
		 }

}
