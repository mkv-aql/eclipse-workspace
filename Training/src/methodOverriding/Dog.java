package methodOverriding;

public class Dog {
	//Subclass of Animal
	private Animal animal;
	//private variable for Dog
	private int avgSize = 20;
	private double moveSpeed = 3;
	
	public Dog(Animal animal) {
		this.animal = animal;
	}
	
	public void bark() {
		System.out.println("Dog Bark");
	}
	
	public void poop() {
		System.out.println("Dog poop");
	}

	public int getAvgSize() {
		System.out.println("Dog avg Size: ");
		return avgSize; 
	}
	
	
}
