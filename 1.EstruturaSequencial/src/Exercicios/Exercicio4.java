package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		//Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por 
		//hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas 
		//decimais.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int number;
		double quantidadeHoras, valorHora, salario;
		
		System.out.println("Informe seu number.");
		number = sc.nextInt();
		
		System.out.println("Qual a quantidade de horas que você trabalha ou trabalhou?");
		quantidadeHoras = sc.nextDouble();
		
		System.out.println("Qual o valor que você recebe por hora?");
		valorHora = sc.nextDouble();
		
		salario = quantidadeHoras * valorHora;
		
		System.out.printf("NUMBER = %d\n"
				+ "SALARY = U$ %.2f", number, salario );
		
		sc.close();

	}

}
