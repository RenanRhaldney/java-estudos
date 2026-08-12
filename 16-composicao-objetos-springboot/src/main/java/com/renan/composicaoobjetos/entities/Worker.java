package com.renan.composicaoobjetos.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

/*
 * @Entity informa ao JPA que Worker é uma entidade que será
 * persistida no banco de dados.
 *
 * Cada objeto Worker representa um registro na tabela "worker".
 */
@Entity

/*
 * Define explicitamente o nome da tabela no banco de dados.
 */
@Table(name = "worker")
public class Worker {

	/*
	 * @Id define a chave primária (Primary Key) da entidade.
	 */
	@Id

	/*
	 * O ID será gerado automaticamente.
	 *
	 * IDENTITY indica que a geração do valor será delegada
	 * ao banco de dados.
	 */
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;

	/*
	 * WorkerLevel é um enum.
	 *
	 * Como não existe @Enumerated aqui, o JPA utiliza seu
	 * comportamento padrão para persistir o enum.
	 *
	 * Em muitos projetos é preferível utilizar:
	 *
	 * @Enumerated(EnumType.STRING)
	 *
	 * para armazenar "JUNIOR", "MID_LEVEL" e "SENIOR"
	 * no banco, em vez do índice numérico do enum.
	 */
	private WorkerLevel level;

	private Double baseSalary;

	/*
	 * RELACIONAMENTO MANY-TO-ONE
	 *
	 * Vários Workers podem pertencer ao mesmo Department.
	 *
	 * Exemplo:
	 *
	 * Department: Sales
	 *     ├── Worker: Bob
	 *     ├── Worker: Maria
	 *     └── Worker: Alex
	 *
	 * Portanto:
	 *
	 * Muitos Workers → Um Department
	 */
	@ManyToOne

	/*
	 * Define a coluna que armazenará a chave estrangeira
	 * na tabela worker.
	 *
	 * A tabela ficará conceitualmente assim:
	 *
	 * worker
	 * --------------------------------
	 * id | name | base_salary | department_id
	 *
	 * department_id referencia a tabela department.
	 */
	@JoinColumn(name = "department_id")
	private Department department;

	/*
	 * RELACIONAMENTO ONE-TO-MANY
	 *
	 * Um Worker pode possuir vários contratos.
	 *
	 * Exemplo:
	 *
	 * Worker: Bob
	 *     ├── Contract 1
	 *     ├── Contract 2
	 *     └── Contract 3
	 *
	 * Portanto:
	 *
	 * Um Worker → Muitos HourContracts
	 */
	@OneToMany(
		mappedBy = "worker",
		cascade = CascadeType.ALL,
		orphanRemoval = true
	)
	private List<HourContract> contracts = new ArrayList<>();

	/*
	 * Construtor vazio exigido pelo JPA para conseguir
	 * instanciar a entidade.
	 */
	public Worker() {
	}

	/*
	 * Construtor utilizado para criar um Worker já informando
	 * seus principais dados.
	 *
	 * O ID não é recebido porque ele será gerado automaticamente
	 * pelo banco.
	 */
	public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}

	/*
	 * Adiciona um novo contrato à lista de contratos do Worker.
	 *
	 * Além de adicionar o contrato à lista:
	 *
	 *     contracts.add(contract);
	 *
	 * também associamos o contrato ao Worker:
	 *
	 *     contract.setWorker(this);
	 *
	 * Isso é importante porque o relacionamento entre Worker
	 * e HourContract possui dois lados.
	 *
	 * "this" representa o Worker atual.
	 */
	public void addContract(HourContract contract) {
		contracts.add(contract);
		contract.setWorker(this);
	}

	/*
	 * Remove um contrato do Worker.
	 *
	 * Primeiro remove o contrato da lista:
	 *
	 *     contracts.remove(contract);
	 *
	 * Depois remove a referência do contrato para o Worker:
	 *
	 *     contract.setWorker(null);
	 *
	 * Como orphanRemoval = true, essa remoção também pode
	 * fazer com que o JPA remova o contrato correspondente
	 * do banco de dados.
	 */
	public void removeContract(HourContract contract) {
		contracts.remove(contract);
		contract.setWorker(null);
	}

	public Long getId() {
		return id;
	}

	/*
	 * Calcula a renda do Worker em determinado ano e mês.
	 *
	 * A renda começa com o salário base:
	 *
	 *     double sum = baseSalary;
	 *
	 * Depois percorremos todos os contratos do trabalhador.
	 *
	 * Para cada contrato verificamos:
	 *
	 *     - ano do contrato
	 *     - mês do contrato
	 *
	 * Se o contrato pertence ao período solicitado,
	 * seu valor é acrescentado à renda.
	 *
	 * Exemplo:
	 *
	 * Salário base:       3000
	 * Contrato 1:         500
	 * Contrato 2:         700
	 *
	 * Renda no mês:
	 *
	 * 3000 + 500 + 700 = 4200
	 */
	public Double income(Integer year, Integer month) {
		double sum = baseSalary;
		for (HourContract c : contracts) {
			int c_year = c.getDate().getYear();
			int c_month = c.getDate().getMonthValue();
			if (c_year == year && c_month == month) {
				sum += c.totalValue();
			}
		}
		return sum;
	}

	/*
	 * Sobrescreve o hashCode() herdado de Object.
	 *
	 * O hashCode é baseado no ID da entidade.
	 *
	 * Isso mantém a implementação consistente com equals().
	 */
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	/*
	 * Sobrescreve o equals() herdado de Object.
	 *
	 * Dois Workers serão considerados iguais quando
	 * possuírem o mesmo ID.
	 */
	@Override
	public boolean equals(Object obj) {

		/*
		 * Se for exatamente a mesma referência na memória,
		 * os objetos são iguais.
		 */
		if (this == obj)
			return true;

		/*
		 * Um objeto null não pode ser igual a este Worker.
		 */
		if (obj == null)
			return false;

		/*
		 * Verifica se o objeto pertence à mesma classe.
		 */
		if (getClass() != obj.getClass())
			return false;

		/*
		 * Converte Object para Worker.
		 */
		Worker other = (Worker) obj;

		/*
		 * Compara os IDs.
		 */
		return Objects.equals(id, other.id);
	}
}