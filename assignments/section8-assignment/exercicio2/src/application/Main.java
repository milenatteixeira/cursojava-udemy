package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		Employee employee = new Employee();
		
		System.out.print("Name: ");
		employee.name = input.nextLine();
		System.out.print("Gross salary: ");
		employee.grossSalary = input.nextDouble();
		System.out.print("Tax: ");
		employee.tax = input.nextDouble();
		
		System.out.println(employee);
		
		System.out.print("\nWhich percentage to increase salary? ");
		double percentage = input.nextDouble();
		
		employee.increaseSalary(percentage);
		System.out.println("\nUpdated data: " + employee.name + ", $ " + String.format("%.2f", employee.netSalary()));
		
		input.close();
	}

}
