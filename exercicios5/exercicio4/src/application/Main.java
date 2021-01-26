package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		CurrencyConverter.dollarPrice = input.nextDouble();
		System.out.print("How many dollars will be bought? ");
		
		double quantity = input.nextDouble();		
		double amount = CurrencyConverter.dollarPayment(quantity);
		
		System.out.println("Amount to be paid in reais = " + String.format("%.2f", amount));
		input.close();
	}

}
