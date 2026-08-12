package com.renan.sobrecarga.product.application;

import java.util.Locale;
import java.util.Scanner;

import com.renan.sobrecarga.product.entities.ProductV2;

public class ProductProgramV2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter product data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		int quantity = sc.nextInt();
		
		
		
		ProductV2 product = new ProductV2(name, price, quantity);
		
		
		System.out.println("Product data: " + product.toString());
		
		System.out.print("Enter the number of products to be added in stock: ");
		product.addProduct(sc.nextInt());
		
		System.out.println("Updated data: " + product.toString());
		
		System.out.print("Enter the number of products to be removed from stock: ");
		product.removeProduct(sc.nextInt());
		
		System.out.println("Product data: " + product.toString());
		
		sc.close();
	}

}
