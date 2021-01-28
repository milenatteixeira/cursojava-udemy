package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		Student[] vect = new Student[10];
		
		System.out.print("How many rooms will be rented? ");
		int quantity = input.nextInt();
		
		for(int i = 0; i<quantity; i++) {
			input.nextLine();
			
			System.out.printf("\nRent #%d:", i+1);
			
			System.out.print("\nName: ");
			String name = input.nextLine();
			System.out.print("Email: ");
			String email = input.nextLine();
			System.out.print("Room: ");
			int room = input.nextInt();
			
			vect[room] = new Student(name, email, room);
		}
		
		System.out.println("\nBusy rooms:");
		for(int i = 0; i<vect.length; i++) {
			if(vect[i]!=null) {
				System.out.println(vect[i]);
			}
		}
		
		input.close();
	}

}
