package warehouse;

public class ProductWarehouseWithHistory extends ProductWarehouse {
	//Attribute
	
	//Constructor
	public ProductWarehouseWithHistory(String name, double capacity, double initialBalance) {
		super(name, capacity);
		
		
		setBalance(initialBalance);
		
		
	}
	/*
	public String history() {
		
	}
	*/
	
	public void printAnalysis() {
		System.out.println("Analysis");
	}
	
	public double takeFromWarehouse(double amount) {
		setBalance(getCapacity() - amount); 
		return amount;
	}
	
	public void addToWarehouse(double amount) {
		setBalance(getCapacity() + amount);
	}
}
