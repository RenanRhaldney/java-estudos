package com.renan.conteudo.exercicios.produto.application;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import com.renan.conteudo.exercicios.produto.entities.Product;

public class ProdutoProgram {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Path path = Paths.get("files/summary.csv");
		List<Product> listProduct = new ArrayList<>();
		
		try (BufferedReader file = Files.newBufferedReader(path)) {

			String line;

			while ((line = file.readLine()) != null) {
                String[] fields = line.split(",");
                String name = fields[0];
                double price = Double.parseDouble(fields[1]);
                int quantity = Integer.parseInt(fields[2]);
                listProduct.add(new Product(name, price, quantity));
			}

		} catch (IOException e) {
			System.out.println("Erro ao ler o arquivo: " + e.getMessage());
		}
		
		for(Product product : listProduct) {
			System.out.printf("%s, %.2f%n", product.getName(), product.totalValue());
		}

	}

}
