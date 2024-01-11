package animal;

public class Mammal extends Animal{
	//Attributes
	private boolean haveFur;
	
	//Constructor
	public Mammal(int legs, boolean tail, String name, int age, boolean haveFur) {
		super(legs, tail, name, age);
		this.haveFur = haveFur;
		// TODO Auto-generated constructor stub
	}
	
	public boolean displayFurInfo() {
		return this.haveFur;
	}
	
}
