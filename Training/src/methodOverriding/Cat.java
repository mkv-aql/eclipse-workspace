package methodOverriding;

public class Cat {
	//subclass of Animal
	private Animal animal;
	//private variable for Cat
	private int avgSize = 12;
	private double moveSpeed = 3;
	private double distance;
	
	public Cat(Animal animal) {
		this.animal = animal;
		this.distance = 0;
	}
	
	public void meow() {
		System.out.println("Meow Meow");
	}
	
	public int getAvgSize() {
		System.out.println(avgSize);
		return avgSize;
	}
	
	public void walk() {
		animal.walk(moveSpeed);
	}
	
	public double getDistance() {
		return animal.getDistance();
	}
	
	public boolean getTail() {
		return animal.getTail();
	}

	

}
