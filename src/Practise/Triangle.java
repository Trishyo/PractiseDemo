package Practise;
public class Triangle extends Shape {
	public double firstSide, secondSide, base, height;

	public Triangle() {
		this.firstSide = 1;
		this.secondSide = 1;
		this.base = 1;
		this.height = 1;
	}

	public Triangle(double firstSide, double secondSide, double base) {
		this.firstSide = firstSide;
		this.secondSide = secondSide;
		this.base = base;
	}

	@Override
	public double computePerimeter() {
		// TODO Auto-generated method stub
		return firstSide + secondSide + base;
	}

	@Override
	public double computeArea() {
		// TODO Auto-generated method stub
		return (1.5 * base * height);
	}

}
