package com.renan.matriz.exercicios.application;

import java.util.Scanner;

public class Exercicio02_ElementosVizinhos {

	public static void main(String[] args) {
		
		/*
		 * Fazer um programa para ler dois números inteiros M e N, e depois ler uma
		 * matriz de M linhas por N colunas contendo números inteiros, podendo haver
		 * repetições. Em seguida, ler um número inteiro X que pertence à matriz. Para
		 * cada ocorrência de X, mostrar os valores à esquerda, acima, à direita e
		 * abaixo de X, quando houver, conforme exemplo.
		 */
		
		Scanner sc = new Scanner(System.in);
		//ler dois números inteiros 
		int line = sc.nextInt();
		int column = sc.nextInt();
		
		int[][] matriz= new int[line][column];
		
		// Percorre todas as linhas da matriz (matriz.length = número de linhas).
		for(int i = 0; i < matriz.length; i++) {
			
		    // Percorre todas as colunas da linha atual
		    // (matriz[i].length = número de colunas da linha i).
			for(int p = 0; p < matriz[i].length; p++) {
				matriz[i][p] = sc.nextInt();
			}	
		}
		
		int elementoProcurado = sc.nextInt();
		for(int i = 0; i < matriz.length; i++) {
			for(int p = 0; p < matriz[i].length; p++) {
				//Position
				if (matriz[i][p] == elementoProcurado) {
					System.out.printf("Position %d, %d:\n", i, p);
					//LEFT
					if (p != 0) {
						System.out.printf("Left: %d\n", matriz[i][p-1]);
					}
					//RIGHT
					if (p + 1 < matriz[i].length) {
						System.out.printf("Right: %d\n", matriz[i][p+1]);
					}
					//UP
					if (i != 0) {
						System.out.printf("Up: %d\n", matriz[i-1][p]);
					}
					//DOWN
					if (i + 1< matriz.length) {
						System.out.printf("Down: %d\n", matriz[i+1][p]);
					}
				}
			}	
		}
		
		sc.close();
	}
}
