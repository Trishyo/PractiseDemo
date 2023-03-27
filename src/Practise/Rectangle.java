package Practise;
public class Rectangle extends Shape {
	private double breadth, length;

	public Rectangle() {
		this.breadth = 1;
		this.length = 1;

	}

	public Rectangle(double breadth, double length) {
		this.breadth = breadth;
		this.length = length;
	}

	@Override
	public double computePerimeter() {
		// TODO Auto-generated method stub
		return 2 * (breadth + length);
	}

	@Override
	public double computeArea() {
		// TODO Auto-generated method stub
		return breadth * length;
	}

}
