package w3resource;

import de.tuhh.diss.io.SimpleIO;

public class Task4 {

	public static void main(String[] args) {
		SimpleIO.println(vowelCount("aeiou"));
		
		String a = "aeiou";
		String b = "aeiou";
		SimpleIO.println(a.substring(0,1));
		SimpleIO.println(a == a);
		SimpleIO.println(a == b);
		SimpleIO.println(a.equals(b));
		

	}
	
	public static int vowelCount(String s) {
		int count = 0;
		for (int i = 0;i<s.length();i++){
			String l = s.substring(i,i+1);
			if (l.equals("a") || l.equals("e") || l.equals("i") || l.equals("o") || l.equals("u")) {
				count = count + 1;
			}
			else {
				continue;
			}
			
			
			
		}
		
		
		return count;
	}

}
