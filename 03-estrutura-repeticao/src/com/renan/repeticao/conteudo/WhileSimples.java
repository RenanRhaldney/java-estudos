package com.renan.repeticao.conteudo;

import java.util.Scanner;

public class WhileSimples {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero, soma = 0;
		
		
		System.out.println("Informe um número.");
		numero = sc.nextInt();
		
		while (numero != 0) {
			soma += numero;
			System.out.println("Informe um número.");
			numero = sc.nextInt();
		}
		
		System.out.println(soma);
		
		sc.close();

	}

}
