package com.renan.vetores.exercicios.application;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio10_AlunosAprovados {

	public static void main(String[] args) {

//		Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
//		no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
//		os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
//		igual a 6.0 (seis). 

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double media = 0;
		
		System.out.print("Quantos alunos serao digitados? ");
		int n = sc.nextInt();
		
		String[] vetorNome = new String[n];
		double[] vetorNota1 = new double[n];
		double[] vetorNota2 = new double[n];
		
		for(int i = 0; i < n; i++) {
			System.out.printf("Digite nome, primeira e segunda nota do %d aluno:\n", i+1);
			sc.nextLine();
			vetorNome[i] = sc.nextLine();
			vetorNota1[i] = sc.nextDouble();
			vetorNota2[i] = sc.nextDouble();
		}
		
		System.out.println("Alunos aprovados:");
		for(int i = 0; i < n; i++) {
			media = (vetorNota1[i] + vetorNota2[i]) / 2;
			if(media >= 6) {
				System.out.println(vetorNome[i]);
			}
		}
		
		sc.close();		
	}
}
