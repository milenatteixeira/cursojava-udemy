package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		List<TaxPayer> taxPayers = new ArrayList<>();
		Double sum = 0.0;
		
		System.out.print("Enter the number of tax payers: ");
		Integer quantity = input.nextInt();
		
		for(int i = 1; i <= quantity; i++) {
			System.out.println("Tax payer #" + i + " data:");
			
			System.out.print("Individual or company (i/c)? ");
			char option = input.next().charAt(0);
			if(option != 'i' && option != 'c') {
				System.out.print("Individual or company (i/c)? ");
				option = input.next().charAt(0);
			}
			
			input.nextLine();
			System.out.print("Name: ");
			String name = input.nextLine();
			System.out.print("Anual Income: ");
			Double anualIncome = input.nextDouble();
			
			TaxPayer taxPayer;
			
			if(option == 'i') {
				System.out.print("Health expenditures: ");
				Double healthExpenditures = input.nextDouble();
				taxPayer = new Individual(name, anualIncome, healthExpenditures);
			}else {
				System.out.print("Number of employees: ");
				Integer numberOfEmployees = input.nextInt();
				taxPayer = new Company(name, anualIncome, numberOfEmployees);
			}
			
			taxPayers.add(taxPayer);			
		}
		
		System.out.println("\nTAXES PAID: ");
		for(TaxPayer taxPayer: taxPayers) {
			System.out.println(taxPayer);
		}
		
		for(TaxPayer taxPayer: taxPayers) {
			sum += taxPayer.tax();
		}
		
		System.out.println("\nTOTAL TAXES: $ " + String.format("%.2f", sum));
		
		input.close();
	}
}
