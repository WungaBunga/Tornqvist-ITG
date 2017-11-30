package lesson.ifstatements;

import java.util.Random;
import java.util.Scanner;

public class KronaKlave {

	private static Object usersPick;

	
	
	public static void main(String[] args) {
        // Coinflip som genererar ett random tal, 1 eller 0.
		Scanner usersGuess = new Scanner(System.in);
		System.out.println("V�lj Krona eller Klave");
		String userString = usersGuess.nextLine();
		System.out.println(userString);

		Random randomGenerator = new Random();

		boolean coinFlippValue = randomGenerator.nextBoolean();

		System.out.println(coinFlippValue);

		if (coinFlippValue == true) {
			System.out.println("Computer - Krona");
		} else {

			System.out.println("Computer - Klave");
		}

		
		if (coinFlippValue == true && usersPick.equals("True")) {
			
			System.out.println("Good Pick!");
		} else 	{
			System.out.println("Bad Choice!");
	}

	}
	
	
}

