/** 2. Write Java program to allow the user to input his/her age. Then the program will show 
*    if the person is eligible to vote. A person who is eligible to vote must be older than 
*    or equal to 18 years old. 
*/



package ifsatser.willy;

import java.util.Scanner;

public class ifsatser3 {

	public static void main(String[] args) {
	
		for (;;) {
			
		Scanner userScanner = new Scanner(System.in);
		
		System.out.println("Hur gammal är du?");
		
		int userNumber = userScanner.nextInt();
		
		if (userNumber == 18 || userNumber > 18) {
		
		System.out.println("Du får rösta!");
			
	} else {
		
		System.out.println("Du får ej rösta");
		
	 		}	
		}
	}
}