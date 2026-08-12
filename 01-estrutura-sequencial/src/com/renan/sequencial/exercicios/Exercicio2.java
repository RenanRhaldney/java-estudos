package com.renan.sequencial.exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// Faça um programa para ler o valor do raio de um círculo, e depois mostrar o
		// valor da área deste círculo com quatro casas decimais
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double PI, raio, area;
		PI = 3.14159;
		
		System.out.println("Qual o valor do raio do cirulo?");
		raio = sc.nextDouble();
		
		area = PI * (raio * raio);
		
		System.out.printf("A = %.4f", area);
		
		sc.close();

	}

}
