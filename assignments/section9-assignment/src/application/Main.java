package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		Account account;
		
		System.out.print("Enter account number: ");
		int number = input.nextInt();
		
		System.out.print("Enter account holder: ");
		input.nextLine();
		String name = input.nextLine();		
		
		System.out.print("Is there an initial deposit (y/n)? ");
		char op = input.next().charAt(0);
		if(op=='n') {
			account = new Account(number, name);
		}else {
			System.out.print("Enter account initial deposit: ");
			double deposit = input.nextDouble();
			account = new Account(number, name, deposit);
		}
		
		System.out.println("\nAccount data: ");
		System.out.println(account);
		
		System.out.print("\nEnter a deposit value: ");
		double value = input.nextDouble();
		account.makeDeposit(value);
		
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		System.out.print("\nEnter a withdraw value: ");
		value = input.nextDouble();
		account.withdrawDeposit(value);
		
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		input.close();
	}

}
