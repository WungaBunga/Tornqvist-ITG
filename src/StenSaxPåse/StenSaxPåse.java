package StenSaxPåse;

import java.util.Random;
import java.util.Scanner;

public class StenSaxPåse {

	public static void main(String[] args) {
		
		Scanner usersChoice = new Scanner(System.in);
		System.out.println("Select Stone Scissor or Paper");
		String usersPick = usersChoice.nextLine().toLowerCase();
		//System.out.println(usersPick);
		
		Random randomGenerator = new Random();
		int stoneSiccorBag = (int) randomGenerator.nextInt(3);
		
		
	    // 
		if (stoneSiccorBag == 0) {
			System.out.println("Computer - Stone");
		} else if (stoneSiccorBag == 1){
			System.out.println("Computer - Sissor");
		} else {
			System.out.println("Computer - Paper");
		}
		
		
		
	}
	

}