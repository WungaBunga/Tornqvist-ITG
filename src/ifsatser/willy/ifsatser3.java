package ifsatser.willy;

import java.util.Scanner;

public class ifsatser3 {

	public static void main(String[] args) {
	
		for (;;) {
			
		Scanner userScanner = new Scanner(System.in);
		
		System.out.println("Vänligen skriv in din ålder! Är du under 20 får du ej köpa våra produkter!");
		
		int userNumber = userScanner.nextInt();
		
		if (userNumber == 20 || userNumber > 20 ) {
		
		System.out.println("Tack! Välkommen till Systembolaget!");
			
	} else {
		
		System.out.println("Du får ej handla på Systembolaget!");
		
	 		}	
		}
	}
}