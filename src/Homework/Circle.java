package Homework;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Fix a Radius for the Circle: ");
		double radius = input.nextDouble();
		System.out.println("Perimeter of the circle = " + (2 * radius * Math.PI));
		System.out.println("Area of the circle = " + (Math.PI * radius * radius));

	}

}
