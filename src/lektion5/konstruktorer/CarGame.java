package lektion5.konstruktorer;

public class CarGame {

	public static void main(String[] args) {
		/**
		 * 
		 * @param args
		 */
		Car audi = new Car("green");
		// Creats an object of a car som vi ger färgen dark green
		System.out.println(audi.getSpeed());
		// skriver ut och hämtar bilens hastighet
		audi.setSpeed(350);
		// sätter bilens hastiget
		System.out.println(audi.getSpeed());
		// skriver ut och hämtar bilens hastighet igen
	
	}

}
