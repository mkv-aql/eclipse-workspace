package methodOverriding;

public class MetthodOverriding {

	public static void main(String[] args) {
		
		Animal a = new Animal(4, true);
		Cat d = new Cat(a);
		d.meow();
		d.walk();
		d.walk();
		d.walk();
		d.getDistance();
		d.getAvgSize();
		d.getTail();
		
		System.out.println("");
		System.out.println("");
		
		Animal x = new Animal(4, false);
		Cat y = new Persian(x);
		y.meow();
		y.walk();
		y.walk();
		y.walk();
		y.getDistance();
		y.getAvgSize();
		y.getTail();
		
		
		System.out.println("");
		System.out.println("");
		
		
		Chihuahua c = new Chihuahua(a);
		c.bark();
		c.poop();
		
		
		//Overriding
		Dog e = new Chihuahua(a);
		e.bark();
		e.poop();
		
		
		System.out.println(d.getAvgSize()); //Cat
		System.out.println(c.getAvgSize()); //Chihuahua
		
		//Overrriding
		System.out.println(e.getAvgSize()); //Chihuahua
		
		

	}

}
