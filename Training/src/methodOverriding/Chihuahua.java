package methodOverriding;

public class Chihuahua extends Dog {
	
	//Constructor
	public Chihuahua(Animal animal) {
		super(animal);
		// TODO Auto-generated constructor stub
	}

	int avgSize = 5;
	
	public void bark() {
		System.out.println("Chihuahua Bark");
	}
	
	public int getAvgSize() {
		System.out.println(avgSize);
		return avgSize; 
	}

}
