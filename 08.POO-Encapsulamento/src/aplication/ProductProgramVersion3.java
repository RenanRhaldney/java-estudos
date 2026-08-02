package aplication;

import java.util.Locale;
import java.util.Scanner;
import entities.ProductVersion3;

public class ProductProgramVersion3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		ProductVersion3 product = new ProductVersion3();
		
		System.out.println("Enter product data:");
		System.out.print("Name: ");
		product.setName(sc.nextLine());
		System.out.print("Price: ");
		product.setPrice(sc.nextDouble());
		System.out.print("Quantity in stock: ");
		product.addProduct(sc.nextInt());
		
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
