package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		Rectangle rectangle = new Rectangle();
		
		System.out.println("Enter rectangle wight and height: ");
		rectangle.width = input.nextDouble();
		rectangle.height = input.nextDouble();
		
		System.out.println(rectangle);
		
		input.close();
	}

}
