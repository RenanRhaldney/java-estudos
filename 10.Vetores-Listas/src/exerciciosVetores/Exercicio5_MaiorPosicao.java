package exerciciosVetores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5_MaiorPosicao {

	public static void main(String[] args) {

//		Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
//		o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
//		considerando a primeira posição como 0 (zero). 

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n, posicao = 0;
		double maior = 0;
		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();

		double[] vetor = new double[n];

		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextDouble();
		}

		maior = vetor[0];

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] > maior) {

				maior = vetor[i];
				posicao = i;
			}
		}
		
		System.out.printf("\n\nMAIOR VALOR = %.1f%n", maior);
		System.out.printf("POSICAO DO MAIOR VALOR = %d ", posicao);

		sc.close();
	}
}
