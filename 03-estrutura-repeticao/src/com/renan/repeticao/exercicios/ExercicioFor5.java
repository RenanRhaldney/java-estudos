package com.renan.repeticao.exercicios;

import java.util.Scanner;

public class ExercicioFor5 {

	public static void main(String[] args) {
		/*
		 * Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N =
		 * N * (N-1) * (N-2) * (N-3) * ... * 1. Lembrando que, por definição, fatorial
		 * de 0 é 1.
		 */
		Scanner sc = new Scanner(System.in);
		int qtdRepeticao = sc.nextInt();
		int fatorial = 1;
		for (int i = 1; i <= qtdRepeticao; i++) {
			
			fatorial = fatorial * i;
			
			}
		System.out.printf("Fatorial de %d é %d",qtdRepeticao, fatorial);
		
		sc.close();

	}

}
