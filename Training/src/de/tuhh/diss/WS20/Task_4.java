package de.tuhh.diss.WS20;

public class Task_4 {

	public static void main(String[] args) {
	    // Create a tree and a flower
	    Tree tree = new Tree("Oak", 10);
	    Flower flower = new Flower("Rose", 2, "red");

	    // Add them to an array
	    Plant[] plants = {tree, flower};

	    // Create a garden with the plants
	    Garden garden = new Garden(plants);

	    // Maintain the garden
	    garden.maintain();

	    // Add new seeds to the garden
	    garden.addSeeds("Tree", "Maple");
	}


}
