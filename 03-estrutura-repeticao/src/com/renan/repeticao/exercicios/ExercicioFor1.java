package com.renan.repeticao.exercicios;

import java.util.Scanner;

public class ExercicioFor1 {

	public static void main(String[] args) {
		/*
		 * Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1
		 * até X, um valor por linha, inclusive o X, se for o caso.
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número.");

		int x = sc.nextInt();
		int resto = 0;

		for (int i = 0; i <= x; i++) {

			resto = i % 2;

			if (resto != 0) {
				System.out.println(i);
			}

		}

		sc.close();

	}

}
