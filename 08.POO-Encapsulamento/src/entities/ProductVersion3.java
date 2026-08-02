package entities;

public class ProductVersion3 {
	//Atributos encapsulado com PRIVATE
	private String name;
	private double price;
	private int quantity;

	//Construtor padrão
	public ProductVersion3() {
		super();
	}

	public ProductVersion3(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public ProductVersion3(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	//Metodos GET e SET dos atributos
	//GET = obter o atributo
	public String getName() {
		return name;
	}
	//SET = alterar o valor do atributo
	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
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
		return name + ", $ " 
				+ String.format("%.2f", price) 
				+ ", " 
				+ quantity 
				+ " units, total:  $ "
				+ String.format("%.2f", totalValueInStock());
	}

}
