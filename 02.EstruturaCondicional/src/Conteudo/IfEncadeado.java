package Conteudo;

import java.util.Scanner;

public class IfEncadeado {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Ïnforme a hora");
		int valor = sc.nextInt();

		if (valor < 12) {
			System.out.println("Bom dia!");
		} else {
			if (valor >= 12 && valor < 18) {
				System.out.println("Boa tarde!");
			} else {
				System.out.println("Boa Noite!");
			}
			
		}

		sc.close();
	}

}
