package exerciciosVetores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02_SomaEMedia {

	public static void main(String[] args) {
//		Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
//		- Imprimir todos os elementos do vetor
//		- Mostrar na tela a soma e a média dos elementos do vetor 
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double soma = 0, media = 0;
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		double[] numeros = new double[n];
		
		for(int i = 0; i < numeros.length; i++ ) {
			System.out.print("Digite um numero: ");
			numeros[i] = sc.nextDouble();
		}
		System.out.print("VALORES = ");
		for(int i = 0; i < numeros.length; i++) {
			System.out.printf("%.1f ", numeros[i]);
			soma += numeros[i];
		}
		media = soma / numeros.length;

		System.out.printf("\nSOMA = %.2f%n", soma);
		System.out.printf("MEDIA = %.2f%n", media);
		
		
		
		
		
		
		sc.close();
	}
}
