package methodOverriding;

public class Persian extends Cat{
	
	
	public Persian(Animal animal) {
		super(animal);
		
	}


	int avgSize = 4;
	
	
	public void meow() {
		System.out.println("Egyption meow!");
	}
	
	public int getAvgSize() {
		System.out.println(avgSize);
		return avgSize;
	}
}
