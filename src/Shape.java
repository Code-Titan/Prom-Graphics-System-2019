import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

abstract class Shape {
	private double x;
	private double y;
	private int referenceNumber;

	public Shape(double x, double y) {
		this.x = x;
		this.y = y;
		this.referenceNumber = 0;
	}

	public Shape() {};

	abstract void draw(Graphics g, Color color); 
	
	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}  

	public void setX(double input) {
		this.x = input;
	}

	public void setY(double input) {
		this.y = input;
	}

	public int getReferenceNumber() {
		return referenceNumber;
	}

	public void setReferenceNumber(int referenceNumber) {
		this.referenceNumber = referenceNumber;
	}

	public abstract Rectangle getBoundingBox();
}
