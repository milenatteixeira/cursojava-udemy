package application;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.TimeZone;

public class Main {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));

        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        String name = input.nextLine();
        System.out.print("Email: ");
        String email = input.nextLine();
        System.out.print("Birth data (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(input.nextLine());
        Client client = new Client(name, email, birthDate);

        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        String status = input.nextLine();
        System.out.print("How many items to this order? ");
        Integer quantity = input.nextInt();
        Order order = new Order(new Date(), OrderStatus.valueOf(status), client);

        for(int i = 1; i<=quantity; i++){
            input.nextLine();
            System.out.printf("Enter #%d item data: \n", i);
            System.out.print("Product name: ");
            String productName = input.nextLine();
            System.out.print("Product price: ");
            Double productPrice = input.nextDouble();
            System.out.print("Quantity: ");
            Integer productQuantity = input.nextInt();
            Product product = new Product(productName, productPrice);
            OrderItem orderItem = new OrderItem(productQuantity, product);
            order.addItem(orderItem);
        }
        System.out.println(order);
        input.close();
    }
}