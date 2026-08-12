package com.renan.condicional.exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem
		// "São Múltiplos" ou "Não são Múltiplos", indicando se os valores lidos são
		// múltiplos entre si. Atenção: os números devem ser digitados em ordem
		// crescente ou decrescente
		Scanner sc = new Scanner(System.in);
		int valor1, valor2;
		boolean saoMultiplos;
		
		System.out.println("Informe 2 números inteiros para descobrimos se eles são múltiplos entre si.");
		valor1 = sc.nextInt();
		valor2 = sc.nextInt();
		saoMultiplos = valor1 % valor2 == 0 || valor2 % valor1 == 0;
	
		
		if (saoMultiplos) {
			System.out.println("São Múltiplos");
		}
		else {
			System.out.println("Não são Múltiplos");
		}
		
		sc.close();

	}

}
