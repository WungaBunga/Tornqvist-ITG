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
	public float getLenght() {
		return this.length;
	}
	public void setLength(float length) {
		this.length = length;
	}
	public float getWidth() {
		return width;
	}
	public void setWidth(float width) {
		this.width = width;
	}
	public double getArea() {
		return length * width;
	}
	public double getPerimeter() {
		return 2 * (this.length * this.width);
	}
	public String toString() {
		return "Rectangle[Length=" + this.length + length + ", width" + width + "]";
	}
	
}












