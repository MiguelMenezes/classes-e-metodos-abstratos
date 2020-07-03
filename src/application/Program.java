package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Shape;
import enums.Color;
import model.Circle;
import model.Rectangle;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Shape> list = new ArrayList<>();

		System.out.print("Enter the numer of shapes: ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {

			System.out.println("Shape #" + i + " data:");
			System.out.print("Rectangle or circle (r / c)? ");
			String type = sc.next();

			if (type.equalsIgnoreCase("R")) {

				System.out.print("Color (BLACK / BLUE / RED): ");
				String color = sc.next().toUpperCase();
				System.out.print("Width: ");
				double width = sc.nextDouble();
				System.out.print("Weight: ");
				double weight = sc.nextDouble();

				list.add(new Rectangle(Color.valueOf(color), width, weight));

			} else if (type.equalsIgnoreCase("C")) {

				System.out.print("Color (BLACK / BLUE / RED): ");
				String color = sc.next().toUpperCase();
				System.out.print("Radius: ");
				double radius = sc.nextDouble();

				list.add(new Circle(Color.valueOf(color), radius));

			} else {
				System.out.println("Invalid type. Try again!");
				i--;
			}

		}

		System.out.println("SHAPE AREAS: ");
		for (Shape sh : list) {
			System.out.printf("%.2f%n", sh.area());
		}

		sc.close();

	}

}
