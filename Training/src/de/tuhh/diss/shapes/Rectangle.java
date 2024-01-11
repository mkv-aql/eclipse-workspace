package de.tuhh.diss.shapes;

import de.tuhh.diss.io.SimpleIO;

public class Rectangle {
	private CoordinateXY pos1;
	private CoordinateXY pos2;
	private CoordinateXY center;
	
	public Rectangle(int centerX, int centerY, int sizeX, int sizeY) {
		//position calculation
		int coordinate_x = centerX - sizeX/2;
		int coordinate_y = centerY - sizeY/2;
		this.pos1 = new CoordinateXY(coordinate_x, coordinate_y);
		
		coordinate_x = centerX + sizeX/2;
		coordinate_y = centerY + sizeY/2;
		this.pos2 = new CoordinateXY(coordinate_x, coordinate_y);
		
		this.center = new CoordinateXY(centerX, centerY);
	}
	
	// called by a rectangle and takes in another rectangle as a reference
	public Rectangle getIntersection(Rectangle reference_rectangle) {
		int x0, x1, y0, y1;
		x0 = Math.max(pos1.getX(), reference_rectangle.pos1.getX());
		y0 = Math.max(pos1.getY(), reference_rectangle.pos1.getY());
		x1 = Math.min(pos2.getX(), reference_rectangle.pos2.getX());
		y1 = Math.min(pos2.getY(), reference_rectangle.pos2.getY());
		if (x0 > x1 || y0 > y1) {
			System.out.println("Rectangles are not overlapping");
			return reference_rectangle;
		}
		else {
			System.out.println("Rectangles are overlapping");
			return reference_rectangle;
		}	
	}
	
	public void print() {
		SimpleIO.println("Rectangle coordinates: ");
		SimpleIO.println("Bottom Left: " +pos1.getX() +", " +pos1.getY() +"");
		SimpleIO.println("Top Right: " +pos2.getX() +", " +pos2.getY() +"");
	
	}
	
	
}
