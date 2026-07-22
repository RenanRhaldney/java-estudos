package Conteudo;

import java.util.Scanner;

public class ForSimples {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int soma, entrada;
		soma = 0;
		
		
		for(int i=0 ; i < 3 ; i++) {
			entrada = sc.nextInt();
			soma += entrada;
		}
		
		System.out.printf("Valor total da entrada = %d", soma);
		sc.close();
	
	}
}
