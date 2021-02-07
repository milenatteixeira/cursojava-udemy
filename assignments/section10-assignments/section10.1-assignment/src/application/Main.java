package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		List<Employee> employees = new ArrayList<>();
		Employee employee;
		
		System.out.print("How many employees will be registered? ");
		Integer quantity = input.nextInt();
		
		for(int i = 0; i < quantity; i++) {			
			System.out.printf("\nEmployee #%d: ", i+1);
			System.out.print("\nId: ");
			int id = input.nextInt();
			System.out.print("Name: ");
			input.nextLine();
			String name = input.nextLine();
			System.out.print("Salary: ");
			double salary = input.nextDouble();
			employee = new Employee(id, name, salary);
			employees.add(employee);
		}
		
		System.out.print("\nEnter the employee id that will have salary increase: ");
		int id = input.nextInt();
		System.out.print("Enter the percentage: ");
		double percentage = input.nextDouble();
		
		for(Employee x: employees) {
			if(x.getId()==id) {
				x.increaseSalary(percentage);
			}
		}
		
		for(Employee x: employees) {
			System.out.println(x);
		}

		input.close();
	}

}
