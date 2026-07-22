package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
		// código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo, quantidade;
		double valorUnitario, valorTotal;
		
		System.out.println("Informe o codigo da peça 1, a quantidade e o valor.");
		codigo = sc.nextInt();
		quantidade = sc.nextInt();
		valorUnitario = sc.nextDouble();
		
		valorTotal = quantidade * valorUnitario;
		System.out.println("Codigo: " + codigo);

		System.out.println("Informe o codigo da peça 2, a quantidade e o valor.");
		codigo = sc.nextInt();
		quantidade = sc.nextInt();
		valorUnitario = sc.nextDouble();
		
		valorTotal = valorTotal + quantidade * valorUnitario;
		System.out.println("Codigo: " + codigo);		
		System.out.printf("VALOR A PAGAR: R$ %.2f", valorTotal);
		
		sc.close();

	}

}
