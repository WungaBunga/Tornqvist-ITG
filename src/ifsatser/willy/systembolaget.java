package ifsatser.willy;

import java.util.Scanner;

	public static void main(String[] args) {
	
		for (;;) {
			
		Scanner userScanner = new Scanner(System.in);
		
		System.out.println("Skriv in ditt personnummer!");
		
		int userNumber = userScanner.nextInt();
		
		if (userNumber == 19990101 || userNumber > 19990101) {
		
		System.out.println("Tack! V�lkommen till Systembolaget.	");
			
	} else {
		
		System.out.println("Du f�r ej r�sta");
		
	 	}	
	}
}