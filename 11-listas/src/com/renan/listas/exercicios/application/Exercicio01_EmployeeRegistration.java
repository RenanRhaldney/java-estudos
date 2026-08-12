package com.renan.listas.exercicios.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import com.renan.listas.exercicios.entities.Exercicio01_Employee;

public class Exercicio01_EmployeeRegistration {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		/*
		 * Fazer um programa para ler um número inteiro N e depois os dados (id, nome e
		 * salario) de N funcionários. Não deve haver repetição de id.
		 * 
		 * Em seguida, efetuar o aumento de X por cento no salário de um determinado
		 * funcionário. Para isso, o programa deve ler um id e o valor X. Se o id
		 * informado não existir, mostrar uma mensagem e abortar a operação. Ao final,
		 * mostrar a listagem atualizada dos funcionários.
		 * 
		 * Não permitir que o salário possa ser mudado livremente. Um salário só pode
		 * ser aumentado com base em uma operação de aumento por porcentagem dada.
		 */

		//Cria uma lista de objeto Employee
		List<Exercicio01_Employee> listEmployees = new ArrayList<>();
		
		System.out.print("Quantos funcionários serão cadastrados? ");
		int n = sc.nextInt();

		//Cadastro de Employee
		for (int i = 0; i < n; i++) {
			System.out.printf("\nEmployee #%d:\n", i + 1);
			
			System.out.print("Id: ");
			int id = sc.nextInt();
			//Valida se id informado ja existe
			while (hasId(listEmployees, id)) {
				System.out.print("ID já utilizado. Tente novamente.: ");
				id = sc.nextInt();
			}
			
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Salario: ");
			double salario = sc.nextDouble();
			listEmployees.add(new Exercicio01_Employee(id, nome, salario));
		}

		System.out.print("\nInsira o ID do funcionário que receberá o aumento salarial: ");
		int id = sc.nextInt();
		//Encontra o Employee pelo id (Utiliza o stream para pecorrer a lista, filtra utilizando expressao lambda, com findFirst pega o primeiro que encontrar 
		//e orElse(null) caso o objeto nao for encontrado retorna null)
		Exercicio01_Employee employee = listEmployees.stream()
													.filter(e -> e.getId() == id)
													.findFirst()
													.orElse(null);
		//verifica se encontrou o employee caso sim, será calculado o aumento pela porcentagem informada.
		if (employee != null) {
			System.out.print("Insira a porcentagem: ");
			double percentual = sc.nextDouble();
			double novoSalario = employee.getSalario() + (employee.getSalario() * percentual / 100);
			employee.setSalario(novoSalario);
		}
		else {
			System.out.println("Este id não existe!");
		}

		//exibe todos employees que estao na lista
		System.out.println("\nLista de empregados:");
		for(Exercicio01_Employee e : listEmployees) {
			System.out.println(e.toString());
		}
		
		sc.close();
	}

	private static boolean hasId(List<Exercicio01_Employee> listEmployees, int id) {
		Exercicio01_Employee employee = listEmployees.stream().filter(e -> e.getId() == id).findFirst().orElse(null);
		return employee != null;
	}
}
