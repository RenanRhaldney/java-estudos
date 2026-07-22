package entities;

public class Pessoa {
	// Atributos da classe
	private String nome;
	private int idade;
	private String email;

	// Construtor padrão (sem parâmetros)
	public Pessoa() {
		this.nome = "Não informado";
		this.idade = 0;
		this.email = "não informado";
		System.out.println("Objeto Pessoa criado com valores padrão");
	}

	// Construtor com parâmetros
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
		this.email = "não informado";
		System.out.println("Pessoa criada: " + nome + ", " + idade + " anos");
	}

	// Construtor com todos os parâmetros
	public Pessoa(String nome, int idade, String email) {
		this.nome = nome;
		this.idade = idade;
		this.email = email;
		System.out.println("Pessoa criada: " + nome + ", " + idade + " anos, email: " + email);
	}

	// Construtor usando this() para chamar outro construtor
	public Pessoa(String nome) {
		this(nome, 0, "não informado"); // Chama o construtor com 3 parâmetros
	}

	// Métodos getters
	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public String getEmail() {
		return email;
	}

	// Método para exibir informações
	public void exibirInfo() {
		System.out.println("Nome: " + nome + ", Idade: " + idade + ", Email: " + email);
	}
}
