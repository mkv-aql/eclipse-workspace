package w3resource;

import de.tuhh.diss.io.SimpleIO;

public class Task6 {

	public static void main(String[] args) {
		SimpleIO.println(sum(12345));

	}
	
	public static int sum(int n) {
		int result = 0;
		
		while(n > 0) {
			result = result + n%10;
			n = n/10;
		}
		
		return result;
	}

}
