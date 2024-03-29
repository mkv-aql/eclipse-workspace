package de.tuhh.diss.shapes;

import de.tuhh.diss.io.SimpleIO;

public class MakeShapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1 = new Rectangle(5, 10, 25, 30);
		Rectangle r2 = new Rectangle(7, 12, 27, 32);
		
		System.out.println("Rectangle positions...............");
		r1.print();
		r2.print();
		
		System.out.println("Intersecting positions............");
		r1.getIntersection(r2).print();
		r2.getIntersection(r1).print();
		
		SimpleIO.println("Just for spacing");
		SimpleIO.println("");
		SimpleIO.println("");
		
		//Position of the rectangle is just touching sides
			//Bottom left position of plane coordinates
		r1 = new Rectangle(0, 0, -10, -10);
			//Top left position of plane coordinates
		r2 = new Rectangle(0, 0, -10, 10);
		
		r1.print();
		r2.print();
		
		r1.getIntersection(r2).print();
		r2.getIntersection(r1).print();
		
		SimpleIO.println("Just for spacing");
		SimpleIO.println("");
		SimpleIO.println("");
		
		
		//Position of the rectangle is just touching sides
		//Bottom left pos
		r1 = new Rectangle(-5, -5, 5, 5);
			//Top left pos
		r2 = new Rectangle(6, 6, 10, 10);
		
		r1.print();
		r2.print();
		
		//This will cause an error, because there is no overlap
		r1.getIntersection(r2).print();
		r2.getIntersection(r1).print();
		

	}

}
