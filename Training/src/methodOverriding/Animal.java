package methodOverriding;

public class Animal {
	private int legNum;
	private boolean tail;
	private double distance;
	
	public Animal(int legNum, boolean tail) {
		this.legNum = legNum;
		this.tail = tail;
		this.distance = 0;
	}
	
	public void eat() {
		System.out.println("Nom Nom!!");
	}
	
	public int getLegNum() {
		return this.legNum;
	}
	
	public boolean getTail() {
		System.out.println("Tail? " +this.tail);
		return this.tail;
	}
	
	public void walk(double moveSpeed) {
		this.distance = this.distance + moveSpeed;
	}
	
	public double getDistance() {
		System.out.println(this.distance);
		return this.distance;
	}
	

}
