package exerciciosMatriz;

import java.util.Scanner;

public class Exercicio1_DiagonalENegativos {

	public static void main(String[] args) {

//		Fazer um programa para ler um número inteiro N e uma matriz de
//		ordem N contendo números inteiros. Em seguida, mostrar a diagonal
//		principal e a quantidade de valores negativos da matriz.

		Scanner sc = new Scanner(System.in);

		// Lê a ordem da matriz (N x N)
		int n = sc.nextInt();

		// Cria uma matriz quadrada com N linhas e N colunas
		int[][] matriz = new int[n][n];

		// Preenche a matriz com os valores informados pelo usuário
		for (int i = 0; i < matriz.length; i++) {
			for (int p = 0; p < matriz[i].length; p++) {
				matriz[i][p] = sc.nextInt();
			}
		}

		// Exibe a diagonal principal da matriz
		System.out.println("Main diagonal:");
		for (int i = 0; i < matriz.length; i++) {
			System.out.print(matriz[i][i] + " ");
		}
		System.out.println();

		// Variável utilizada para contar a quantidade de números negativos
		int contador = 0;

		// Percorre toda a matriz verificando quais elementos são negativos
		for (int i = 0; i < matriz.length; i++) {
			for (int p = 0; p < matriz[i].length; p++) {
				if (matriz[i][p] < 0) {
					contador++;
				}
			}
		}

		// Exibe a quantidade de números negativos encontrados
		System.out.printf("Negative numbers = %d", contador);

		sc.close();
	}
}
