package de.tuhh.diss.bus;

public class Engine {
	// 1 Define 
	private int gear;
	private int power;
	private int gearNum; //Maximum number of gears
	
	// 2 define the engine with all variables
	public Engine(int chosen_gear, int chosen_power, int chosen_gearNum) {
		//power = chosen_power; [checking WISE18 assignment 6, without 'this.' will still work]
		//power = power;  //[If passing object/parameters is 'int power' (insted of chosen_power), then it will not do anything]
		this.power = chosen_power; 
		this.gear = chosen_gear;
		this.gearNum = chosen_gearNum;
	}
	
	
	// 3 Define all public methods 
	public int shift(int new_gear) {
		if (this.gear < gearNum && this.gear >= 0) {
			gear = gear + new_gear;
		}
		else {
			System.out.println("Gear limit reached, cannot change gear");
		}
		
		return 0; 
	}
	
	public void setPower(int new_power) {
		power = new_power;
		 
	}
	
	public int getSpeed() {
		int speed;
		speed = (this.gear * this.power) / this.gearNum;
		return speed;
	}
	
	public int currentGear() {
		System.out.println("Current gear is: " +this.gear);
		return gear;
	}
	
	public boolean gearExist(int check_gear) {
		if (check_gear > 0 && check_gear <= this.gearNum) {
			return true;
		}
		
		else {
			return false;
		}
		
	}


	

}
