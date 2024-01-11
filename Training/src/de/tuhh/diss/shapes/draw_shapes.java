package de.tuhh.diss.shapes;

public class draw_shapes {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(4, 5, 8, 4); //centre x, center y, size x, size y
		Rectangle r2 = new Rectangle(0, 1, 4, 8);
		Rectangle r3 = new Rectangle(-8, -8, 8, 4);
		
		System.out.println("Printing rectangle coordinates________________");
		r1.print();
		r2.print();
		
		System.out.println("Printing intersections________________");
		r1.getIntersection(r2);
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		System.out.println("Printing rectangle coordinates________________");
		r3.print();
		
		System.out.println("Printing intersections________________");
		r2.getIntersection(r3);
	}
}
