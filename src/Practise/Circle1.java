package Practise;
public class Circle1 extends Shape {
	private double radius;
	final double pi = Math.PI;

	public Circle1() {
		this.radius = 1;
	}

	public Circle1(double radius) {
		this.radius = radius;
	}

	@Override
	public double computePerimeter() {
		// TODO Auto-generated method stub
		return (2 * pi * radius);
	}

	@Override
	public double computeArea() {
		// TODO Auto-generated method stub
		return (pi * Math.pow(radius, 2));
	}

}
