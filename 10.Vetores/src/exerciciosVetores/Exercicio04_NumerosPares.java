package exerciciosVetores;

import java.util.Scanner;

public class Exercicio04_NumerosPares {

	public static void main(String[] args) {
		
//		Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
//		tela todos os números pares, e também a quantidade de números pares. 
		
		Scanner sc = new Scanner(System.in);
		
		int n, quantNumeroPar = 0;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();
		
		int[] vetor = new int[n];
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextInt();
		}
				
		System.out.println("\nNUMEROS PARES: ");
		for(int i = 0; i < vetor.length; i++) {
			if( vetor[i] % 2 == 0){
				System.out.printf("%d ", vetor[i]);
				quantNumeroPar ++;
			}
		}

		System.out.printf("\n\nQUANTIDADE DE PARES = %d", quantNumeroPar);
		sc.close();
	}
}
