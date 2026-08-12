package com.renan.sobrecarga.product.entities;

public class ProductV2 {
	public String name;
	public double price;
	public int quantity;
	
	//Sobrecarga é ter mais de 1 construtor na classe e a diferença entre eles são os parametros
	//Construtor padrão 
	public ProductV2() {
		
	}
	
	public ProductV2(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public ProductV2(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public double totalValueInStock() {
		return price * quantity;
	}
	public void addProduct(int quantity) {
		this.quantity += quantity;
	}
	public void removeProduct(int quantity) {
		this.quantity -= quantity;
	}
	public String toString() {
		return name 
				+ ", $ " 
				+ String.format("%.2f", price) + ", " 
				+ quantity 
				+ " units, total:  $ " 
				+ String.format("%.2f", totalValueInStock());
	}

}
