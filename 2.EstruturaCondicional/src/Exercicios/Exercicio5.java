package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// Com base na tabela abaixo, escreva um programa que leia o código de um item e
		// a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.

		// Codigo Especificação Preço
		// 1 Cachorro Quente R$ 4.00
		// 2 X-Salada R$ 4.50
		// 3 X-Bacon R$ 5.00
		// 4 Torrada simples R$ 2.00
		// 5 Refrigerante R$ 1.50
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo, quantidade;
		double valorTotal;

		System.out.println("Qual o código do item que você deseja comprar?");
		codigo = sc.nextInt();
		
		System.out.println("Agora informe a quantidade.");
		quantidade = sc.nextInt();

		if (codigo == 1) {
			valorTotal = quantidade * 4.00;
		} else if (codigo == 2) {
			valorTotal = quantidade * 4.50;
		} else if (codigo == 3) {
			valorTotal = quantidade * 5.00;
		} else if (codigo == 4) {
			valorTotal = quantidade * 2.00;
		} else {
			valorTotal = quantidade * 1.50;
		}

		System.out.printf("Total: R$ %.2f", valorTotal);

		sc.close();
	}

}
