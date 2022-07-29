package de.tuhh.diss.car;

import de.tuhh.diss.io.SimpleIO;

//A driver is testing 3 different trucks
public class Truck_Driver {

	public static void main(String[] args) {
		//The Engine3 gear and power can be manipulated here, through 'e'
		Engine3 e = new Engine3(3, 100);
			//First truck 't1' is fixed to having only 100 'power' and 'gear' 0
		Truck t1 = new Truck();
			//2nd truck 't2' is editable 200 'power' and fixed 'gear' 0
		Truck t2 = new Truck(200);
			//3rd truck 't3' is editable through 'e', both 'gear' and 'power' can be changed. In this case, (3, 100) is chosen.
		Truck t3 = new Truck(e);
		
		
		
	}

}
