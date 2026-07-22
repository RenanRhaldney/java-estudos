package Exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		// Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números
		
		Scanner sc = new Scanner(System.in);
		
		int numero1, numero2, resultado;
		
		System.out.println("Informe um número:");
		numero1 = sc.nextInt();
		System.out.println("Informe outro número:");
		numero2 = sc.nextInt();
		
		resultado = numero1 + numero2;
		
		System.out.print("SOMA = " + resultado);
		
		sc.close();
	}

}
