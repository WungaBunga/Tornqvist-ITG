package lektion4.oop;

public class CarGame {

	public static void main(String[] args) {
		Car audi = new Car();
		
		System.out.println(audi.getSpeed());
		
		audi.setSpeed(350);
		
		System.out.println(audi.getSpeed());
		

	}

}
