package com.renan.composicaoobjetos.entities;

import java.time.LocalDate;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/*
 * @Entity informa ao JPA que esta classe representa uma entidade
 * que será persistida no banco de dados.
 *
 * Cada objeto HourContract representa um registro na tabela
 * "hourContract".
 */
@Entity

/*
 * Define explicitamente o nome da tabela no banco de dados.
 */
@Table(name = "hourContract")
public class HourContract {

	/*
	 * Chave primária da entidade.
	 */
	@Id

	/*
	 * O ID será gerado automaticamente pelo banco de dados.
	 */
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	/*
	 * Data em que o contrato foi realizado.
	 *
	 * LocalDate representa uma data sem horário.
	 *
	 * Exemplo:
	 *
	 * 2026-08-10
	 */
	private LocalDate date;

	/*
	 * Valor recebido por hora trabalhada.
	 */
	private Double valuePerHour;

	/*
	 * Quantidade de horas trabalhadas no contrato.
	 */
	private Integer hours;

	/*
	 * RELACIONAMENTO MANY-TO-ONE
	 *
	 * Vários contratos podem pertencer ao mesmo Worker.
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
	 * Muitos HourContracts → Um Worker
	 */
	@ManyToOne

	/*
	 * Define a coluna que armazenará a chave estrangeira
	 * na tabela hourContract.
	 *
	 * A tabela terá conceitualmente:
	 *
	 * hourContract
	 * -----------------------------------------
	 * id | date | value_per_hour | hours | worker_id
	 *
	 * worker_id referencia a tabela worker.
	 */
	@JoinColumn(name = "worker_id")
	private Worker worker;

	/*
	 * Construtor vazio exigido pelo JPA.
	 */
	public HourContract() {
	}

	/*
	 * Construtor utilizado para criar um contrato informando:
	 *
	 * - data
	 * - valor por hora
	 * - quantidade de horas
	 *
	 * O Worker não é recebido aqui porque a associação
	 * é feita posteriormente através de setWorker()
	 * ou Worker.addContract().
	 */
	public HourContract(LocalDate date, Double valuePerHour, Integer hours) {
		this.date = date;
		this.valuePerHour = valuePerHour;
		this.hours = hours;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}

	/*
	 * Retorna o Worker ao qual este contrato pertence.
	 */
	public Worker getWorker() {
		return worker;
	}

	/*
	 * Define o Worker ao qual este contrato pertence.
	 *
	 * Esse método é utilizado pelo Worker.addContract():
	 *
	 * contract.setWorker(this);
	 */
	public void setWorker(Worker worker) {
		this.worker = worker;
	}

	/*
	 * Calcula o valor total do contrato.
	 *
	 * Fórmula:
	 *
	 * valor por hora × quantidade de horas
	 *
	 * Exemplo:
	 *
	 * valuePerHour = 50
	 * hours = 10
	 *
	 * totalValue = 50 × 10 = 500
	 */
	public Double totalValue() {
		return valuePerHour * hours;
	}

	/*
	 * Sobrescreve hashCode() herdado de Object.
	 *
	 * O cálculo utiliza o ID da entidade.
	 */
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	/*
	 * Sobrescreve equals() herdado de Object.
	 *
	 * Dois HourContracts serão considerados iguais quando
	 * possuírem o mesmo ID.
	 */
	@Override
	public boolean equals(Object obj) {

		/*
		 * Verifica se é exatamente a mesma referência na memória.
		 */
		if (this == obj)
			return true;

		/*
		 * null nunca será igual a este objeto.
		 */
		if (obj == null)
			return false;

		/*
		 * Verifica se os objetos são da mesma classe.
		 */
		if (getClass() != obj.getClass())
			return false;

		/*
		 * Converte Object para HourContract.
		 */
		HourContract other = (HourContract) obj;

		/*
		 * Compara os IDs das entidades.
		 */
		return Objects.equals(id, other.id);
	}
}