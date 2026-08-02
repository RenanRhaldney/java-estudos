package entities;

public class ProductV1 {
	public String name;
	public double price;
	public int quantity;
	
	public double totalValueInStock() {
		return price * quantity;
	}
	public void addProduct(int quantity) {
		this.quantity += quantity;
	}
	public void removeProduct(int quantity) {
		//this. serve para referenciar o atributo da minha classe
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
