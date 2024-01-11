package w3resource;

import de.tuhh.diss.io.SimpleIO;

public class Task3 {

	public static void main(String[] args) {
		SimpleIO.println(middle("abcde"));
		SimpleIO.println(middle("Render"));

	}
	
	
	public static String middle(String s) {
		String middle;
		if ((s.length() % 2) == 0) {
			int middle1 = s.length() / 2;
			int middle2 = (s.length() / 2);
			//SimpleIO.println(middle1 +" " +middle2);
			//SimpleIO.println(s.length());
			middle = s.substring(middle1 - 1, middle2 + 1);
		}
		else {
			int middle1 = s.length()/2;
			middle = s.substring(middle1, middle1 + 1);
		}
		
		return middle;
	}

}
