package com.renan.sequencial.exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		//Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto 
		//de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
		
		Scanner sc = new Scanner(System.in);

		int valor1, valor2, valor3, valor4, diferenca;

		System.out.println("Informe o valor 1 e 2.");
		valor1 = sc.nextInt();
		valor2 = sc.nextInt();

		System.out.println("Agora informe o valor 3 e 4");
		valor3 = sc.nextInt();
		valor4 = sc.nextInt();

		diferenca = valor1 * valor2 - valor3 * valor4;
		System.out.print("DIFERENÇA = " + diferenca);
		sc.close();
	}

}
