package ifsatser.willy;

import java.util.Scanner;

public class ifsatser3 {

	public static void main(String[] args) {
	
		for (;;) {
			
		Scanner userScanner = new Scanner(System.in);
		
		System.out.println("V�nligen skriv in din �lder! �r du under 20 f�r du ej k�pa v�ra produkter!");
		
		int userNumber = userScanner.nextInt();
		
		if (userNumber == 20 || userNumber > 20 ) {
		
		System.out.println("Tack! V�lkommen till Systembolaget!");
			
	} else {
		
		System.out.println("Du f�r ej handla p� Systembolaget!");
		
	 		}	
		}
	}
}