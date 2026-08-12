package com.renan.poointroducao.product.application;

import java.util.Locale;
import java.util.Scanner;

import com.renan.poointroducao.product.entities.ProductV1;

public class ProductProgramV1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		ProductV1 product = new ProductV1();
		
		System.out.println("Enter product data:");
		System.out.print("Name: ");
		product.name = sc.nextLine();
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		product.quantity = sc.nextInt();
		
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
