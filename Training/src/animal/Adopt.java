package animal;

import de.tuhh.diss.io.SimpleIO;

public class Adopt {
	public static void main(String[] args) {
		Cat myCat = new Cat(4, true, "Anjing", 6, true, "wild");
		
		SimpleIO.println(myCat.displayFurInfo());
		
		myCat.setAge(8);
		
		
	}

}
