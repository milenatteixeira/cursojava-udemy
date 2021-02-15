package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Main {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		List<Product> products = new ArrayList<>();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter the number of products: ");
		Integer quantity = input.nextInt();
		
		for(int i = 1; i <= quantity; i++) {
			System.out.print("Product #" + i + " data: \n");
			
			System.out.print("Common, used or imported (c/u/i)? ");
			char option = input.next().charAt(0);
			if(option != 'c' && option != 'u' && option != 'i') {
				System.out.print("Common, used or imported (c/u/i)? ");
				option = input.next().charAt(0);
			}
			
			input.nextLine();
			System.out.print("Name: ");
			String name = input.nextLine();
			System.out.print("Price: ");
			Double price = input.nextDouble();
			
			Product product;
			
			if(option == 'u') {
				input.nextLine();
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date manufactureDate = sdf.parse(input.nextLine());
				product = new UsedProduct(name, price, manufactureDate);
			}else if(option == 'i') {
				System.out.print("Customs fee: ");
				Double customsFee = input.nextDouble();
				product = new ImportedProduct(name, price, customsFee);
			}else {
				product = new Product(name, price);
			}
			
			products.add(product);
		}
		
		System.out.println("\nPRICE TAGS: ");
		
		for(Product product: products) {
			System.out.println(product.priceTag());
		}
		
		input.close();
	}

}
