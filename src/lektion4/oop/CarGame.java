package lektion4.oop;

import lektion5.konstruktorer.Car;

public class CarGame {

	public static void main(String[] args) {
		Car audi = new Car();
		
		System.out.println(audi.getSpeed());
		
		audi.setSpeed(350);
		
		System.out.println(audi.getSpeed());
		

	}

}
