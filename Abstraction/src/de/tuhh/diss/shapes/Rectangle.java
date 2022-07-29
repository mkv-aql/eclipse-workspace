/**
 * 
 */
package de.tuhh.diss.shapes;

import de.tuhh.diss.io.SimpleIO;

/**
 * @author Makav
 *
 */
public class Rectangle {
	private CoordinateXY p0; //Bottom left. //If a class is used for declaration, then it must be defined below
	private CoordinateXY p1; //Top right
	
	//'SimpleIO.println(Math.min(a, b));' will print out the minimum number between 'a' and 'b'
	
	public Rectangle(int x0, int y0, int x1, int y1) {
		this.p0 = new CoordinateXY((Math.min(x0, x1)), (Math.min(y0, y1))); //To get the min(x,y)
		this.p1 = new CoordinateXY((Math.max(x0, x1)), (Math.max(y0, y1))); //To get the max(x,y)
	}
	
	//'Rectangle(CoordinateXY)' needs to be defined
	public Rectangle(CoordinateXY p0, CoordinateXY p1) {
		this(p0.getX(), p0.getY(), p1.getX(), p1.getY());
	}
	
	public Rectangle getIntersection(Rectangle rectangle) {
		int x0, x1, y0, y1;
		x0 = Math.max(p0.getX(), rectangle.p0.getX());
		y0 = Math.max(p0.getY(), rectangle.p0.getY());
		x1 = Math.min(p1.getX(), rectangle.p1.getX());
		y1 = Math.min(p1.getY(), rectangle.p1.getY());
		if (x0 > x1 || y0 > y1) {
			return null;
		}
		return new Rectangle(x0, y0, x1, y1);
	}
	
	public void print() {
		SimpleIO.println("Rectangle coordinates: ");
		SimpleIO.println("Bottom Left: " +p0.getX() +", " +p0.getY() +"");
		SimpleIO.println("Top Right: " +p1.getX() +", " +p1.getY() +"");
	}

}
