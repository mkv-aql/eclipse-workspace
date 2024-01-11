package de.tuhh.diss.assignment5678.WS18;

import de.tuhh.diss.io.SimpleIO;

public class A { 
	private static int x = 0; //x is a class level variable (global, any method will change the value)
	private int y; //[ORIGINAL] y is a instance level variable (instance to the class that calls it, it will only change the value in that class)
					// in this case the class the calls them are A a, A b, A c
	//private static int y;

	public A() {
		y = ++x;
		}

	public void print() {
		print("A");
		}

	protected void print(String src) {
		//SimpleIO.println(src +": "+ x +", "+ y); //[ORIGINAL]
		SimpleIO.println(src +": x = "+ x +", y = "+ y);
		}

	public static void main(String[] args) {
	A a, b, c;
	a = new A(); // x = 1 for global, y = 1 for A a
	b = a; // x = 1 for global, y = 1 for A b
	a = new A(); // x = 2 for global, y = 2 for A a
	c = new B(); // x = 3 for global, y = 1 for A c, but B() extends A, so whatever the variables are currently will be continued by c.
	// The final values: x = 3 for global (x = 3 for every class instance)
	// y is ran 2x in a, 1x in b, 2x (from 2x A()) + 1x  in c.
	// therefore y = 2 in a, y = 1 in b; y = 3 in c.
	
	a.print();
	b.print();
	c.print();
	a.print("D");
	
	//experiment
	int i = 0;
	int j = 0;
	i++;
	++j;
	i++;
	++j;
	System.out.println(i);
	System.out.println(j);
	
	i = 0;
	j = 0;
	int k = 0;
	int l = 0;
	
	k = i++;
	l = ++j;
	System.out.println(k);
	System.out.println(l);
	
	}
	}