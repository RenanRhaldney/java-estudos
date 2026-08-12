package com.renan.repeticao.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioDoWhile1 {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler uma temperatura em Celsius e mostrar o equivalente
		 * em Fahrenheit. Perguntar se o usuário deseja repetir (s/n). Caso o usuário
		 * digite "s", repetir o programa.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		char repetir;

		do {
			System.out.print("Digite a temperatura em Celsius: ");
			double celsius = sc.nextDouble();
			double fahrenheit = celsius * ((double)9 / 5) + 32;
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", fahrenheit);
			System.out.print("Deseja repetir (s/n)? ");
			repetir = sc.next().charAt(0);
		} while (repetir == 's');

		System.out.println("Programa finalizado.");

		sc.close();

	}

}
