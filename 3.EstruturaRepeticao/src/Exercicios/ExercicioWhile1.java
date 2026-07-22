package Exercicios;

import java.util.Scanner;

public class ExercicioWhile1 {

	public static void main(String[] args) {
		//Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
		//incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
		//impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
		Scanner sc = new Scanner(System.in);
		int senhaCorreta  = 2002;
		int Senha ;
		while (true) {
			System.out.println("Insira sua senha.");
			Senha  = sc.nextInt();
			if(Senha  == senhaCorreta ) {
				System.out.println("Acesso Permitido.");
				break; // Saia do loop quando a senha correta for inserida
			}
			else {
				System.out.println("Senha Invalida.\n");
			}
		}
		sc.close(); // Feche o Scanner ao encerrar o programa
		
	}

}

