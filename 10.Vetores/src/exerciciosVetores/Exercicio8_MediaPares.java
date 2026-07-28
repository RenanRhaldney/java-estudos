package exerciciosVetores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio8_MediaPares {

	public static void main(String[] args) {

//		Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
//		aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
//		digitado, mostrar a mensagem "NENHUM NUMERO PAR" 

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double mediaAritmetica = 0;
		int somaPares = 0, qtdPares = 0;

		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();

		int[] vetor = new int[n];

		for (int i = 0; i < vetor.length; i++) {

			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextInt();

			if (vetor[i] % 2 == 0) {
				somaPares += vetor[i];
				qtdPares++;
			}

		}

		if (somaPares != 0 && qtdPares != 0) {
			mediaAritmetica = somaPares / qtdPares;
		}


		if (mediaAritmetica != 0) {
			System.out.printf("MEDIA DOS PARES = %.1f", mediaAritmetica);
		} else {
			System.out.println("NENHUM NUMERO PAR");
		}

		sc.close();
	}
}
