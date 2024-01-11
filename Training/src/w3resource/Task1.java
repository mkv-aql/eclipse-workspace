package w3resource;

import de.tuhh.diss.io.SimpleIO;

public class Task1 {

	public static void main(String[] args) {
		SimpleIO.println("1: ");
		int one = SimpleIO.readInt();
		
		SimpleIO.println("2: ");
		int two = SimpleIO.readInt();
		
		SimpleIO.println("3: ");
		int three = SimpleIO.readInt();
		
		int[] array = {one, two, three};
		
		System.out.println(smallestNumber(array));
		
		
		
	}
	
	public static int smallestNumber(int[] array) {
		int smallest = array[0];
		for (int i = 0; i<array.length; i++) {
			if (smallest > array[i]) {
				smallest = array[i];
			}
			else {
				i++;
			}

		}
		
		return smallest;
	}

}
