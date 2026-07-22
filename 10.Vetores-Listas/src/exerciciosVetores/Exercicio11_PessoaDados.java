package exerciciosVetores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio11_PessoaDados {

	public static void main(String[] args) {

//		Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
//		que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
//		de homens. 

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double menorAltura, maiorAltura, somaAlturaMulheres = 0, mediaAlturaMulheres = 0;
		int qtdMulheres = 0, qtdHomens = 0;

		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();

		double[] vetorAltura = new double[n];
		char[] vetorGenero = new char[n];

		for (int i = 0; i < n; i++) {
			System.out.printf("Altura da %d pessoa: ", i + 1);
			vetorAltura[i] = sc.nextDouble();

			System.out.printf("Genero da %d pessoa: ", i + 1);
			vetorGenero[i] = Character.toUpperCase(sc.next().charAt(0));
		}

		menorAltura = vetorAltura[0];
		maiorAltura = vetorAltura[0];

		for (int i = 0; i < n; i++) {
			// Pega a menor altura
			if (menorAltura > vetorAltura[i]) {
				menorAltura = vetorAltura[i];
			}
			// Pega a maior altura
			if (maiorAltura < vetorAltura[i]) {
				maiorAltura = vetorAltura[i];
			}

			if (vetorGenero[i] == 'F') {
				somaAlturaMulheres += vetorAltura[i];
				qtdMulheres++;
			} else {
				qtdHomens++;
			}
		}

		mediaAlturaMulheres = somaAlturaMulheres / qtdMulheres;

		System.out.printf("Menor altura = %.2f%n", menorAltura);
		System.out.printf("Maior altura = %.2f%n", maiorAltura);
		System.out.printf("Media das alturas das mulheres = %.2f%n", mediaAlturaMulheres);
		System.out.printf("Numero de homens = %d", qtdHomens);

		sc.close();
	}
}
