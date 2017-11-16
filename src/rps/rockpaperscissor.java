package rps;

import java.util.Random;
import java.util.Scanner;

public class rps {

	public static void main(String[] args) {
		
		Scanner usersChoice = new Scanner(System.in);
		System.out.println("Select Stone Sciccor or Paper");
		String usersPick = usersChoice.nextLine().toLowerCase();
		//System.out.println(usersPick);
		
		Random randomGenerator = new Random();
		int stoneSiccorBag = (int) randomGenerator.nextInt(3);
		
		
		
		if (stoneSiccorBag == 0) {
			System.out.println("Computer - Stone");
		} else if (stoneSiccorBag == 1){
			System.out.println("Computer - Siccor");
		} else {
			System.out.println("Computer - Paper");
		}
		
		
		
	}
	

}