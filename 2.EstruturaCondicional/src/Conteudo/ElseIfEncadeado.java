package Conteudo;

import java.util.Scanner;

public class ElseIfEncadeado {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas horas?");
		
		int valor = sc.nextInt();

		// se
		if (valor < 12) {
			System.out.println("Bom dia!");
		// senão se
		} 
		else if (valor >= 12 && valor < 18) {
			System.out.println("Boa tarde!");
		} 
		else {
			System.out.println("Boa noite!");
		}
		sc.close();
	}

}
