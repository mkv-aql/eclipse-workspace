package w3resource;

import de.tuhh.diss.io.SimpleIO;

public class Task2 {

	public static void main(String[] args) {
		SimpleIO.println("1:");
		double one = SimpleIO.readDouble();
		SimpleIO.println("2:");
		double two = SimpleIO.readDouble();
		SimpleIO.println("3:");
		double three = SimpleIO.readDouble();
		
		double[] array = {one, two, three};
		
		SimpleIO.println(average(array));

	}
	
	
	public static double average(double[] array) {
		double sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}
		
		return sum/array.length;
	}

}
