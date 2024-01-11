package de.tuhh.diss.bus;

public class Bus {
	// 1 define variables 
	private Engine chosen_engine; 
	private double total_distance;
	
	// 2 define the Bus with all varaibles
	public Bus(Engine chosen_engine) {
		total_distance = 0;
		this.chosen_engine = chosen_engine; 
		
		/*//Just for checking Exam WISE18 assignment 6, this works fine, possible solution is wrong.
		if (chosen_engine == null) {
			chosen_engine.setPower(chosen_engine.currentGear());
		}
		*/
	}
	
	// 3 Define all methods to be sent to Engine.java
	public int shiftUp() {
		return chosen_engine.shift(1);
	}
	
	//Just testing, behavior is the same as the result of shiftUp():int
	public void shiftUp2() {
		chosen_engine.shift(1);
	}
	
	public int shiftDown() {
		return chosen_engine.shift(-1);
	}
	
	public double drive(double time) {
		double session_distance = 0;
		session_distance = time * chosen_engine.getSpeed();
		total_distance = total_distance + session_distance; 
		return session_distance; 
	}
	
	public boolean checkGear(int check_gear) { 
		boolean a = chosen_engine.gearExist(check_gear);
		if (a == true) {
			System.out.println("Gear " +check_gear +" exists");
			return true;
		}
		else {
			System.out.println("Gear " +check_gear +" does not exist");
			return false;
		}
	}
	
	public int getDistance() {
		System.out.println("Total Distance travelled now: " +total_distance);
		return 0;
	}
	
	public int whatGear() {
		chosen_engine.currentGear();
		return 0;
	}

}
