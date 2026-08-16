package com.renan.composicao.order.application;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import com.renan.composicao.order.entities.Client;
import com.renan.composicao.order.entities.Order;
import com.renan.composicao.order.entities.OrderItem;
import com.renan.composicao.order.entities.Product;
import com.renan.composicao.order.entities.enums.OrderStatus;

public class OrderProgram {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		System.out.println("Enter cliente date:");

		System.out.print("Name: ");
		String name = sc.nextLine();

		System.out.print("Email: ");
		String email = sc.nextLine();

		System.out.print("Birth date (DD/MM/YYYY): ");
		LocalDate birthDate = LocalDate.parse(sc.nextLine(), dateFormatter);

		// Cria o cliente
		Client client = new Client(name, email, birthDate);

		System.out.println("Enter order data");
		System.out.print("Status: ");
		// Cria a order e associa o cliente a order
		Order order = new Order(LocalDateTime.now(), OrderStatus.valueOf(sc.nextLine()), client);

		System.out.print("How many items to this order?");
		int quantity = sc.nextInt();

		for (int i = 0; i < quantity; i++) {
			System.out.println("Enter #" + (i + 1) + " item data:");
			System.out.print("Product name: ");
			sc.nextLine();
			String productName = sc.nextLine();

			System.out.print("Product price: ");
			Double productPrice = sc.nextDouble();

			System.out.print("Quantity: ");
			int productQuantity = sc.nextInt();
			// Cria o product
			Product product = new Product(productName, productPrice);
			// Cria o OrderItem e associa o produto a ele
			OrderItem item = new OrderItem(productQuantity, productPrice, product);
			// adiciona o OrdeItem a order
			order.addItem(item);
		}

		System.out.println(order);
		sc.close();
	}

}
