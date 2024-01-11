package warehouse;

public class ProductWarehouse extends Warehouse {
	//Attributes
	private String name;
	
	//Constructors
	public ProductWarehouse(String name, double capacity) {
		super(capacity);
		this.name = name;
		
	}
	
	//Methods
	public String getName() {
		return this.name;
	}
	
	public String setName(String name) {
		this.name = name;
		return this.name;
	}
	
	public String toString() {
		String info = ""; 
		info = Double.toString(getCapacity());
		return info;
	}
	

}
