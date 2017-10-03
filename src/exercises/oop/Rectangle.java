package exercises.oop;

public class Rectangle {
	private float length = 1.0f;
	private float width = 1.0f;

	public Rectangle() {
		System.out.println(this.length);	
		}
	public Rectangle(float length, float widht) {
		this.length = length;
		this.width = width;
		}
}