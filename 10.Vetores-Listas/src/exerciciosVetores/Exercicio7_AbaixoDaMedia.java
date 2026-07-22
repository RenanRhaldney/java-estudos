package exerciciosVetores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio7_AbaixoDaMedia {

	public static void main(String[] args) {

//		Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
//		mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
//		os elementos do vetor que estejam abaixo da média, com uma casa decimal cada. 

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double somaVetor = 0, media = 0;

		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();

		double[] vetor = new double[n];

		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextDouble();
			somaVetor += vetor[i];
		}
		media = somaVetor / vetor.length;

		System.out.printf("\nMEDIA DO VETOR = %.3f%n", media);
		System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] < media) {
				System.out.printf("%.1f%n", vetor[i]);
			}
		}
		sc.close();
	}
}
