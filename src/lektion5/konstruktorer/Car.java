package lektion5.konstruktorer;

public class Car {
	private int numberOfDoors = 4;
	private int numberOfWheels = 4;
	private String color = "blue";
	private int antaletRattar = 1;
	private String carBrand = "Audi";
	private int speed = 0;

	/**
	 * Konstruktor f�r Bil classen S�tter f�rgen p� bilen vid skapande.
	 */
	public Car(String selectedColor) {
		color = selectedColor;

	}
	/**
	 * S�tter hastigheten p� Car
	 * @param newSpeed
	 */
	public void setSpeed(int newSpeed) {
		speed = newSpeed;
	}

	public int getSpeed() {
		return speed;
	}

	public void setColor(String newColor) {
		color = newColor;
	}

	public String getColor() {
		return color;

	}
}






