package multipleChoice;

import java.util.Scanner;

public class MultipleChoice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[] answers = {"c","d","b"};
		String[] responses = {"", "",""};
		
		System.out.println("What is 2 + 2?");
		System.out.println("a: 2");
		System.out.println("b: 3");
		System.out.println("c: 4");
		System.out.println("d: 5");
		
		System.out.println("What is 2 + 3?");
		System.out.println("a: 2");
		System.out.println("b: 3");
		System.out.println("c: 4");
		System.out.println("d: 5");
		
		System.out.println("What is -2 + 5?");
		System.out.println("a: 2");
		System.out.println("b: 3");
		System.out.println("c: 4");
		System.out.println("d: 5");
		
		responses[0] = scan.next();
		responses[1] = scan.next();
		responses[2] = scan.next();
		
		System.out.println(responses[0]);
		System.out.println(responses[1]);
		System.out.println(responses[2]);
		
		int score = 0;
		
		for (int i = 0; i < 3; i++) {
			// equalsIgnoreCase will ignore small or capital letters
			if (responses[i].equalsIgnoreCase(answers[i])) {
				score++;
			}
		}
		
		System.out.println("Score: " +score);
	}

}
