package exerciciosEntities;

public class Exercicio1_Employee {
	private int id;
	private String nome;
	private double salario;
		
	public Exercicio1_Employee() {
	}
	
	public Exercicio1_Employee(int id, String nome, double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setName(String nome) {
		this.nome = nome;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public String toString() {
		return id + ", " + nome + String.format(", %.2f", salario);
	}

}
