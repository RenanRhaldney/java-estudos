package com.renan.condicional.conteudo;

import java.util.Scanner;

public class IfComposta {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Quantas horas?");
		int valor = sc.nextInt();

		// se
		if (valor < 12) {
			System.out.println("Bom dia!");
		
		} else {
			System.out.println("Boa tarde!");
		}
		
		sc.close();
	}
}
