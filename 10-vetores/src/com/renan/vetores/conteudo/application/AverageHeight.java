package com.renan.vetores.conteudo.application;

import java.util.Locale;
import java.util.Scanner;

public class AverageHeight {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int tamanhoDoVetor = sc.nextInt();
		double[] vetor = new double[tamanhoDoVetor];
		double soma = 0;
		double media;
		
		for (int i = 0; i < tamanhoDoVetor; i ++) {
			vetor[i] = sc.nextDouble(); 
			soma += vetor[i];
		}
		
		media = soma / tamanhoDoVetor;
		System.out.printf("AVERAGE HEIGHT = %.2f", media);
		
		sc.close();
	}

}
