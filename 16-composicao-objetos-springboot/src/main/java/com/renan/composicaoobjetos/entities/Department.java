package com.renan.composicaoobjetos.entities;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/*
 * @Entity informa ao JPA que essa classe representa uma entidade
 * que será persistida no banco de dados.
 *
 * Em outras palavras:
 *
 * Java:
 * Department
 *
 * Banco de dados:
 * tabela department
 */
@Entity

/*
 * @Table permite definir configurações da tabela no banco.
 *
 * Aqui estamos dizendo que a tabela correspondente à entidade
 * Department terá o nome "department".
 *
 * Sem @Table, o JPA poderia utilizar o nome da entidade
 * como base para o nome da tabela.
 */
@Table(name = "department")
public class Department {

	/*
	 * @Id define o campo que será a chave primária (Primary Key)
	 * da tabela.
	 *
	 * No banco:
	 *
	 * id → PRIMARY KEY
	 */
	@Id

	/*
	 * @GeneratedValue informa que o valor do ID será gerado
	 * automaticamente pelo banco/JPA.
	 *
	 * GenerationType.IDENTITY indica que a geração do ID será
	 * delegada ao banco de dados, normalmente utilizando uma
	 * coluna auto-incrementável.
	 *
	 * Exemplo:
	 *
	 * Department 1 → id = 1
	 * Department 2 → id = 2
	 * Department 3 → id = 3
	 */
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	/*
	 * Nome do departamento.
	 *
	 * Como não existe uma anotação @Column especificando outro nome,
	 * o JPA utilizará "name" como nome da coluna.
	 */
	private String name;

	/*
	 * Construtor vazio.
	 *
	 * O JPA precisa de um construtor sem argumentos para conseguir
	 * instanciar a entidade quando estiver lendo dados do banco.
	 *
	 * Por isso, mesmo que você tenha outro construtor, é importante
	 * manter este construtor em entidades JPA.
	 */
	public Department() {
	}

	/*
	 * Construtor utilizado para facilitar a criação de um Department
	 * quando já conhecemos seu nome.
	 *
	 * Exemplo:
	 *
	 * new Department("Sales");
	 */
	public Department(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	/*
	 * hashCode() e equals() foram sobrescritos para definir
	 * como duas entidades Department serão consideradas iguais.
	 *
	 * Neste projeto, a comparação é baseada no ID.
	 *
	 * Isso é importante principalmente quando entidades JPA
	 * são utilizadas em coleções como:
	 *
	 * List
	 * Set
	 * HashSet
	 * etc.
	 */
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	/*
	 * equals() verifica se dois objetos Department representam
	 * a mesma entidade.
	 *
	 * A comparação considera o ID da entidade.
	 */
	@Override
	public boolean equals(Object obj) {

		/*
		 * Se os dois objetos apontam para a mesma referência na memória,
		 * então são obviamente iguais.
		 */
		if (this == obj)
			return true;

		/*
		 * Se o objeto recebido for null, não pode ser igual
		 * a esta entidade.
		 */
		if (obj == null)
			return false;

		/*
		 * Verifica se os objetos são exatamente da mesma classe.
		 */
		if (getClass() != obj.getClass())
			return false;

		/*
		 * Faz o cast do Object para Department para podermos
		 * acessar seus atributos.
		 */
		Department other = (Department) obj;

		/*
		 * Compara os IDs das duas entidades.
		 *
		 * Objects.equals() é utilizado porque o ID é um Long
		 * e pode ser null.
		 */
		return Objects.equals(id, other.id);
	}
}