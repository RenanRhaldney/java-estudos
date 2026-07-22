package exerciciosVetores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1_NumerosNegativos {

	public static void main(String[] args) {

//		Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
//		e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos. 

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// Cria o vetor sem valor
		int[] numeros = null;

		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();

		// verifica se número negativo ou maior que 10
		if (n < 0 || n > 10) {
			System.out.println("Por favor, informar um numero entre 1 a 10");
		} else {
			// Atribui o tamanho do vetor
			numeros = new int[n];
			for (int i = 0; i < numeros.length; i++) {
				System.out.print("Digite um numero: ");
				numeros[i] = sc.nextInt();
			}
			System.out.println("NUMEROS NEGATIVOS:");
			for (int i = 0; i < numeros.length; i++) {
				if (numeros[i] < 0) {
					System.out.println(numeros[i]);
				}
			}
			sc.close();
		}
	}
}
