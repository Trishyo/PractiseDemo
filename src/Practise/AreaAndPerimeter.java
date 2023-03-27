package Practise;

import java.util.Scanner;

public class AreaAndPerimeter {

	public static void main(String[] args) {
		AreaAndPerimeter a = new AreaAndPerimeter();
		a.rectangle();
		a.circle();
		a.triangle();
	}

	public void rectangle() {
		Scanner sc = new Scanner(System.in);
		double length = sc.nextDouble();
		double breadth = sc.nextDouble();
		double area = length * breadth;
		double perimeter = 2 * (length + breadth);
		System.out.println("This is the Area of the rectangle : " + area);
		System.out.println("This is the Perimeter of the rectangle : " + perimeter);

	}

	public void circle() {
		Scanner sc = new Scanner(System.in);
		double radius = sc.nextDouble();
		double perimeter = 2 * Math.PI * radius;
		double area = Math.PI * radius * radius;
		System.out.println("This is the Perimeter of the circle : " + perimeter);
		System.out.println("This is the Area of the Circle : " + area);
	}

	public void triangle() {
		Scanner sc = new Scanner(System.in);
		double perpendicular = sc.nextDouble();
		double base = sc.nextDouble();
		double hypotenuse = sc.nextDouble();
		double perimeter = perpendicular + base + hypotenuse;
		double area = Math.sqrt(perimeter / 2 * (perimeter / 2 - perpendicular) * (perimeter / 2 - base)
				* (perimeter / 2 - hypotenuse));
		System.out.println("This is the perimeter of the triangle : " + perimeter);
		System.out.println("This is the area of the triangle : " + area);
	}

}
