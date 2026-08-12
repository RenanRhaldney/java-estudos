package com.renan.condicional.exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		// Fazer um programa ler um número inteiro e dizer se este número é par ou ímpar.
		Scanner sc = new Scanner(System.in);
		int valor;
		double restoDivisao;
		System.out.println("Informe um número inteiro para informarmos se o valor é par ou ímpar.");
		valor = sc.nextInt();
		
		restoDivisao = valor % 2;
		
		if (restoDivisao == 0) {
			System.out.println("PAR");
		}
		else {
			System.out.println("ÍMPAR");
		}
		sc.close();
	}

}
