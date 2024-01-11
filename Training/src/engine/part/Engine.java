package engine.part;

public class Engine extends Part {
	//Attributes
	private String type;
	
	//Constructor
	public Engine(String id, String manufacturer, String description, String type) {
		super(id, manufacturer, description);
		this.type = type;
	}

}
