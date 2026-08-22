package com.renan.polimorfismo.exercicios.product.application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import com.renan.polimorfismo.exercicios.product.entities.ImportedProduct;
import com.renan.polimorfismo.exercicios.product.entities.Product;
import com.renan.polimorfismo.exercicios.product.entities.UsedProduct;

public class ProductProgram {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Product> listProduts = new ArrayList<>();
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.print("Enter the number of products: ");
		int quantityProduct = sc.nextInt();
		
		for(int i = 1; i <= quantityProduct; i++) {
			System.out.println("Product #"+ i + " data:");
			
			System.out.print("Common, used or imported (c/u/i)? ");
			char typeProduct = sc.next().charAt(0);
			sc.nextLine();
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Price: ");
			double price = sc.nextDouble();
			
			if (typeProduct == 'c') {
				listProduts.add(new Product(name, price));				
			} 
			else if (typeProduct == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				sc.nextLine();
				LocalDate manufactureDate = LocalDate.parse(sc.nextLine(), formato);
				listProduts.add(new UsedProduct(name, price, manufactureDate));	
			}
			else {
				System.out.print("Customs fee: ");
				double fee = sc.nextDouble();
				listProduts.add(new ImportedProduct(name, price, fee));	
			}
			
		}
		System.out.println();
		System.out.println("PRICE TAGS:");
		for(Product p : listProduts) {
			System.out.println(p.priceTag());
		}
		
		sc.close();
	}

}
