package warehouse;

public class Warehouse {
	//Attribute
	private double capacity;
	private double balance;
	
	//Constructor
	public Warehouse(double capacity) {
		this.capacity = capacity;
	}
	
	//Methods
	public double getBalance() {
		
		return this.balance;
	}
	
	public double getCapacity() {
		return this.capacity;
	}
	
	public double howMuchSpaceLeft() {
		double amount = 0;
		amount = this.capacity - this.getBalance();
		
		return amount;
	}
	
	public void addToWarehouse(double amount) {
		//this.balance.add(amount); //Not add, because it is not an array
		this.setBalance(this.getBalance() + amount);
	}
	
	public double takeFromWarehouse(double amount) {
		this.setBalance(this.getBalance() - amount);
		return amount;
	}
	
	public String toString() {
		String info = ""; 
		info = Double.toString(getBalance());
		return info;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
